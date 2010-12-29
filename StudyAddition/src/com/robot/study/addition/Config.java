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
		"ÃÅ","´°","Êé","µÆ","¾µ",
		Const.COURSE_BREAK,
		"ÒÂ","¿ã","Ð¬","Íà","Ã±",
		Const.COURSE_BREAK,
		"¹ø","Íë","¿ê","É×","ÅÌ",
		Const.COURSE_BREAK,
		"ÖÓ","Ç½","×À","ÒÎ","»­",
		Const.COURSE_BREAK,
		"»¨","Äñ","³æ","Óã","Ïº"
	};
	
	public final static String[] CourseData02 = { 
		"´°","Êé","µÆ","¾µ","Ã¨",
		Const.COURSE_BREAK,
		"¿ã","Ð¬","Íà","Ã±","¹·",
		Const.COURSE_BREAK,
		"Íë","¿ê","É×","ÅÌ","¼¦",
		Const.COURSE_BREAK,
		"Ç½","×À","ÒÎ","»­","Ñ¼",
		Const.COURSE_BREAK,
		"Äñ","³æ","Óã","Ïº","ÍÃ"
	};
	
	public final static String[] CourseData03 = { 
		"Êé","µÆ","¾µ","Ã¨","Àº",
		Const.COURSE_BREAK,
		"Ð¬","Íà","Ã±","¹·","µÊ",
		Const.COURSE_BREAK,
		"¿ê","É×","ÅÌ","¼¦","Æ¿",
		Const.COURSE_BREAK,
		"×À","ÒÎ","»­","Ñ¼","±­",
		Const.COURSE_BREAK,
		"³æ","Óã","Ïº","ÍÃ","µú",
	};
	
	public static final HashMap<String, Integer> mSoundMap = new HashMap<String, Integer>() {
		{
		put("Ð¦", Const.SOUND_INVALID);
		}
	};
}
