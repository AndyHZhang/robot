package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputEvaulationNumber extends Activity {

	private EditText mEditor;
	private Button mEnter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.input_evaluation_number);

		mEditor = (EditText) findViewById(R.id.evaluation_no);

		mEnter = (Button) findViewById(R.id.enter_or_exit);
		if (mEnter != null) {
			mEnter.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					try {
						int index = Integer.parseInt(mEditor.getEditableText()
								.toString());
						RecordData.load(InputEvaulationNumber.this, index);

						finish();

						startActivity(new Intent(InputEvaulationNumber.this,
								InputChildInformation.class));
					} catch (NumberFormatException e) {
						Toast.makeText(InputEvaulationNumber.this, "«Î ‰»Î”––ß±‡∫≈",
								3000).show();
					}
				}
			});
		}
	}

}
