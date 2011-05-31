package com.robot.study.subtraction;

import com.robot.study.CoursePlayerActivity;

public class CoursePlayer extends CoursePlayerActivity {
	
	public int getViewId() {
		return Config.COURSE_PLAYER_LAYOUT_ID;
	}
	
	public int getTextId() {
		return 0;
	}
	
	public int getImageId() {
		return Config.IMAGE_WIDGET_ID;
	}
	
	public int getNextCourseResId() {
		return Config.STRING_NEXT_COURSE;
	}
	
	public int getSound(String s) {
		return Config.mSoundMap.get(s);
	}
	
	public int getImage(String s) {
		return Config.mImageMap.get(s);
	}
	
	public int getSoundId() {
		return R.raw.snd_3;
	}
}
