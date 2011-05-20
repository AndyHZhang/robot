package com.robot.language.unit02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Welcome extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		View v = findViewById(R.id.welcome_background);
		v.setBackgroundResource(R.drawable.welcome);
		v.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
				//startActivity(new Intent(Welcome.this, LanguageSelector.class));
				Intent i = new Intent();
				i.setClassName("com.robot.language.unit0201", "com.robot.language.unit0201.Test");
				startActivity(i);
			}
		});
	}
}
