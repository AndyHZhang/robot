package com.robot.study.chinese0;

import com.robot.study.CoursePlayerActivity;

public class CoursePlayer extends CoursePlayerActivity {
	
	public int getViewId() {
		return Config.COURSE_PLAYER_LAYOUT_ID;
	}
	
	public int getTextId() {
		return Config.TEXT_WIDGET_ID;
	}
	
	public int getNextCourseResId() {
		return Config.STRING_NEXT_COURSE;
	}
	
	public int getSound(String s) {
		return Config.mSoundMap.get(s);
	}
}
