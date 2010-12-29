package com.robot.study.addition;

import com.robot.study.WelcomeActivity;

public class Welcome extends WelcomeActivity {
	public int getViewId() {
		return Config.WELCOME_LAYOUT_ID;
	}
	
	public String getNextPackageName() {
		return Config.PACKAGE_NAME;
	}
	
	public String getNextActivityName() {
		return Config.PROGRESS_SELECTOR_ACTIVITY_NAME;
	}
}
