package com.robot.evaluation;

import com.robot.evaluation.Const.Cases;

public class ActivityCaseEQ extends ActivityCaseBase {
	
	public void refreshQuestion(int monthAge) {
		
		Cases cases = Const.getCases().get("" + monthAge);;
		
		mTitleContent.setText(cases.mEQCase.mTitle);
		mMethodContent.setText(cases.mEQCase.mMethod);
		mStandardContent.setText(cases.mEQCase.mMethod);
	}

}
