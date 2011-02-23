package com.robot.logicdog;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class DragTargetView extends ImageView {

	private static final String TAG = DragTargetView.class.getSimpleName();

	private Rect r = new Rect();
	
	private Animation mAnimRight;
	private Animation mAnimWrong;
	
	private int mMixedImageRes;

	public DragTargetView(Context context) {
		super(context);

		init(context);
	}

	public DragTargetView(Context context, AttributeSet attrs) {
		super(context, attrs);

		init(context);
	}

	public DragTargetView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);

		init(context);
	}

	private void init(Context context) {
		mAnimRight = AnimationUtils.loadAnimation(context, R.anim.fade);
		mAnimWrong = AnimationUtils.loadAnimation(context, R.anim.shake);
	}

	public boolean acceptDrop(int touchX, int touchY) {
		getGlobalVisibleRect(r);
		return r.contains(touchX, touchY);
	}

	public boolean onDrop(View v) {
		if (getTag().equals(v.getTag())) {
			
			startAnimation(mAnimRight);
			setImageResource(mMixedImageRes);
			
			return true;
		} else {
			startAnimation(mAnimWrong);
			return false;
		}
	}
	
	public void setMixedImageResource(int resId) {
		mMixedImageRes = resId;
	}
}
