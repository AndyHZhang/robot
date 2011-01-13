package com.robot.study.chinese0;

import java.util.ArrayList;
import java.util.HashMap;

import com.robot.study.Const;
import com.robot.study.Course;
import com.robot.study.Progress;

public class Config {
	
	public final static int WELCOME_LAYOUT_ID = R.layout.welcome;
	public final static int SETTINGS_LAYOUT_ID = R.layout.settings;
	public final static int PROGRESS_SELECTOR_LAYOUT_ID = R.layout.progress_selector;
	public final static int COURSE_SELECTOR_LAYOUT_ID = R.layout.course_selector;
	public final static int COURSE_PLAYER_LAYOUT_ID = R.layout.courses;
	public final static int GRID_WIDGET_ID = R.id.grid;
	public final static int SEEKBAR_WIDGET_ID = R.id.seek;
	public final static int GALLERY_WIDGET_ID = R.id.gallery;
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
			
			Progress p;
			Course c1 = new Course(R.drawable.course01, Config.CourseData1_1);
			Course c2 = new Course(R.drawable.course02, Config.CourseData2_1);
			Course c3 = new Course(R.drawable.course03, Config.CourseData3_1);
			Course c4 = new Course(R.drawable.course01, Config.CourseData4_1);
			Course c5 = new Course(R.drawable.course02, Config.CourseData5_1);
			Course c6 = new Course(R.drawable.course03, Config.CourseData6_1);
			Course c7 = new Course(R.drawable.course01, Config.CourseData7_1);
			Course c8 = new Course(R.drawable.course02, Config.CourseData8_1);
			Course c9 = new Course(R.drawable.course03, Config.CourseData9_1);
			Course c10 = new Course(R.drawable.course01, Config.CourseData10_1);
			Course c11 = new Course(R.drawable.course02, Config.CourseData11_1);
			Course c12 = new Course(R.drawable.course03, Config.CourseData12_1);
			Course c13 = new Course(R.drawable.course01, Config.CourseData13_1);
			Course c14 = new Course(R.drawable.course02, Config.CourseData14_1);
			Course c15 = new Course(R.drawable.course03, Config.CourseData15_1);
			Course c16 = new Course(R.drawable.course01, Config.CourseData16_1);
			Course c17 = new Course(R.drawable.course02, Config.CourseData17_1);
			Course c18 = new Course(R.drawable.course03, Config.CourseData18_1);
			Course c19 = new Course(R.drawable.course01, Config.CourseData19_1);
			
