package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InputEvaulationNumber extends Activity {

	private Button mEnter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.input_evaluation_number);

		mEnter = (Button) findViewById(R.id.enter_or_exit);
		if (mEnter != null) {
			mEnter.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					startActivity(new Intent(InputEvaulationNumber.this,
							Login.class));
				}
			});
		}
	}

}
