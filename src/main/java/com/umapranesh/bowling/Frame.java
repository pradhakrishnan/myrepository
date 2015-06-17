package com.umapranesh.bowling;

import java.util.HashMap;
import java.util.Map;

public class Frame {
	private int noOfPinsRemaining = 10;
	private int noOfChancesUsed = 0;
	private int noOfChancesRemaining = 2;
	private Map<Integer, Integer> scoreMap = new HashMap<Integer, Integer>();
	
	public Frame(){
		
	}
	public Frame(Map<Integer, Integer> scoreMap){
		this.scoreMap = scoreMap;
	}

	public boolean isSpare() {
		return (noOfChancesRemaining == 0 && noOfChancesUsed ==2 && noOfPinsRemaining == 0);
	}

	public boolean isStrike() {
		return (noOfChancesRemaining == 1 && noOfChancesUsed ==1 && noOfPinsRemaining ==0);
	}
	
	public boolean isOpenFrame() {
		return (noOfChancesRemaining == 0 && noOfChancesUsed ==2 && noOfPinsRemaining != 0);
	}
}
