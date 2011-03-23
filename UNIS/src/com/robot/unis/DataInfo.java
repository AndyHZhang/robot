package com.robot.unis;

public class DataInfo {
	private String mString;
	private String mImage;
	private String mSound;
	private short mAction;
	
	public DataInfo(String string, String image, String sound, short action) {
		mString = string;
		mImage = image;
		mSound = sound;
		mAction = action;
	}
	
	public String getString() {
		return mString;
	}
	
	public String getImage() {
		return mImage;
	}
	
	public String getSound() {
		return mSound;
	}
	
	public short getAction() {
		return mAction;
	}
}
