package com.robot.evaluation;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TableReport extends Activity {

	private final Calendar mCurrentCalendar = Calendar.getInstance();
	private final int mCurYear = mCurrentCalendar.get(Calendar.YEAR);
	private final int mCurMonth = mCurrentCalendar.get(Calendar.MONTH) + 1;
	private final int mCurDay = mCurrentCalendar.get(Calendar.DAY_OF_MONTH);

	private TextView mEvaluationNo;
	private TextView mEvaluationDate;

	private TextView mChildName;
	private TextView mGender;
	private TextView mBirthday;
	private TextView mAgeInMonth;
	
	private TextView mMotherName;
	private TextView mMotherPhone;
	private TextView mFatherName;
	private TextView mFatherPhone;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.table_report);

		// TODO just for test, should be remove later
		RecordData.load(this, 1);

		mEvaluationNo = (TextView) findViewById(R.id.evaluation_no);
		mEvaluationNo.setText(RecordData.index);

		mEvaluationDate = (TextView) findViewById(R.id.evaluation_date);
		mEvaluationDate.setText("" + mCurYear + "年" + mCurMonth + "月" + mCurDay
				+ "日");

		mChildName = (TextView) findViewById(R.id.child_name);
		mChildName.setText(RecordData.childName);

		mGender = (TextView) findViewById(R.id.gender);
		mGender.setText("boy".equals(RecordData.gender) ? "男" : "女");

		mBirthday = (TextView) findViewById(R.id.birthday);
		mBirthday.setText(RecordData.birth_year + "年" + RecordData.birth_month
				+ "月" + RecordData.birth_day + "日");
		
		mAgeInMonth = (TextView) findViewById(R.id.age_in_month);
		mAgeInMonth.setText("" + RecordData.age_in_days / 30);
		
		mMotherName = (TextView) findViewById(R.id.mother_name);
		mMotherName.setText(RecordData.motherName);
		
		mMotherPhone = (TextView) findViewById(R.id.mother_phone);
		mMotherPhone.setText(RecordData.homeNumber);
		
		mFatherName = (TextView) findViewById(R.id.father_name);
		mFatherName.setText(RecordData.fatherName);
		
		mFatherPhone = (TextView) findViewById(R.id.father_phone);
		mFatherPhone.setText(RecordData.phoneNumber);
	}

}
