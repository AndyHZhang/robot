package com.robot.logicdog;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

import com.robot.logicdog.DragController.DragListener;

public class Main extends Activity implements DragListener, OnTouchListener {

	private static final String TAG = Main.class.getSimpleName();

	private DragLayer mWorkspace;
	private DragController mDragController;

	private View mDraggingView;

	private ImageView mImage01;
	private ImageView mImage02;
	private ImageView mImage03;
	private ImageView mImage04;
	private ImageView mImage05;
	private ImageView mImage06;

	private ImageView mDragTarget01;
	private ImageView mDragTarget02;
	private ImageView mDragTarget03;
	private ImageView mDragTarget04;
	private ImageView mDragTarget05;
	private ImageView mDragTarget06;

	private Rect mTargetRect01;
	private Rect mTargetRect02;
	private Rect mTargetRect03;
	private Rect mTargetRect04;
	private Rect mTargetRect05;
	private Rect mTargetRect06;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mDragController = new DragController(this);

		mWorkspace = (DragLayer) findViewById(R.id.workspace);
		mWorkspace.setDragController(mDragController);

		mImage01 = (ImageView) findViewById(R.id.icon_01);
		mImage01.setOnTouchListener(this);
		mImage01.setTag(01);
		mImage02 = (ImageView) findViewById(R.id.icon_02);
		mImage02.setOnTouchListener(this);
		mImage02.setTag(02);
		mImage03 = (ImageView) findViewById(R.id.icon_03);
		mImage03.setOnTouchListener(this);
		mImage03.setTag(03);
		mImage04 = (ImageView) findViewById(R.id.icon_04);
		mImage04.setOnTouchListener(this);
		mImage04.setTag(04);
		mImage05 = (ImageView) findViewById(R.id.icon_05);
		mImage05.setOnTouchListener(this);
		mImage05.setTag(05);
		mImage06 = (ImageView) findViewById(R.id.icon_06);
		mImage06.setOnTouchListener(this);
		mImage06.setTag(06);

		mDragTarget01 = (ImageView) findViewById(R.id.target_01);
		mDragTarget01.setTag(01);
		mDragTarget02 = (ImageView) findViewById(R.id.target_02);
		mDragTarget02.setTag(02);
		mDragTarget03 = (ImageView) findViewById(R.id.target_03);
		mDragTarget03.setTag(03);
		mDragTarget04 = (ImageView) findViewById(R.id.target_04);
		mDragTarget04.setTag(04);
		mDragTarget05 = (ImageView) findViewById(R.id.target_05);
		mDragTarget05.setTag(05);
		mDragTarget06 = (ImageView) findViewById(R.id.target_06);
		mDragTarget06.setTag(06);

		final int w = 160, h = 120, left = 120, top = 60;
		final int marginLeft = 20, marginTop = 20;

		int l = left, t = top;
		mTargetRect01 = new Rect(l, t, l + w, t + h);
		l += w + marginLeft;
		mTargetRect02 = new Rect(l, t, l + w, t + h);
		l += w + marginLeft;
		mTargetRect03 = new Rect(l, t, l + w, t + h);

		l = left;
		t += h + marginTop;
		mTargetRect04 = new Rect(l, t, l + w, t + h);
		l += w + marginLeft;
		mTargetRect05 = new Rect(l, t, l + w, t + h);
		l += w + marginLeft;
		mTargetRect06 = new Rect(l, t, l + w, t + h);
	}

	@Override
	public void onResume() {
		super.onResume();

		mDragController.setDragListener(this);
	}

	@Override
	public void onStop() {
		super.onStop();

		mDragController.removeDragListener(this);
	}

	public boolean onTouch(View v, MotionEvent ev) {
		mDragController.startDrag(v);
		mDraggingView = v;
		return false;
	}

	public void onDrop(int dropX, int dropY) {
		ImageView target = findDropTarget(dropX, dropY);
		if (target != null && mDraggingView.getTag().equals(target.getTag())) {
			target.setBackgroundColor(0x000000);
		}
	}

	private ImageView findDropTarget(int x, int y) {
		if (mTargetRect01.contains(x, y))
			return mDragTarget01;
		if (mTargetRect02.contains(x, y))
			return mDragTarget02;
		if (mTargetRect03.contains(x, y))
			return mDragTarget03;
		if (mTargetRect04.contains(x, y))
			return mDragTarget04;
		if (mTargetRect05.contains(x, y))
			return mDragTarget05;
		if (mTargetRect06.contains(x, y))
			return mDragTarget06;

		return null;
	}
}