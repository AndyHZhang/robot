package com.android.language;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class Selector extends Activity {

	private Gallery mGallery;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setAdapter(new CourseAdapter());
	}

	public interface OnCourseSelectorListener {
		public void onCourseSelector(int position);
	}

	private OnCourseSelectorListener mOnCourseSelectorListener;

	public void setOnCourseSelectorListener(OnCourseSelectorListener listener) {
		mOnCourseSelectorListener = listener;
	}

	public void setAdapter(BaseAdapter adapter) {
		setContentView(R.layout.selector);

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

	private class CourseAdapter extends BaseAdapter {
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i;

			if (convertView == null) {
				i = new ImageView(Selector.this);
				i.setImageResource(R.drawable.course01);
				//i.setScaleType(ImageView.ScaleType.CENTER);
				i.setLayoutParams(new Gallery.LayoutParams(400, 300));
			} else {
				i = (ImageView) convertView;
			}

			return i;
		}

		public final int getCount() {
			return 5;
		}

		public final Object getItem(int position) {
			return null;
		}

		public final long getItemId(int position) {
			return position;
		}
	}

}
