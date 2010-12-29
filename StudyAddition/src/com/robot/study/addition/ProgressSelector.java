package com.robot.study.addition;

import com.robot.study.ProgressSelectorActivity;

public class ProgressSelector extends ProgressSelectorActivity {
	
	public int getViewId() {
		return Config.PROGRESS_SELECTOR_LAYOUT_ID;
	}
	
	public int getGridId() {
		return Config.GRID_WIDGET_ID;
	}
	
	public int getCourseIcon(int position) {
		return Config.getProgress().get(position).getCourseIcon();
	}
	
	public int getGridCellCount() {
		return Config.getProgress().size();
	}
	
	public int getGridColumn() {
		return Config.PROGRESS_COLUMN;
	}
	
	public String getNextPackageName() {
		return Config.PACKAGE_NAME;
	}
	
	public String getNextActivityName() {
		return Config.COURSE_SELECTOR_ACTIVITY_NAME;
	}

}
