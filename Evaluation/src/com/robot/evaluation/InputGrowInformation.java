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
		
		setContentView(R.layout.input_grow_information);

		mWeight = (EditText) findViewById(R.id.weight);
		mHeight = (EditText) findViewById(R.id.height);
		mHead = (EditText) findViewById(R.id.head);
		mBust = (EditText) findViewById(R.id.bust);
		mTeeth = (EditText) findViewById(R.id.teeth);

		mEnter = (Button) findViewById(R.id.enter_or_exit);
		if (mEnter != null) {
			mEnter.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					saveUserInput();
					
					// we should save all user data here
					// because it's the last activity request user information
					RecordData.save(InputGrowInformation.this);

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
		if (RecordData.weight != 0)
			mWeight.setText(Float.toString(RecordData.weight));
		if (RecordData.height != 0)
			mHeight.setText(Float.toString(RecordData.height));
		if (RecordData.head != 0)
			mHead.setText(Float.toString(RecordData.head));
		if (RecordData.bust != 0)
			mBust.setText(Float.toString(RecordData.bust));
		if (RecordData.teeth != 0)
			mTeeth.setText(Float.toString(RecordData.teeth));
	}

	private void saveUserInput() {
		try {
			RecordData.weight = Float.parseFloat(mWeight.getEditableText().toString());
		} catch (NumberFormatException e){}
		try {
			RecordData.height = Float.parseFloat(mHeight.getEditableText().toString());
		} catch (NumberFormatException e){}
		try {
			RecordData.head = Float.parseFloat(mHead.getEditableText().toString());
		} catch (NumberFormatException e){}
		try {
			RecordData.bust = Float.parseFloat(mBust.getEditableText().toString());
		} catch (NumberFormatException e){}
		try {
			RecordData.teeth = Float.parseFloat(mTeeth.getEditableText().toString());
		} catch (NumberFormatException e){}
	}
}
