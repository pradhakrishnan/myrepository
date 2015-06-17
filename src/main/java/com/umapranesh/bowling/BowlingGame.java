package com.umapranesh.bowling;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	private String name;
	private List<Frame> frames = new ArrayList<Frame>(10);

	public BowlingGame() {
		super();
	}

	public BowlingGame(String playerName) {
		this.name = playerName;
	}
	
	public BowlingGame(String name, List<Frame> frames) {
		super();
		this.name = name;
		this.frames = frames;
	}

	public void addFrame(int attepmts, int score, Frame frame){
		Frame fr = new Frame();
		
		frames.add(frame);
	}
	
	public List<Frame> getFrames(){
		return frames;
	}
}
