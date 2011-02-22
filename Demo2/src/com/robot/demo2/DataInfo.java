package com.robot.demo2;

public class DataInfo {
	private String mString;
	private String mSound;
	private short mAction;
	
	public DataInfo(String string, String sound, short action) {
		mString = string;
		mSound = sound;
		mAction = action;
	}
	
	public String getString() {
		return mString;
	}
	
	public String getSound() {
		return mSound;
	}
	
	public short getAction() {
		return mAction;
	}
}
