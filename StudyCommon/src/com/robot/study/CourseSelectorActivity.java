package com.robot.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.AdapterView.OnItemClickListener;

public class CourseSelectorActivity extends Activity {

	private Gallery mGallery;

	public interface OnCourseSelectorListener {
		public void onCourseSelector(int position);
	}

	private OnCourseSelectorListener mOnCourseSelectorListener;

	public void setOnCourseSelectorListener(OnCourseSelectorListener listener) {
		mOnCourseSelectorListener = listener;
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
