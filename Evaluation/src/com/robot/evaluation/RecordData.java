package com.robot.evaluation;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class RecordData {
	public static int index;

	public static final String CHILD_NAME = "child_name";
	public static final String GENDER = "gender";
	public static final String BIRTH_YEAR = "birty_year";
	public static final String BIRTH_MONTH = "birty_month";
	public static final String BIRTH_DAY = "birty_day";
	// no age_in_days here
	public static final String EVALUATION_COUNT = "evaluatio_count";
	// no evaluation_year here
	// no evaluation_month here
	// no evaluation_day here
	public static final String MOTHER_NAME = "mother_name";
	public static final String MOTHER_JOB = "mother_job";
	public static final String MOTHER_EDUCATION = "mother_education";
	public static final String MOTHER_WORKPLACE = "mother_workplace";
	public static final String FATHER_NAME = "father_name";
	public static final String FATHER_JOB = "father_job";
	public static final String FATHER_EDUCATION = "father_education";
	public static final String FATHER_WORKPLACE = "father_workplace";
	public static final String HOME_NUMBER = "home_number";
	public static final String PHONE_NUMBER = "phone_number";
	public static final String HOME_ADDRESS = "home_address";
	public static final String ZIP_CODE = "zip_code";
	public static final String EMAIL_ADDRESS = "email_address";
	public static final String WEIGHT = "weight";
	public static final String HEIGHT = "height";
	public static final String HEAD = "head";
	public static final String BUST = "bust";
	public static final String TEETH = "teeth";

	public static String childName;
	public static String gender; // boy or gril
	public static String birth_year;
	public static String birth_month;
	public static String birth_day;
	public static int age_in_days; // need calculate
	public static int evaluation_count; // need refresh everytime login
	public static int evaluation_year; // need refresh everytime login
	public static int evaulation_month; // need refresh everytime login
	public static int evaulation_day; // need refresh everytime login

	public static String motherName;
	public static String motherJob;
	public static String motherEducation;
	public static String motherWorkplace;
	public static String fatherName;
	public static String fatherJob;
	public static String fatherEducation;
	public static String fatherWorkplace;
	public static String homeNumber;
	public static String phoneNumber;
	public static String homeAddress;
	public static String zipCode;
	public static String emailAddress;

	public static float weight;
	public static float height;
	public static float head;
	public static float bust;
	public static float teeth;

	public static void load(Context context, int i) {
		SharedPreferences sp = getPreferences(context, i);

		if (sp != null) {
			index = i;

			childName = sp.getString(CHILD_NAME, null);
			gender = sp.getString(GENDER, null);
			birth_year = sp.getString(BIRTH_YEAR, null);
			birth_month = sp.getString(BIRTH_MONTH, null);
			birth_day = sp.getString(BIRTH_DAY, null);
			evaluation_count = sp.getInt(EVALUATION_COUNT, 0);

			motherName = sp.getString(MOTHER_NAME, null);
			motherJob = sp.getString(MOTHER_JOB, null);
			motherEducation = sp.getString(MOTHER_EDUCATION, null);
			motherWorkplace = sp.getString(MOTHER_WORKPLACE, null);
			fatherName = sp.getString(FATHER_NAME, null);
			fatherJob = sp.getString(FATHER_JOB, null);
			fatherEducation = sp.getString(FATHER_EDUCATION, null);
			fatherWorkplace = sp.getString(FATHER_WORKPLACE, null);
			homeNumber = sp.getString(HOME_NUMBER, null);
			phoneNumber = sp.getString(PHONE_NUMBER, null);
			homeAddress = sp.getString(HOME_ADDRESS, null);
			zipCode = sp.getString(ZIP_CODE, null);
			emailAddress = sp.getString(EMAIL_ADDRESS, null);

			weight = sp.getFloat(WEIGHT, 0);
			height = sp.getFloat(HEIGHT, 0);
			head = sp.getFloat(HEAD, 0);
			bust = sp.getFloat(BUST, 0);
			teeth = sp.getFloat(TEETH, 0);

			// TODO calculate age_in_days here
		}
	}

	public static void save(Context context) {
		SharedPreferences sp = getPreferences(context, index);

		if (sp != null) {
			sp.edit()
				.putString(CHILD_NAME, childName)
				.putString(GENDER, gender)
				.putString(BIRTH_YEAR, birth_year)
				.putString(BIRTH_MONTH, birth_month)
				.putString(BIRTH_DAY, birth_day)
				.putInt(EVALUATION_COUNT, evaluation_count)
				.putString(MOTHER_NAME, motherName)
				.putString(MOTHER_JOB, motherJob)
				.putString(MOTHER_EDUCATION, motherEducation)
				.putString(MOTHER_WORKPLACE, motherWorkplace)
				.putString(FATHER_NAME, fatherName)
				.putString(FATHER_JOB, fatherJob)
				.putString(FATHER_EDUCATION, fatherEducation)
				.putString(FATHER_WORKPLACE, fatherWorkplace)
				.putString(HOME_NUMBER, homeNumber)
				.putString(PHONE_NUMBER, phoneNumber)
				.putString(HOME_ADDRESS, homeAddress)
				.putString(ZIP_CODE, zipCode)
				.putString(EMAIL_ADDRESS, emailAddress)
				.putFloat(WEIGHT, weight)
				.putFloat(HEIGHT, height)
				.putFloat(HEAD, head)
				.putFloat(BUST, bust)
				.putFloat(TEETH, teeth)
				.commit();
		}
	}

	private static SharedPreferences getPreferences(Context context, int i) {
		SharedPreferences sp = context.getSharedPreferences("child_" + i, 0);

		if (sp == null) {
			Toast.makeText(context, "can't create database file", 3000).show();
			return null;
		}

		return sp;
	}
}
