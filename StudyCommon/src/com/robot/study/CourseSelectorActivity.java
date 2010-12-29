package com.robot.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

public abstract class CourseSelectorActivity extends Activity {

	public abstract int getViewId();

	public abstract int getGridId();
	
	public abstract int getGridColumn();

	public abstract Progress getProgress(int index);

	public abstract String getNextPackageName();

	public abstract String getNextActivityName();

	private GridView mGrid;
	private Progress mProgress;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getViewId());

		Intent i = getIntent();
		if (i != null) {
			int index = i.getIntExtra("progress", 0);
			mProgress = getProgress(index);
		}

		mGrid = (GridView) findViewById(getGridId());
		if (mGrid != null) {
			mGrid.setNumColumns(getGridColumn());
			mGrid.setAdapter(new CourseAdapter());
			mGrid.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Intent i = new Intent();
					i.setClassName(getNextPackageName(), getNextActivityName());
					i.putExtra("course", mProgress.getCourses().get(position)
							.getText());
					CourseSelectorActivity.this.startActivity(i);
				}
			});
		}
	}

	private class CourseAdapter extends BaseAdapter {
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i;

			if (convertView == null) {
				i = new ImageView(CourseSelectorActivity.this);
				i.setImageResource(mProgress.getCourses().get(position)
						.getIcon());
			} else {
				i = (ImageView) convertView;
			}

			return i;
		}

		public final int getCount() {
			return mProgress.getCourses().size();
		}

		public final Object getItem(int position) {
			return null;
		}

		public final long getItemId(int position) {
			return position;
		}
	}
}
