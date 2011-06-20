package com.robot.study.addition;

import android.content.Intent;
import android.os.Bundle;

import com.robot.study.SettingsActivity;

public class Settings extends SettingsActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setBackgroundImage(R.drawable.settings_bg);

		setOnNextActivityListener(new OnNextActivityListener() {
			public void onNextActivity() {
				String packageName = getPackageName();
				String activityName = ProgressSelector.class.getName();
				startActivity(new Intent().setClassName(packageName,
						activityName));

				finish();
			}
		});
	}
}
