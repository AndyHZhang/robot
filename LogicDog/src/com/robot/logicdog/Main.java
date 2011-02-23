package com.robot.logicdog;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;

import com.robot.logicdog.Const.ImagePair;
import com.robot.logicdog.DragController.DragListener;

public class Main extends Activity implements DragListener, OnTouchListener {

	private static final String TAG = Main.class.getSimpleName();

	private static final int TEST_COUNT = 6;

	private DragLayer mWorkspace;
	private DragController mDragController;

	private View mDraggingView;

	private int mFinishCount;
	private int mDBIndex;

	private View mBackground;

	private ImageView mImage01;
	private ImageView mImage02;
	private ImageView mImage03;
	private ImageView mImage04;
	private ImageView mImage05;
	private ImageView mImage06;

	private DragTargetView mDragTarget01;
	private DragTargetView mDragTarget02;
	private DragTargetView mDragTarget03;
	private DragTargetView mDragTarget04;
	private DragTargetView mDragTarget05;
	private DragTargetView mDragTarget06;

	private ArrayList<DragTargetView> mDragTargetList;

	private ArrayList<ImageView> mDragSourceList;

	private int[] mSourceIndex = new int[TEST_COUNT];
	private int[] mTargetIndex = new int[TEST_COUNT];

	private Handler mHandler = new Handler();

	private Runnable mStartNextTest = new Runnable() {
		public void run() {
			nextTest(true);
		}
	};

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mDragController = new DragController(this);

		mWorkspace = (DragLayer) findViewById(R.id.workspace);
		mWorkspace.setDragController(mDragController);

		mDragSourceList = getDragSourceList();
		mDragTargetList = getDragTargetList();

		mBackground = findViewById(R.id.background);

		((Button) findViewById(R.id.up_btn))
				.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						nextTest(false);
					}
				});

		((Button) findViewById(R.id.down_btn))
				.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						nextTest(true);
					}
				});
	}

	private void nextTest(boolean next) {
		if (next) {
			mDBIndex++;
			if (mDBIndex == Const.DB.length)
				mDBIndex = 0;

		} else {
			mDBIndex--;
			if (mDBIndex < 0)
				mDBIndex = Const.DB.length - 1;
		}

		prepareCourse();
	}

	@Override
	public void onResume() {
		super.onResume();

		mDragController.setDragListener(this);
		prepareCourse();
	}

	@Override
	public void onStop() {
		super.onStop();

		mDragController.removeDragListener(this);
		
		mHandler.removeCallbacks(mStartNextTest);
	}

	public boolean onTouch(View v, MotionEvent ev) {
		mDragController.startDrag(v);
		mDraggingView = v;
		return false;
	}

	public void onDrop(int dropX, int dropY) {
		DragTargetView target = findDropTarget(dropX, dropY);
		if (target != null) {
			if (target.onDrop(mDraggingView)) {
				mFinishCount--;
				if (mFinishCount == 0) {
					// nextTest(true);
					mHandler.postDelayed(mStartNextTest, 1000);
				}
			}
		}
	}

	private ArrayList<ImageView> getDragSourceList() {

		mImage01 = (ImageView) findViewById(R.id.icon_01);
		mImage01.setOnTouchListener(this);
		mImage02 = (ImageView) findViewById(R.id.icon_02);
		mImage02.setOnTouchListener(this);
		mImage03 = (ImageView) findViewById(R.id.icon_03);
		mImage03.setOnTouchListener(this);
		mImage04 = (ImageView) findViewById(R.id.icon_04);
		mImage04.setOnTouchListener(this);
		mImage05 = (ImageView) findViewById(R.id.icon_05);
		mImage05.setOnTouchListener(this);
		mImage06 = (ImageView) findViewById(R.id.icon_06);
		mImage06.setOnTouchListener(this);

		ArrayList<ImageView> list = new ArrayList<ImageView>();
		list.add(mImage01);
		list.add(mImage02);
		list.add(mImage03);
		list.add(mImage04);
		list.add(mImage05);
		list.add(mImage06);

		return list;
	}

	private ArrayList<DragTargetView> getDragTargetList() {

		mDragTarget01 = (DragTargetView) findViewById(R.id.target_01);
		mDragTarget02 = (DragTargetView) findViewById(R.id.target_02);
		mDragTarget03 = (DragTargetView) findViewById(R.id.target_03);
		mDragTarget04 = (DragTargetView) findViewById(R.id.target_04);
		mDragTarget05 = (DragTargetView) findViewById(R.id.target_05);
		mDragTarget06 = (DragTargetView) findViewById(R.id.target_06);

		ArrayList<DragTargetView> list = new ArrayList<DragTargetView>();
		list.add(mDragTarget01);
		list.add(mDragTarget02);
		list.add(mDragTarget03);
		list.add(mDragTarget04);
		list.add(mDragTarget05);
		list.add(mDragTarget06);

		return list;
	}

	private void prepareCourse() {
		mFinishCount = TEST_COUNT;

		mBackground.setBackgroundResource(Const.BACKGROUND[mDBIndex]);

		Random r = new Random(System.currentTimeMillis());
		buildRandonIndex(mSourceIndex, r.nextLong());
		buildRandonIndex(mTargetIndex, r.nextLong());

		for (int i = 0; i < TEST_COUNT; i++) {
			final ImagePair ip = Const.DB[mDBIndex][i];

			final ImageView sourceView = mDragSourceList.get(mSourceIndex[i]);
			sourceView.setImageResource(ip.mSourceResId);
			sourceView.setTag(Integer.toString(i + 1));

			final DragTargetView targetView = mDragTargetList
					.get(mTargetIndex[i]);
			targetView.setImageResource(ip.mTargetResId);
			targetView.setMixedImageResource(ip.mMixedResId);
			targetView.setTag(Integer.toString(i + 1));
		}
	}

	private DragTargetView findDropTarget(int x, int y) {
		for (DragTargetView t : mDragTargetList) {
			if (t.acceptDrop(x, y))
				return t;
		}
		return null;
	}

	private void buildRandonIndex(int[] indexList, long seed) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		final int length = indexList.length;

		for (int i = 0; i < length; i++) {
			list.add(i);
		}

		Random random = new Random(seed);
		for (int i = 0; i < length; i++) {
			int leftNumber = list.size();
			int index = list.get(random.nextInt(leftNumber));
			indexList[i] = index;
			list.remove((Integer) index);
		}
	}
}