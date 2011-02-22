package com.robot.logicdog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class DragLayer extends FrameLayout {
	
	private static final String TAG = DragLayer.class.getSimpleName();
	
	private DragController mDragController;
	
	public DragLayer(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	public void setDragController(DragController controller) {
		mDragController = controller;
	}
	
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		return mDragController.onnterceptTouchEvent(ev);
	}
	
	@Override
    public boolean onTouchEvent(MotionEvent ev) {
        return mDragController.onTouchEvent(ev);
    }
}
