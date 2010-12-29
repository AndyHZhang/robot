package com.robot.study.chinese0;

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
	
	public final static String PACKAGE_NAME = "com.robot.study.chinese0";
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
		put("��", R.raw.sound056);
		put("��", R.raw.sound057);
		put("��", R.raw.sound058);
		put("��", R.raw.sound059);
		put("��", R.raw.sound060);
		put("��", R.raw.sound061);
		put("��", R.raw.sound062);
		put("Ь", R.raw.sound063);
		put("��", R.raw.sound064);
		put("ñ", R.raw.sound065);
		put("��", R.raw.sound066);
		put("��", R.raw.sound067);
		put("��", R.raw.sound068);
		put("��", R.raw.sound069);
		put("��", R.raw.sound070);
		
		put("��", R.raw.sound076);
		put("ǽ", R.raw.sound077);
		put("��", R.raw.sound078);
		put("��", R.raw.sound079);
		put("��", R.raw.sound080);
		put("��", R.raw.sound081);
		put("��", R.raw.sound082);
		put("��", R.raw.sound083);
		put("��", R.raw.sound084);
		put("Ϻ", R.raw.sound085);
		put("è", R.raw.sound086);
		put("��", R.raw.sound087);
		put("��", R.raw.sound088);
		put("Ѽ", R.raw.sound089);
		put("��", R.raw.sound090);
		
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ƿ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ˮ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ֽ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ͷ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ţ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("վ", Const.SOUND_INVALID);
		put("ҩ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ɽ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("Ц", Const.SOUND_INVALID);
		}
	};
}
