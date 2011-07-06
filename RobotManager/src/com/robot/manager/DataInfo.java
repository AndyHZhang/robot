package com.robot.manager;

public class DataInfo {
	private short mInterrupt;
	private String mSound;
	private short mAction;
	
	public DataInfo(short interrupt, String sound, short action) {
		mInterrupt = interrupt;
		mSound = sound;
		mAction = action;
	}
	
	public short getInterrupt() {
		return mInterrupt;
	}
	
	public String getSound() {
		return mSound;
	}
	
	public short getAction() {
		return mAction;
	}
}
