package com.robot.study.subtraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.robot.study.Const;
import com.robot.study.CourseSelectorActivity;
import com.robot.study.Progress;

public class CourseSelector extends CourseSelectorActivity {
	
	private Progress mProgress;

	private class CourseAdapter extends BaseAdapter {
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i;

			if (convertView == null) {
				i = new ImageView(CourseSelector.this);
				i.setImageResource(mProgress.getCourses().get(position)
						.getIcon());
				i.setScaleType(ImageView.ScaleType.CENTER);
				i.setLayoutParams(new Gallery.LayoutParams(Const.COURSE_ICON_W,
						Const.COURSE_ICON_H));
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

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent i = getIntent();
		if (i != null) {
			int index = i.getIntExtra("progress", 0);
			mProgress = Config.getProgress().get(index);
		}

		setOnCourseSelectorListener(new OnCourseSelectorListener() {
			public void onCourseSelector(int position) {

				String packageName = getPackageName();
				String activityName = CoursePlayer.class.getName();
				startActivity(new Intent().setClassName(packageName,
						activityName).putExtra("course",
								mProgress.getCourses().get(position).getText()));
			}
		});

		setAdapter(new CourseAdapter());
	}

}
