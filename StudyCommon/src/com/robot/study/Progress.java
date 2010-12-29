package com.robot.study;

import java.util.ArrayList;

public class Progress {
	
	private ArrayList<Course> mCourses = new ArrayList<Course>();
	private int mIcon;
	
	public Progress(int icon) {
		mIcon = icon;
	}
	
	public Progress addCourse(Course c) {
		mCourses.add(c);
		return this;
	}
	
	public ArrayList<Course> getCourses() {
		return mCourses;
	}
	
	public int getCourseIcon() {
		return mIcon;
	}
}
