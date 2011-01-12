package com.robot.evaluation;

import com.robot.evaluation.Const.Cases;

public class ActivityCaseCognitive extends ActivityCaseBase {
	
	public void refreshQuestion(int monthAge) {
		
		Cases cases = Const.getCases().get("" + monthAge);;
		
		mTitleContent.setText(cases.mCognitiveCase.mTitle);
		mMethodContent.setText(cases.mCognitiveCase.mMethod);
		mStandardContent.setText(cases.mCognitiveCase.mMethod);
	}

}
