package com.robot.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.AdapterView.OnItemClickListener;

public abstract class CourseSelectorActivity extends Activity {

	public abstract Progress getProgress(int index);

	private Gallery mGallery;
	private Progress mProgress;
	
	public void setProgress(Progress p) {
		mProgress = p;
	}

	protected Progress getProgress() {
		return mProgress;
	}

	public interface OnCourseSelectorListener {
		public void onCourseSelector(int position);
	}

	private OnCourseSelectorListener mOnCourseSelectorListener;

	public void setOnCourseSelectorListener(OnCourseSelectorListener listener) {
		mOnCourseSelectorListener = listener;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent i = getIntent();
		if (i != null) {
			int index = i.getIntExtra("progress", 0);
			mProgress = getProgress(index);
		}
	}

	public void setAdapter(BaseAdapter adapter) {
		setContentView(R.layout.course_selector);

		mGallery = (Gallery) findViewById(R.id.gallery);
		if (mGallery != null) {
			mGallery.setAdapter(adapter);
			mGallery.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					if (mOnCourseSelectorListener != null) {
						mOnCourseSelectorListener.onCourseSelector(position);
					}
				}
			});
		}
	}

}