			// Day 1
			p = new Progress(R.drawable.day01);
			p.addCourse(c1).addCourse(c2).addCourse(c3);
			mProgresses.add(p);
			// Day 2
			p = new Progress(R.drawable.day02);
			p.addCourse(c1).addCourse(c2).addCourse(c3);
			mProgresses.add(p);
			// Day 3
			p = new Progress(R.drawable.day03);
			p.addCourse(c1).addCourse(c2).addCourse(c3);
			mProgresses.add(p);
			// Day 4
			p = new Progress(R.drawable.day04);
			p.addCourse(c4).addCourse(c5).addCourse(c6);
			mProgresses.add(p);
			// Day 5
			p = new Progress(R.drawable.day05);
			p.addCourse(c4).addCourse(c5).addCourse(c6);
			mProgresses.add(p);
			// Day 6
			p = new Progress(R.drawable.day06);
			p.addCourse(c4).addCourse(c5).addCourse(c6);
			mProgresses.add(p);
			// Day 7
			p = new Progress(R.drawable.day07);
			p.addCourse(c7).addCourse(c8).addCourse(c9);
			mProgresses.add(p);
			// Day 8
			p = new Progress(R.drawable.day08);
			p.addCourse(c7).addCourse(c8).addCourse(c9);
			mProgresses.add(p);
			// Day 9
			p = new Progress(R.drawable.day09);
			p.addCourse(c7).addCourse(c8).addCourse(c9);
			mProgresses.add(p);
			// Day 10
			p = new Progress(R.drawable.day10);
			p.addCourse(c10).addCourse(c11).addCourse(c12);
			mProgresses.add(p);
			// Day 11
			p = new Progress(R.drawable.day11);
			p.addCourse(c10).addCourse(c11).addCourse(c12);
			mProgresses.add(p);
			// Day 12
			p = new Progress(R.drawable.day12);
			p.addCourse(c10).addCourse(c11).addCourse(c12);
			mProgresses.add(p);
			// Day 13
			p = new Progress(R.drawable.day13);
			p.addCourse(c13).addCourse(c14).addCourse(c15);
			mProgresses.add(p);
			// Day 14
			p = new Progress(R.drawable.day14);
			p.addCourse(c13).addCourse(c14).addCourse(c15);
			mProgresses.add(p);
			// Day 15
			p = new Progress(R.drawable.day15);
			p.addCourse(c13).addCourse(c14).addCourse(c15);
			mProgresses.add(p);
			// Day 16
			p = new Progress(R.drawable.day16);
			p.addCourse(c16).addCourse(c17).addCourse(c18);
			mProgresses.add(p);
			// Day 17
			p = new Progress(R.drawable.day17);
			p.addCourse(c16).addCourse(c17).addCourse(c18);
			mProgresses.add(p);
			// Day 18
			p = new Progress(R.drawable.day18);
			p.addCourse(c16).addCourse(c17).addCourse(c18);
			mProgresses.add(p);
			// Day 19
			p = new Progress(R.drawable.day19);
			p.addCourse(c19).addCourse(c2).addCourse(c3);
			mProgresses.add(p);
			
		}
		
		return mProgresses;
	}
	
	public final static String[] CourseData1_1 = { 
		"ÃÅ","´°","Êé","µÆ","¾µ",Const.COURSE_BREAK,
		"ÒÂ","¿ã","Ð¬","Íà","Ã±",Const.COURSE_BREAK,
		"¹ø","Íë","¿ê","É×","ÅÌ",Const.COURSE_BREAK,
		"ÖÓ","Ç½","×À","ÒÎ","»­",Const.COURSE_BREAK,
		"»¨","Äñ","³æ","Óã","Ïº"
	};
	public final static String[] CourseData2_1 = { 
		"´°","Êé","µÆ","¾µ","Ã¨",Const.COURSE_BREAK,
		"¿ã","Ð¬","Íà","Ã±","¹·",Const.COURSE_BREAK,
		"Íë","¿ê","É×","ÅÌ","¼¦",Const.COURSE_BREAK,
		"Ç½","×À","ÒÎ","»­","Ñ¼",Const.COURSE_BREAK,
		"Äñ","³æ","Óã","Ïº","ÍÃ"
	};
	public final static String[] CourseData3_1 = { 
		"Êé","µÆ","¾µ","Ã¨","Àº",Const.COURSE_BREAK,
		"Ð¬","Íà","Ã±","¹·","µÊ",Const.COURSE_BREAK,
		"¿ê","É×","ÅÌ","¼¦","Æ¿",Const.COURSE_BREAK,
		"×À","ÒÎ","»­","Ñ¼","±­",Const.COURSE_BREAK,
		"³æ","Óã","Ïº","ÍÃ","µú"
	};
	public final static String[] CourseData4_1 = { 
		"µÆ","¾µ","Ã¨","Àº","µ¶",Const.COURSE_BREAK,
		"Íà","Ã±","¹·","µÊ","Ë®",Const.COURSE_BREAK,
		"É×","ÅÌ","¼¦","Æ¿","±í",Const.COURSE_BREAK,
		"ÒÎ","»­","Ñ¼","±­","ÉÈ",Const.COURSE_BREAK,
		"Óã","Ïº","ÍÃ","µú","±Ê"
	};
	public final static String[] CourseData5_1 = { 
		"¾µ","Ã¨","Àº","µ¶","Ö½",Const.COURSE_BREAK,
		"Ã±","¹·","µÊ","Ë®","±¨",Const.COURSE_BREAK,
		"ÅÌ","¼¦","Æ¿","±í","Í·",Const.COURSE_BREAK,
		"»­","Ñ¼","±­","ÉÈ","ÑÛ",Const.COURSE_BREAK,
		"Ïº","ÍÃ","µú","±Ê","±Ç"
	};
	public final static String[] CourseData6_1 = { 
		"Ã¨","Àº","µ¶","Ö½","Á³",Const.COURSE_BREAK,
		"¹·","µÊ","Ë®","±¨","ÊÖ",Const.COURSE_BREAK,
		"¼¦","Æ¿","±í","Í·","½Å",Const.COURSE_BREAK,
		"Ñ¼","±­","ÉÈ","ÑÛ","×ì",Const.COURSE_BREAK,
		"ÍÃ","µú","±Ê","±Ç","¶ú"
	};
	public final static String[] CourseData7_1 = { 
		"Àº","µ¶","Ö½","Á³","Å£",Const.COURSE_BREAK,
		"µÊ","Ë®","±¨","ÊÖ","Ñò",Const.COURSE_BREAK,
		"Æ¿","±í","Í·","½Å","Öí",Const.COURSE_BREAK,
		"±­","ÉÈ","ÑÛ","×ì","¹ê",Const.COURSE_BREAK,
		"µú","±Ê","±Ç","¶ú","Ê÷"
	};
	public final static String[] CourseData8_1 = { 
		"µ¶","Ö½","Á³","Å£","²Ý",Const.COURSE_BREAK,
		"Ë®","±¨","ÊÖ","Ñò","ÌÇ",Const.COURSE_BREAK,
		"±í","Í·","½Å","Öí","¹Ï",Const.COURSE_BREAK,
		"ÉÈ","ÑÛ","×ì","¹ê","±ý",Const.COURSE_BREAK,
		"±Ê","±Ç","¶ú","Ê÷","×ß"
	};
	public final static String[] CourseData9_1 = { 
		"Ö½","Á³","Å£","²Ý","ÅÀ",Const.COURSE_BREAK,
		"±¨","ÊÖ","Ñò","ÌÇ","Ìø",Const.COURSE_BREAK,
		"Í·","½Å","Öí","¹Ï","ÅÜ",Const.COURSE_BREAK,
		"ÑÛ","×ì","¹ê","±ý","±§",Const.COURSE_BREAK,
		"±Ç","¶ú","Ê÷","×ß","¶×"
	};
	public final static String[] CourseData10_1 = { 
		"Á³","Å£","²Ý","ÅÀ","Õ¾",Const.COURSE_BREAK,
		"ÊÖ","Ñò","ÌÇ","Ìø","Ò©",Const.COURSE_BREAK,
		"½Å","Öí","¹Ï","ÅÜ","Ìì",Const.COURSE_BREAK,
		"×ì","¹ê","±ý","±§","µØ",Const.COURSE_BREAK,
		"¶ú","Ê÷","×ß","¶×","É½"
	};
	public final static String[] CourseData11_1 = { 
		"Å£","²Ý","ÅÀ","Õ¾","·ç",Const.COURSE_BREAK,
		"Ñò","ÌÇ","Ìø","Ò©","Óê",Const.COURSE_BREAK,
		"Öí","¹Ï","ÅÜ","Ìì","ºþ",Const.COURSE_BREAK,
		"¹ê","±ý","±§","µØ","ºÓ",Const.COURSE_BREAK,
		"Ê÷","×ß","¶×","É½","ºÐ"
	};
	public final static String[] CourseData12_1 = { 
		"²Ý","ÅÀ","Õ¾","·ç","»ð",Const.COURSE_BREAK,
		"ÌÇ","Ìø","Ò©","Óê","¹Þ",Const.COURSE_BREAK,
		"¹Ï","ÅÜ","Ìì","ºþ","Ã×",Const.COURSE_BREAK,
		"±ý","±§","µØ","ºÓ","²è",Const.COURSE_BREAK,
		"×ß","¶×","É½","ºÐ","Ìð"
	};
	public final static String[] CourseData13_1 = { 
		"ÅÀ","Õ¾","·ç","»ð","¿à",Const.COURSE_BREAK,
		"Ìø","Ò©","Óê","¹Þ","Ëá",Const.COURSE_BREAK,
		"ÅÜ","Ìì","ºþ","Ã×","À±",Const.COURSE_BREAK,
		"±§","µØ","ºÓ","²è","ºì",Const.COURSE_BREAK,
		"¶×","É½","ºÐ","Ìð","»Æ"
	};
	public final static String[] CourseData14_1 = { 
		"Õ¾","·ç","»ð","¿à","ÂÌ",Const.COURSE_BREAK,
		"Ò©","Óê","¹Þ","Ëá","ºÚ",Const.COURSE_BREAK,
		"Ìì","ºþ","Ã×","À±","°×",Const.COURSE_BREAK,
		"µØ","ºÓ","²è","ºì","¿Þ",Const.COURSE_BREAK,
		"É½","ºÐ","Ìð","»Æ","Ð¦"
	};
	public final static String[] CourseData15_1 = { 
		"·ç","»ð","¿à","ÂÌ","ÃÅ",Const.COURSE_BREAK,
		"Óê","¹Þ","Ëá","ºÚ","´°",Const.COURSE_BREAK,
		"ºþ","Ã×","À±","°×","Êé",Const.COURSE_BREAK,
		"ºÓ","²è","ºì","¿Þ","µÆ",Const.COURSE_BREAK,
		"ºÐ","Ìð","»Æ","Ð¦","¾µ"
	};
	public final static String[] CourseData16_1 = { 
		"»ð","¿à","ÂÌ","ÃÅ","ÒÂ",Const.COURSE_BREAK,
		"¹Þ","Ëá","ºÚ","´°","¿ã",Const.COURSE_BREAK,
		"Ã×","À±","°×","Êé","Ð¬",Const.COURSE_BREAK,
		"²è","ºì","¿Þ","µÆ","Íà",Const.COURSE_BREAK,
		"Ìð","»Æ","Ð¦","¾µ","Ã±"
	};
	public final static String[] CourseData17_1 = { 
		"¿à","ÂÌ","ÃÅ","ÒÂ","¹ø",Const.COURSE_BREAK,
		"Ëá","ºÚ","´°","¿ã","Íë",Const.COURSE_BREAK,
		"À±","°×","Êé","Ð¬","¿ê",Const.COURSE_BREAK,
		"ºì","¿Þ","µÆ","Íà","É×",Const.COURSE_BREAK,
		"»Æ","Ð¦","¾µ","Ã±","ÅÌ"
	};
	public final static String[] CourseData18_1 = { 
		"ÂÌ","ÃÅ","ÒÂ","¹ø","ÖÓ",Const.COURSE_BREAK,
		"ºÚ","´°","¿ã","Íë","Ç½",Const.COURSE_BREAK,
		"°×","Êé","Ð¬","¿ê","×À",Const.COURSE_BREAK,
		"¿Þ","µÆ","Íà","É×","ÒÎ",Const.COURSE_BREAK,
		"Ð¦","¾µ","Ã±","ÅÌ","»­"
	};
	public final static String[] CourseData19_1 = { 
		"ÃÅ","ÒÂ","¹ø","ÖÓ","»¨",Const.COURSE_BREAK,
		"´°","¿ã","Íë","Ç½","Äñ",Const.COURSE_BREAK,
		"Êé","Ð¬","¿ê","×À","³æ",Const.COURSE_BREAK,
		"µÆ","Íà","É×","ÒÎ","Óã",Const.COURSE_BREAK,
		"¾µ","Ã±","ÅÌ","»­","Ïº"
	};
	
	public static final HashMap<String, Integer> mSoundMap = new HashMap<String, Integer>() {
		{
		put("ÃÅ", Const.SOUND_INVALID);
		put("´°", Const.SOUND_INVALID);
		put("Êé", Const.SOUND_INVALID);
		put("µÆ", Const.SOUND_INVALID);
		put("¾µ", Const.SOUND_INVALID);
		put("ÒÂ", Const.SOUND_INVALID);
		put("¿ã", Const.SOUND_INVALID);
		put("Ð¬", Const.SOUND_INVALID);
		put("Íà", Const.SOUND_INVALID);
		put("Ã±", Const.SOUND_INVALID);
		put("¹ø", Const.SOUND_INVALID);
		put("Íë", Const.SOUND_INVALID);
		put("¿ê", Const.SOUND_INVALID);
		put("É×", Const.SOUND_INVALID);
		put("ÅÌ", Const.SOUND_INVALID);
		
		put("ÖÓ", Const.SOUND_INVALID);
		put("Ç½", Const.SOUND_INVALID);
		put("×À", Const.SOUND_INVALID);
		put("ÒÎ", Const.SOUND_INVALID);
		put("»­", Const.SOUND_INVALID);
		put("»¨", Const.SOUND_INVALID);
		put("Äñ", Const.SOUND_INVALID);
		put("³æ", Const.SOUND_INVALID);
		put("Óã", Const.SOUND_INVALID);
		put("Ïº", Const.SOUND_INVALID);
		put("Ã¨", Const.SOUND_INVALID);
		put("¹·", Const.SOUND_INVALID);
		put("¼¦", Const.SOUND_INVALID);
		put("Ñ¼", Const.SOUND_INVALID);
		put("ÍÃ", Const.SOUND_INVALID);
		
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
