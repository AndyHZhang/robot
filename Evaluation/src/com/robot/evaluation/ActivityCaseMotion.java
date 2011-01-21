package com.robot.evaluation;

import com.robot.evaluation.Const.Cases;

public class ActivityCaseMotion extends ActivityCaseBase {
	
	public void refreshQuestion(int monthAge) {
		
		Cases cases = Const.getCases().get("" + monthAge);;
		
		mTitleContent.setText(cases.mMotionCase.mTitle);
		mMethodContent.setText(cases.mMotionCase.mMethod);
		mStandardContent.setText(cases.mMotionCase.mStandard);
	}

}
