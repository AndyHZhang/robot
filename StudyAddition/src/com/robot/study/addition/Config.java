package com.robot.study.addition;

import java.util.ArrayList;
import java.util.HashMap;

import com.robot.study.Const;
import com.robot.study.Course;
import com.robot.study.Progress;

public class Config {
	
	public final static int WELCOME_LAYOUT_ID = R.layout.welcome;
	public final static int PROGRESS_SELECTOR_LAYOUT_ID = R.layout.progress_selector;
	public final static int COURSE_SELECTOR_LAYOUT_ID = R.layout.course_selector;
	public final static int COURSE_PLAYER_LAYOUT_ID = R.layout.courses;
	public final static int GRID_WIDGET_ID = R.id.grid;
	public final static int TEXT_WIDGET_ID = R.id.text;
	public final static int STRING_NEXT_COURSE = R.string.next_course;
	public final static int PROGRESS_COLUMN = 7;
	public final static int COURSE_COLUMN = 3;
	
	public final static String PACKAGE_NAME = "com.robot.study.addition";
	public final static String PROGRESS_SELECTOR_ACTIVITY_NAME = PACKAGE_NAME + ".ProgressSelector";
	public final static String COURSE_SELECTOR_ACTIVITY_NAME = PACKAGE_NAME + ".CourseSelector";
	public final static String COURSE_PLAYER_ACTIVITY_NAME = PACKAGE_NAME + ".CoursePlayer";
	
	private static ArrayList<Progress> mProgresses;
	public static ArrayList<Progress> getProgress() {
		if (mProgresses == null) {
			mProgresses = new ArrayList<Progress>();
			
			for (int i = 0; i < 21; i++) {
				Progress p = new Progress(R.drawable.icon);
				
				Course c1 = new Course(R.drawable.icon, Config.CourseData01);
				Course c2 = new Course(R.drawable.icon, Config.CourseData02);
				Course c3 = new Course(R.drawable.icon, Config.CourseData03);
				p.addCourse(c1).addCourse(c2).addCourse(c3);
				mProgresses.add(p);
			}
		}
		
		return mProgresses;
	}
	
	public final static String[] CourseData01 = { 
		"��","��","��","��","��",
		Const.COURSE_BREAK,
		"��","��","Ь","��","ñ",
		Const.COURSE_BREAK,
		"��","��","��","��","��",
		Const.COURSE_BREAK,
		"��","ǽ","��","��","��",
		Const.COURSE_BREAK,
		"��","��","��","��","Ϻ"
	};
	
	public final static String[] CourseData02 = { 
		"��","��","��","��","è",
		Const.COURSE_BREAK,
		"��","Ь","��","ñ","��",
		Const.COURSE_BREAK,
		"��","��","��","��","��",
		Const.COURSE_BREAK,
		"ǽ","��","��","��","Ѽ",
		Const.COURSE_BREAK,
		"��","��","��","Ϻ","��"
	};
	
	public final static String[] CourseData03 = { 
		"��","��","��","è","��",
		Const.COURSE_BREAK,
		"Ь","��","ñ","��","��",
		Const.COURSE_BREAK,
		"��","��","��","��","ƿ",
		Const.COURSE_BREAK,
		"��","��","��","Ѽ","��",
		Const.COURSE_BREAK,
		"��","��","Ϻ","��","��",
	};
	
	public static final HashMap<String, Integer> mSoundMap = new HashMap<String, Integer>() {
		{
		put("Ц", Const.SOUND_INVALID);
		}
	};
}
