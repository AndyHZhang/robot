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
		put("ÃÅ", R.raw.sound056);
		put("´°", R.raw.sound057);
		put("Êé", R.raw.sound058);
		put("µÆ", R.raw.sound059);
		put("¾µ", R.raw.sound060);
		put("ÒÂ", R.raw.sound061);
		put("¿ã", R.raw.sound062);
		put("Ð¬", R.raw.sound063);
		put("Íà", R.raw.sound064);
		put("Ã±", R.raw.sound065);
		put("¹ø", R.raw.sound066);
		put("Íë", R.raw.sound067);
		put("¿ê", R.raw.sound068);
		put("É×", R.raw.sound069);
		put("ÅÌ", R.raw.sound070);
		
		put("ÖÓ", R.raw.sound076);
		put("Ç½", R.raw.sound077);
		put("×À", R.raw.sound078);
		put("ÒÎ", R.raw.sound079);
		put("»­", R.raw.sound080);
		put("»¨", R.raw.sound081);
		put("Äñ", R.raw.sound082);
		put("³æ", R.raw.sound083);
		put("Óã", R.raw.sound084);
		put("Ïº", R.raw.sound085);
		put("Ã¨", R.raw.sound086);
		put("¹·", R.raw.sound087);
		put("¼¦", R.raw.sound088);
		put("Ñ¼", R.raw.sound089);
		put("ÍÃ", R.raw.sound090);
		
		put("Àº", Const.SOUND_INVALID);
		put("µÊ", Const.SOUND_INVALID);
		put("Æ¿", Const.SOUND_INVALID);
		put("±­", Const.SOUND_INVALID);
		put("µú", Const.SOUND_INVALID);
		put("µ¶", Const.SOUND_INVALID);
		put("Ë®", Const.SOUND_INVALID);
		put("±í", Const.SOUND_INVALID);
		put("ÉÈ", Const.SOUND_INVALID);
		put("±Ê", Const.SOUND_INVALID);
		put("Ö½", Const.SOUND_INVALID);
		put("±¨", Const.SOUND_INVALID);
		put("Í·", Const.SOUND_INVALID);
		put("ÑÛ", Const.SOUND_INVALID);
		put("±Ç", Const.SOUND_INVALID);
		put("Á³", Const.SOUND_INVALID);
		put("ÊÖ", Const.SOUND_INVALID);
		put("½Å", Const.SOUND_INVALID);
		put("×ì", Const.SOUND_INVALID);
		put("¶ú", Const.SOUND_INVALID);
		put("Å£", Const.SOUND_INVALID);
		put("Ñò", Const.SOUND_INVALID);
		put("Öí", Const.SOUND_INVALID);
		put("¹ê", Const.SOUND_INVALID);
		put("Ê÷", Const.SOUND_INVALID);
		put("²Ý", Const.SOUND_INVALID);
		put("ÌÇ", Const.SOUND_INVALID);
		put("¹Ï", Const.SOUND_INVALID);
		put("±ý", Const.SOUND_INVALID);
		put("×ß", Const.SOUND_INVALID);
		put("ÅÀ", Const.SOUND_INVALID);
		put("ÅÜ", Const.SOUND_INVALID);
		put("Ìø", Const.SOUND_INVALID);
		put("±§", Const.SOUND_INVALID);
		put("¶×", Const.SOUND_INVALID);
		put("Õ¾", Const.SOUND_INVALID);
		put("Ò©", Const.SOUND_INVALID);
		put("Ìì", Const.SOUND_INVALID);
		put("µØ", Const.SOUND_INVALID);
		put("É½", Const.SOUND_INVALID);
		put("·ç", Const.SOUND_INVALID);
		put("Óê", Const.SOUND_INVALID);
		put("ºþ", Const.SOUND_INVALID);
		put("ºÓ", Const.SOUND_INVALID);
		put("ºÐ", Const.SOUND_INVALID);
		put("»ð", Const.SOUND_INVALID);
		put("¹Þ", Const.SOUND_INVALID);
		put("Ã×", Const.SOUND_INVALID);
		put("²è", Const.SOUND_INVALID);
		put("Ìð", Const.SOUND_INVALID);
		put("Ëá", Const.SOUND_INVALID);
		put("¿à", Const.SOUND_INVALID);
		put("À±", Const.SOUND_INVALID);
		put("ºì", Const.SOUND_INVALID);
		put("»Æ", Const.SOUND_INVALID);
		put("ÂÌ", Const.SOUND_INVALID);
		put("ºÚ", Const.SOUND_INVALID);
		put("°×", Const.SOUND_INVALID);
		put("¿Þ", Const.SOUND_INVALID);
		put("Ð¦", Const.SOUND_INVALID);
		}
	};
}
