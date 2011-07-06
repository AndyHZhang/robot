package com.robot.study.chinese0;

import android.content.Intent;
import android.os.Bundle;

import com.robot.study.WelcomeActivity;

public class Welcome extends WelcomeActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setWelcomeImage(R.drawable.welcome);

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
	
	public int getWelcomeSound() {
		return R.raw.snd_1;
	}
}
