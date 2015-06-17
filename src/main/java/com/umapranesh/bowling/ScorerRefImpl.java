package com.umapranesh.bowling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScorerRefImpl implements Scorer {
	private List<String> playerName = new ArrayList<String>();
	private Integer noOfPlayers;
	private Map<String, BowlingGame> list = new HashMap<String, BowlingGame>();
	
	public void init(InputStream inputStream) throws InvalidInput {
		
		byte[] buffer = new byte[1000];
		int total = 0;
        int nRead = 0;
        BowlingGame game;
        try {
        	String str = null;
			while((nRead = inputStream.read(buffer)) != -1) {
				str = new String(buffer);
			}
			String [] arr = str.split("\n");
			int length = arr.length;
			int index = 0;
			for(String val : arr){
				if(index == 0){
					noOfPlayers = Integer.parseInt(val);
				}
				if(isName(val)){
					playerName.add(val);
					game = new BowlingGame(val);
					list.put(val, game);
				}
				int startIndex = noOfPlayers + 1;
				index++;
			}
			System.out.println("No of player "+ noOfPlayers.intValue());
			System.out.println("Players"+ playerName);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

	private boolean isName(String val) {
		return val.matches("[a-zA-Z\\s]+");
	}

	public List<String> getPlayers() {
		return playerName;
	}

	public Integer getPlayerScore(String player) throws InvalidInput {
		BowlingGame game = list.get(player);
		List<Frame> frameList = game.getFrames();
		return null;
	}

}
