package com.android.language;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Welcome extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		findViewById(R.id.welcome_background).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
				startActivity(new Intent(Welcome.this, SelectLanguage.class));
			}
		});
	}

}
