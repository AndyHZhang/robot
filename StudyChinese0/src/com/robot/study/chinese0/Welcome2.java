package com.robot.study.chinese0;

import android.content.Intent;
import android.os.Bundle;

import com.robot.study.WelcomeActivity2;

public class Welcome2 extends WelcomeActivity2 {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setWelcomeImage(R.drawable.welcome_2);

		setOnNextActivityListener(new OnNextActivityListener() {
			public void onNextActivity() {
				String packageName = getPackageName();
				String activityName = Welcome2.class.getName();
				startActivity(new Intent().setClassName(packageName,
						activityName));

				finish();
			}
		});
	}
}
