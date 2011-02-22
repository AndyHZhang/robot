package com.robot.logicdog;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class DragView extends View {
	
	private static final int DRAG_SCALE = 40;
	
	private WindowManager mWindowManager;
	private WindowManager.LayoutParams mLayoutParams;
	
	private Paint mPaint;
	private Bitmap mBitmap;
	
	private int mRegistrationX, mRegistrationY;
	
	public DragView(Context context, Bitmap b, int registrationX, int registrationY) {
		super(context);
		
		mBitmap = b;
		
		mRegistrationX = registrationX + (DRAG_SCALE/2);
		mRegistrationY = registrationY + (DRAG_SCALE/2);
		
		mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
	}
	
	@Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(mBitmap.getWidth(), mBitmap.getHeight());
    }
	
	@Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mBitmap, 0.0f, 0.0f, mPaint);
    }
	
	@Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mBitmap.recycle();
    }
	
	public void show(int touchX, int touchY) {
		WindowManager.LayoutParams lp;
		int pixelFormat = PixelFormat.TRANSLUCENT;
		
		lp = new WindowManager.LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                touchX-mRegistrationX, touchY-mRegistrationY,
                WindowManager.LayoutParams.TYPE_APPLICATION_SUB_PANEL,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
                    | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                pixelFormat);
		lp.gravity = Gravity.LEFT | Gravity.TOP;
		lp.setTitle("DragView");
		
		mLayoutParams = lp;
		
		mWindowManager.addView(this, lp);
	}
	
	public void move(int touchX, int touchY) {
		WindowManager.LayoutParams lp = mLayoutParams;
        lp.x = touchX - mRegistrationX;
        lp.y = touchY - mRegistrationY;
        mWindowManager.updateViewLayout(this, lp);
	}
	
	public void remove() {
		mWindowManager.removeView(this);
	}
	
	public WindowManager.LayoutParams getLayout() {
		return mLayoutParams;
	}

}
