package com.robot.study.chinese0;

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

	public int getViewId() {
		return Config.COURSE_SELECTOR_LAYOUT_ID;
	}

	public int getGalleryId() {
		return Config.GALLERY_WIDGET_ID;
	}

	public int getGridColumn() {
		return Config.COURSE_COLUMN;
	}

	public Progress getProgress(int index) {
		return Config.getProgress().get(index);
	}

	private class CourseAdapter extends BaseAdapter {
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i;

			if (convertView == null) {
				i = new ImageView(CourseSelector.this);
				i.setImageResource(getProgress().getCourses().get(position)
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
			return getProgress().getCourses().size();
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

		setOnCourseSelectorListener(new OnCourseSelectorListener() {
			public void onCourseSelector(int position) {

				String packageName = getPackageName();
				String activityName = CoursePlayer.class.getName();
				startActivity(new Intent().setClassName(packageName,
						activityName).putExtra("course",
						getProgress().getCourses().get(position).getText()));
			}
		});

		setAdapter(new CourseAdapter());
	}

}
