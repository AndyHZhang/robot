package com.robot.study.division;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.robot.study.ProgressSelectorActivity;

public class ProgressSelector extends ProgressSelectorActivity {
	
	private class ProgressAdapter extends BaseAdapter {
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i;

			if (convertView == null) {
				i = new ImageView(ProgressSelector.this);
				i.setImageResource(Config.getProgress().get(position)
						.getCourseIcon());
			} else {
				i = (ImageView) convertView;
			}

			return i;
		}

		public final int getCount() {
			return Config.getProgress().size();
		}

		public final Object getItem(int position) {
			return null;
		}

		public final long getItemId(int position) {
			return position;
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setOnProgressSelectorListener(new OnProgressSelectorListener() {
			public void onProgressSelector(int position) {
				String packageName = getPackageName();
				String activityName = CourseSelector.class.getName();
				startActivity(new Intent().setClassName(packageName,
						activityName).putExtra("progress", position));
			}
		});

		setAdapter(new ProgressAdapter());
	}
	
	int getSoundId() {
		return R.raw.welcome_2;
	}

}
