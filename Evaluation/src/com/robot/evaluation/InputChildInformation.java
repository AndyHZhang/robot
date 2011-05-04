package com.robot.evaluation;

import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;

public class InputChildInformation extends Activity implements OnClickListener {

	private static final int DATE_DIALOG_ID = 0;

	private static final long DAY_IN_SECOND = 24 * 60 * 60;

	private EditText mChildName;
	private RadioGroup mGender;
	private EditText mBirthYear;
	private EditText mBirthMonth;
	private EditText mBirthDay;
	private EditText mAgeInDays;
	private EditText mEvaluationCount;

	private final Calendar mCurrentCalendar = Calendar.getInstance();
	private final int mCurYear = mCurrentCalendar.get(Calendar.YEAR);
	private final int mCurMonth = mCurrentCalendar.get(Calendar.MONTH) + 1;
	private final int mCurDay = mCurrentCalendar.get(Calendar.DAY_OF_MONTH);
	private EditText mCurrentYear;
	private EditText mCurrentMonth;
	private EditText mCurrentDay;

	private Button mEnter;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.input_child_information);

		mChildName = (EditText) findViewById(R.id.child_name);
		mGender = (RadioGroup) findViewById(R.id.gender);
		mBirthYear = (EditText) findViewById(R.id.birth_year);
		mBirthMonth = (EditText) findViewById(R.id.birth_month);
		mBirthDay = (EditText) findViewById(R.id.birth_day);
		mCurrentYear = (EditText) findViewById(R.id.evaluation_year);
		mCurrentMonth = (EditText) findViewById(R.id.evaluation_month);
		mCurrentDay = (EditText) findViewById(R.id.evaluation_day);
		mAgeInDays = (EditText) findViewById(R.id.age_in_days);
		mEvaluationCount = (EditText) findViewById(R.id.evaluation_count);

		mBirthYear.setOnClickListener(this);
		mBirthMonth.setOnClickListener(this);
		mBirthMonth.setOnClickListener(this);

		mEnter = (Button) findViewById(R.id.enter_or_exit);
		if (mEnter != null) {
			mEnter.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					saveUserInput();

					finish();

					startActivity(new Intent(InputChildInformation.this,
							InputParentInformation.class));
				}
			});
		}

		readRecordData();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		RandomAction.start(this);
	}
	
	@Override
	public void onPause() {
		super.onPause();
		
		RandomAction.stop();
	}

	public void onClick(View v) {
		showDialog(DATE_DIALOG_ID);
	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
			return new DatePickerDialog(this, mDateSetListener,
					mCurrentCalendar.get(Calendar.YEAR), mCurrentCalendar
							.get(Calendar.MONTH), mCurrentCalendar
							.get(Calendar.DAY_OF_MONTH));
		}
		return null;
	}

	private DatePickerDialog.OnDateSetListener mDateSetListener = new DatePickerDialog.OnDateSetListener() {

		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			setBirtyday(year, monthOfYear + 1, dayOfMonth);
		}
	};

	private void setBirtyday(String year, String month, String day) {
		if (year == null || month == null || day == null) {
			return;
		}

		setBirtyday(Integer.parseInt(year), Integer.parseInt(month), Integer
				.parseInt(day));
	}

	private void setBirtyday(int year, int month, int day) {
		mBirthYear.setText(Integer.toString(year));
		mBirthMonth.setText(Integer.toString(month));
		mBirthDay.setText(Integer.toString(day));

		long ageInDays = getAgeInDays(year, month, day);
		mAgeInDays.setText(Long.toString(ageInDays));
	}

	private long getAgeInDays(int year, int month, int day) {
		final Date birthday = new Date(year - 1900, month, day);
		final Date current = new Date(mCurYear - 1900, mCurMonth, mCurDay);

		return (current.getTime() - birthday.getTime()) / 1000 / DAY_IN_SECOND;
	}

	private void readRecordData() {
		mChildName.setText(RecordData.childName);
		mGender.check("boy".equals(RecordData.gender) ? R.id.boy : R.id.girl);

		setBirtyday(RecordData.birth_year, RecordData.birth_month,
				RecordData.birth_day);

		mCurrentYear.setText(Integer.toString(mCurYear));
		mCurrentMonth.setText(Integer.toString(mCurMonth));
		mCurrentDay.setText(Integer.toString(mCurDay));

		// always increase once
		RecordData.evaluation_count++;
		mEvaluationCount.setText(Integer.toString(RecordData.evaluation_count));
	}

	private void saveUserInput() {
		RecordData.childName = mChildName.getEditableText().toString();
		RecordData.gender = (mGender.getCheckedRadioButtonId() == R.id.boy) ? "boy"
				: "girl";
		RecordData.birth_year = mBirthYear.getEditableText().toString();
		RecordData.birth_month = mBirthMonth.getEditableText().toString();
		RecordData.birth_day = mBirthDay.getEditableText().toString();
	    
		try {
			RecordData.age_in_days = Integer.parseInt(mAgeInDays.getEditableText().toString());
		} catch (NumberFormatException e) {}
	}

}
