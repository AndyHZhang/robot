package com.robot.study;

public class Course {
	private int mIcon;
	private String[] mText;
	
	public Course(int icon, String[] text) {
		mIcon = icon;
		mText = text;
	}
	
	public int getIcon() {
		return mIcon;
	}
	
	public String[] getText() {
		return mText;
	}
}
