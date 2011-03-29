package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class InputGrowInformation extends Activity {

	private EditText mWeight;
	private EditText mHeight;
	private EditText mHead;
	private EditText mBust;
	private EditText mTeeth;

	private Button mEnter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mWeight = (EditText) findViewById(R.id.weight);
		mHeight = (EditText) findViewById(R.id.height);
		mHead = (EditText) findViewById(R.id.head);
		mBust = (EditText) findViewById(R.id.bust);
		mTeeth = (EditText) findViewById(R.id.teeth);

		setContentView(R.layout.input_grow_information);

		mEnter = (Button) findViewById(R.id.enter_or_exit);
		if (mEnter != null) {
			mEnter.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					saveUserInput();

					finish();

					Intent i = new Intent(InputGrowInformation.this,
							Evaluation.class);
					i.putExtra(Const.ACTION_MONTH_AGE,
							RecordData.age_in_days / 30);
					startActivity(i);
				}
			});
		}

		readRecordData();
	}

	private void readRecordData() {
		mWeight.setText(Float.toString(RecordData.weight));
		mHeight.setText(Float.toString(RecordData.height));
		mHead.setText(Float.toString(RecordData.head));
		mBust.setText(Float.toString(RecordData.bust));
		mTeeth.setText(Float.toString(RecordData.teeth));
	}

	private void saveUserInput() {
		RecordData.weight = Float.parseFloat(mWeight.getEditableText().toString());
		RecordData.height = Float.parseFloat(mHeight.getEditableText().toString());
		RecordData.head = Float.parseFloat(mHead.getEditableText().toString());
		RecordData.bust = Float.parseFloat(mBust.getEditableText().toString());
		RecordData.teeth = Float.parseFloat(mTeeth.getEditableText().toString());
	}
}
