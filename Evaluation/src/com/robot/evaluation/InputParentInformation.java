package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class InputParentInformation extends Activity {
	
	private EditText mMotherName;
	private EditText mMotherJob;
	private EditText mMotherEducation;
	private EditText mMotherWorkplace;
	private EditText mFatherName;
	private EditText mFatherJob;
	private EditText mFatherEducation;
	private EditText mFatherWorkplace;
	private EditText mHomeNumber;
	private EditText mPhoneNumber;
	private EditText mHomeAddress;
	private EditText mZipCode;
	private EditText mEmailAddress;
	
	private Button mEnter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.input_parent_information);
		
		mMotherName = (EditText) findViewById(R.id.mother_name);
		mMotherJob = (EditText) findViewById(R.id.mother_job);
		mMotherEducation = (EditText) findViewById(R.id.mother_education);
		mMotherWorkplace = (EditText) findViewById(R.id.mother_workplace);
		mFatherName = (EditText) findViewById(R.id.father_name);
		mFatherJob = (EditText) findViewById(R.id.father_job);
		mFatherEducation = (EditText) findViewById(R.id.father_education);
		mFatherWorkplace = (EditText) findViewById(R.id.father_workplace);
		mHomeNumber = (EditText) findViewById(R.id.home_number);
		mPhoneNumber = (EditText) findViewById(R.id.phone_number);
		mHomeAddress = (EditText) findViewById(R.id.home_address);
		mZipCode = (EditText) findViewById(R.id.zip_code);
		mEmailAddress = (EditText) findViewById(R.id.email_address);
		
		mEnter = (Button) findViewById(R.id.enter_or_exit);
		if (mEnter != null) {
			mEnter.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					saveUserInput();
					
					finish();
					
					startActivity(new Intent(InputParentInformation.this,
							InputGrowInformation.class));
				}
			});
		}
		
		readRecordData();
	}
	
	private void readRecordData() {
		mMotherName.setText(RecordData.motherName);
		mMotherJob.setText(RecordData.motherJob);
		mMotherEducation.setText(RecordData.motherEducation);
		mMotherWorkplace.setText(RecordData.motherWorkplace);
		mFatherName.setText(RecordData.fatherName);
		mFatherJob.setText(RecordData.fatherJob);
		mFatherEducation.setText(RecordData.fatherEducation);
		mFatherWorkplace.setText(RecordData.fatherWorkplace);
		mHomeNumber.setText(RecordData.homeNumber);
		mPhoneNumber.setText(RecordData.phoneNumber);
		mHomeAddress.setText(RecordData.homeAddress);
		mZipCode.setText(RecordData.zipCode);
		mEmailAddress.setText(RecordData.emailAddress);
	}
	
	private void saveUserInput() {
		RecordData.motherName = mMotherName.getEditableText().toString();
		RecordData.motherJob = mMotherJob.getEditableText().toString();
		RecordData.motherEducation = mMotherEducation.getEditableText().toString();
		RecordData.motherWorkplace = mMotherWorkplace.getEditableText().toString();
		RecordData.fatherName = mFatherName.getEditableText().toString();
		RecordData.fatherJob = mFatherJob.getEditableText().toString();
		RecordData.fatherEducation = mFatherEducation.getEditableText().toString();
		RecordData.fatherWorkplace = mFatherWorkplace.getEditableText().toString();
		RecordData.homeNumber = mHomeNumber.getEditableText().toString();
		RecordData.phoneNumber = mPhoneNumber.getEditableText().toString();
		RecordData.homeAddress = mHomeAddress.getEditableText().toString();
		RecordData.zipCode = mZipCode.getEditableText().toString();
		RecordData.emailAddress = mEmailAddress.getEditableText().toString();
	}
}
