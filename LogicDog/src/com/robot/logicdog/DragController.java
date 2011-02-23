package com.robot.logicdog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class DragController {

	private static final String TAG = DragController.class.getSimpleName();

	private Context mContext;

	private DragView mDragView;

	private int mMotionDownX, mMotionDownY;
	
	private boolean mDragging;
	
	private DragListener mListener;
	
	interface DragListener {
		public void onDrop(int dropX, int dropY);
	}

	public DragController(Context context) {
		mContext = context;
	}
	
	public void setDragListener(DragListener l) {
        mListener = l;
    }
	
	public void removeDragListener(DragListener l) {
        mListener = null;
    }

	public void startDrag(View v) {

		if (!mDragging) {
			Bitmap b = getViewBitmap(v);

			int[] loc = new int[2];
			v.getLocationOnScreen(loc);
			int screenX = loc[0];
			int screenY = loc[1];
			
			mDragging = true;

			mDragView = new DragView(mContext, b, mMotionDownX - screenX,
					mMotionDownY - screenY);
			mDragView.show(mMotionDownX, mMotionDownY);
		}
	}

	public boolean onnterceptTouchEvent(MotionEvent ev) {
		final int action = ev.getAction();

		final int screenX = (int) ev.getRawX();
		final int screenY = (int) ev.getRawY();

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			mMotionDownX = screenX;
			mMotionDownY = screenY;
			break;
		}
		return false;
	}

	public boolean onTouchEvent(MotionEvent ev) {
		final int action = ev.getAction();

		final int screenX = (int) ev.getRawX();
		final int screenY = (int) ev.getRawY();

		switch (action) {
		case MotionEvent.ACTION_DOWN:
			break;
		case MotionEvent.ACTION_MOVE:
			if (mDragging) {
				mDragView.move(screenX, screenY);
			}
			break;
		case MotionEvent.ACTION_UP:
			if (mDragging) {
				mDragView.remove();
				mDragView = null;
				
				if (mListener != null) {
					mListener.onDrop(screenX, screenY);
				}
				
				mDragging = false;
			}
			break;
		}
		return true;
	}

	private Bitmap getViewBitmap(View v) {
		v.clearFocus();
		v.setPressed(false);

		boolean willNotCache = v.willNotCacheDrawing();
		v.setWillNotCacheDrawing(false);

		// Reset the drawing cache background color to fully transparent
		// for the duration of this operation
		int color = v.getDrawingCacheBackgroundColor();
		v.setDrawingCacheBackgroundColor(0);

		if (color != 0) {
			v.destroyDrawingCache();
		}
		v.buildDrawingCache();
		Bitmap cacheBitmap = v.getDrawingCache();
		if (cacheBitmap == null) {
			return null;
		}

		Bitmap bitmap = Bitmap.createBitmap(cacheBitmap);

		// Restore the view
		v.destroyDrawingCache();
		v.setWillNotCacheDrawing(willNotCache);
		v.setDrawingCacheBackgroundColor(color);

		return bitmap;
	}
}
