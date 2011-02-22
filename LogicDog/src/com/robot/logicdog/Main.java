package com.robot.logicdog;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class Main extends Activity {
	
	private DragLayer mWorkspace;
	private DragController mDragController;
	
	private ImageView mImage;
	private ImageView mDragTarget;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mDragController = new DragController(this);
        
        mWorkspace = (DragLayer) findViewById(R.id.workspace);
        mWorkspace.setDragController(mDragController);
        
        mDragTarget = (ImageView) findViewById(R.id.icon_moved);
        
        mImage = (ImageView) findViewById(R.id.icon);
        mImage.setOnTouchListener(new OnTouchListener() {
        	public boolean onTouch(View v, MotionEvent ev) {
        		mDragController.setMoveTarget(mDragTarget);
        		mDragController.startDrag(v);
        		return false;
        	}
        });
    }
}