package com.robot.study.addition;

import com.robot.study.CourseSelectorActivity;
import com.robot.study.Progress;

public class CourseSelector extends CourseSelectorActivity {
	
	public int getViewId() {
		return Config.COURSE_SELECTOR_LAYOUT_ID;
	}
	
	public int getGalleryId() {
		return Config.GALLERY_WIDGET_ID;
	}
	
	public int getGridColumn() {
		return Config.COURSE_COLUMN;
	}
	
	public Progress getProgress(int index) {
		return Config.getProgress().get(index);
	}
	
	public String getNextPackageName() {
		return Config.PACKAGE_NAME;
	}
	
	public String getNextActivityName() {
		return Config.COURSE_PLAYER_ACTIVITY_NAME;
	}

}