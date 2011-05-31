package com.robot.evaluation;

import java.util.Calendar;

import com.robot.evaluation.Const.Cases;

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
	
	private TextView mBodyTest;
	private TextView mBodyResult;
	private TextView mArtTest;
	private TextView mArtResult;
	private TextView mCognitiveTest;
	private TextView mCognitiveResult;
	private TextView mEQTest;
	private TextView mEQResult;
	private TextView mMotionTest;
	private TextView mMotionResult;
	private TextView mSpeakTest;
	private TextView mSpeakResult;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.table_report);

		// TODO just for test, should be remove later
		RecordData.load(this, RecordData.index);

		mEvaluationNo = (TextView) findViewById(R.id.evaluation_no);
		mEvaluationNo.setText(Integer.toString(RecordData.index));

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
		
		mBodyTest = (TextView) findViewById(R.id.body_test);
		mBodyTest.setText("体重与身高（长）T：" + RecordData.weight + "     Z：" + RecordData.height);
		
		mBodyResult = (TextView) findViewById(R.id.body_result);
		mBodyResult.setText(getBodyResult());
		
		mArtTest = (TextView) findViewById(R.id.art_test);
		mArtTest.setText(getArtTestCase());
		
		mArtResult = (TextView) findViewById(R.id.art_result);
		mArtResult.setText(getArtResult());
		
		mCognitiveTest = (TextView) findViewById(R.id.cognitive_test);
		mCognitiveTest.setText(getCognitiveTestCase());
		
		mCognitiveResult = (TextView) findViewById(R.id.cognitive_result);
		mCognitiveResult.setText(getCognitiveResult());
		
		mEQTest = (TextView) findViewById(R.id.eq_test);
		mEQTest.setText(getEQTestCase());
		
		mEQResult = (TextView) findViewById(R.id.eq_result);
		mEQResult.setText(getEQResult());
		
		mMotionTest = (TextView) findViewById(R.id.motion_test);
		mMotionTest.setText(getMotionTestCase());
		
		mMotionResult = (TextView) findViewById(R.id.motion_result);
		mMotionResult.setText(getMotionResult());
		
		mSpeakTest = (TextView) findViewById(R.id.speak_test);
		mSpeakTest.setText(getSpeakTestCase());
		
		mSpeakResult = (TextView) findViewById(R.id.speak_result);
		mSpeakResult.setText(getSpeakResult());
	}
	
	private String getBodyResult() {
		double standardWeight = 0;
		double standardHeight = 0;
		
		int ageInMonth = RecordData.age_in_days / 30;
		if ("boy".equals(RecordData.gender)) {
			if (ageInMonth >= 0) {standardWeight = 3.3; standardHeight = 50.5;}
			if (ageInMonth >= 1) {standardWeight = 4.3; standardHeight = 54.6;}
			if (ageInMonth >= 2) {standardWeight = 5.2; standardHeight = 58.1;}
			if (ageInMonth >= 3) {standardWeight = 6.0; standardHeight = 61.1;}
			if (ageInMonth >= 4) {standardWeight = 6.7; standardHeight = 63.1;}
			if (ageInMonth >= 5) {standardWeight = 7.3; standardHeight = 65.9;}
			if (ageInMonth >= 6) {standardWeight = 7.8; standardHeight = 67.8;}
			if (ageInMonth >= 8) {standardWeight = 8.8; standardHeight = 71.0;}
			if (ageInMonth >= 10) {standardWeight = 9.5; standardHeight = 73.6;}
			if (ageInMonth >= 12) {standardWeight = 10.2; standardHeight = 76.1;}
			if (ageInMonth >= 15) {standardWeight = 10.9; standardHeight = 79.4;}
			if (ageInMonth >= 18) {standardWeight = 11.5; standardHeight = 82.4;}
			if (ageInMonth >= 21) {standardWeight = 12.0; standardHeight = 85.1;}
			if (ageInMonth >= 24) {standardWeight = 12.6; standardHeight = 87.6;}
			if (ageInMonth >= 30) {standardWeight = 13.7; standardHeight = 92.3;}
			if (ageInMonth >= 36) {standardWeight = 14.7; standardHeight = 96.5;}
			if (ageInMonth >= 42) {standardWeight = 15.7; standardHeight = 99.1;}
			if (ageInMonth >= 48) {standardWeight = 16.7; standardHeight = 102.9;}
			if (ageInMonth >= 54) {standardWeight = 17.7; standardHeight = 106.6;}
			if (ageInMonth >= 60) {standardWeight = 18.7; standardHeight = 109.9;}
			if (ageInMonth >= 66) {standardWeight = 19.7; standardHeight = 113.1;}
			if (ageInMonth >= 72) {standardWeight = 20.7; standardHeight = 116.1;}
			if (ageInMonth >= 78) {standardWeight = 21.7; standardHeight = 119.0;}
		} else {
			if (ageInMonth >= 0) {standardWeight = 3.2; standardHeight = 49.9;}
			if (ageInMonth >= 1) {standardWeight = 4.0; standardHeight = 53.5;}
			if (ageInMonth >= 2) {standardWeight = 4.7; standardHeight = 56.8;}
			if (ageInMonth >= 3) {standardWeight = 5.4; standardHeight = 59.5;}
			if (ageInMonth >= 4) {standardWeight = 6.0; standardHeight = 62.0;}
			if (ageInMonth >= 5) {standardWeight = 6.7; standardHeight = 64.1;}
			if (ageInMonth >= 6) {standardWeight = 7.2; standardHeight = 65.9;}
			if (ageInMonth >= 8) {standardWeight = 8.2; standardHeight = 69.1;}
			if (ageInMonth >= 10) {standardWeight = 8.9; standardHeight = 71.8;}
			if (ageInMonth >= 12) {standardWeight = 9.5; standardHeight = 74.3;}
			if (ageInMonth >= 15) {standardWeight = 10.2; standardHeight = 77.8;}
			if (ageInMonth >= 18) {standardWeight = 10.8; standardHeight = 80.9;}
			if (ageInMonth >= 21) {standardWeight = 11.4; standardHeight = 83.8;}
			if (ageInMonth >= 24) {standardWeight = 11.9; standardHeight = 86.5;}
			if (ageInMonth >= 30) {standardWeight = 12.9; standardHeight = 91.3;}
			if (ageInMonth >= 36) {standardWeight = 13.9; standardHeight = 95.6;}
			if (ageInMonth >= 42) {standardWeight = 15.1; standardHeight = 97.9;}
			if (ageInMonth >= 48) {standardWeight = 16.0; standardHeight = 101.6;}
			if (ageInMonth >= 54) {standardWeight = 16.8; standardHeight = 105.1;}
			if (ageInMonth >= 60) {standardWeight = 17.7; standardHeight = 108.4;}
			if (ageInMonth >= 66) {standardWeight = 18.6; standardHeight = 111.6;}
			if (ageInMonth >= 72) {standardWeight = 19.5; standardHeight = 114.6;}
			if (ageInMonth >= 78) {standardWeight = 20.6; standardHeight = 117.6;}
		}
		
		double rateWeight = Math.abs(RecordData.weight - standardWeight) / standardWeight;
		double rateHeight = Math.abs(RecordData.height - standardHeight) / standardHeight;
		
		if (rateWeight <= 0.1 && rateHeight <= 0.1) {
			return "发育正常";
		} else {
			if (RecordData.weight < standardWeight) {
				return "营养不足待提升";
			} else {
				return "营养过剩需调剂";
			}
		}
	}
	
	private String getArtTestCase() {
		Cases cases = Const.getCases().get("" + RecordData.artMonthAge);
		return cases.mArtCase.mTitle + "\n" + "能够完成" + RecordData.artMonthAge + "月龄宝宝的发展测试内容。";
	}
	
	private String getCognitiveTestCase() {
		Cases cases = Const.getCases().get("" + RecordData.cognitiveMonthAge);
		return cases.mCognitiveCase.mTitle + "\n" + "能够完成" + RecordData.cognitiveMonthAge + "月龄宝宝的发展测试内容。";
	}
	
	private String getEQTestCase() {
		Cases cases = Const.getCases().get("" + RecordData.EQMonthAge);
		return cases.mEQCase.mTitle + "\n" + "能够完成" + RecordData.EQMonthAge + "月龄宝宝的发展测试内容。";
	}
	
	private String getMotionTestCase() {
		Cases cases = Const.getCases().get("" + RecordData.motionMonthAge);
		return cases.mMotionCase.mTitle + "\n" + "能够完成" + RecordData.motionMonthAge + "月龄宝宝的发展测试内容。";
	}
	
	private String getSpeakTestCase() {
		Cases cases = Const.getCases().get("" + RecordData.speakMonthAge);
		return cases.mSpeakCase.mTitle + "\n" + "能够完成" + RecordData.speakMonthAge + "月龄宝宝的发展测试内容。";
	}
	
	private String getArtResult() {
		if (RecordData.artMonthAge > RecordData.age_in_days / 30) {
			return "精细动作发展优秀。";
		} else {
			return "精细动作发展正常。";
		}
	}
	
	private String getCognitiveResult() {
		if (RecordData.cognitiveMonthAge > RecordData.age_in_days / 30) {
			return "认知能力发展优秀。";
		} else {
			return "认知能力发展正常。";
		}
	}
	
	private String getEQResult() {
		if (RecordData.EQMonthAge > RecordData.age_in_days / 30) {
			return "情绪与社会行为发展优秀。";
		} else {
			return "情绪与社会行为发展正常。";
		}
	}
	
	private String getMotionResult() {
		if (RecordData.motionMonthAge > RecordData.age_in_days / 30) {
			return "大运动能力发展优秀。";
		} else {
			return "大运动能力发展正常。";
		}
	}
	
	private String getSpeakResult() {
		if (RecordData.speakMonthAge > RecordData.age_in_days / 30) {
			return "语言发展发展优秀。";
		} else {
			return "语言发展发展正常。";
		}
	}
}
