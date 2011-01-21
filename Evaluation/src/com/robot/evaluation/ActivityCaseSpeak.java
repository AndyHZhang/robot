package com.robot.evaluation;

import com.robot.evaluation.Const.Cases;

public class ActivityCaseSpeak extends ActivityCaseBase {
	
	public void refreshQuestion(int monthAge) {
		
		Cases cases = Const.getCases().get("" + monthAge);;
		
		mTitleContent.setText(cases.mSpeakCase.mTitle);
		mMethodContent.setText(cases.mSpeakCase.mMethod);
		mStandardContent.setText(cases.mSpeakCase.mStandard);
	}

}
