package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Welcome extends Activity {

	Handler mHandler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		mHandler.postDelayed(new Runnable() {
			public void run() {
				finish();
				startActivity(new Intent(Welcome.this,
						InputEvaulationNumber.class));
			}
		}, 3000);
	}
}
