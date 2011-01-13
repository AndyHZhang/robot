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
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","Ь","��","ñ",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","ǽ","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","Ϻ"
	};
	public final static String[] CourseData2_1 = { 
		"��","��","��","��","è",Const.COURSE_BREAK,
		"��","Ь","��","ñ","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"ǽ","��","��","��","Ѽ",Const.COURSE_BREAK,
		"��","��","��","Ϻ","��"
	};
	public final static String[] CourseData3_1 = { 
		"��","��","��","è","��",Const.COURSE_BREAK,
		"Ь","��","ñ","��","��",Const.COURSE_BREAK,
		"��","��","��","��","ƿ",Const.COURSE_BREAK,
		"��","��","��","Ѽ","��",Const.COURSE_BREAK,
		"��","��","Ϻ","��","��"
	};
	public final static String[] CourseData4_1 = { 
		"��","��","è","��","��",Const.COURSE_BREAK,
		"��","ñ","��","��","ˮ",Const.COURSE_BREAK,
		"��","��","��","ƿ","��",Const.COURSE_BREAK,
		"��","��","Ѽ","��","��",Const.COURSE_BREAK,
		"��","Ϻ","��","��","��"
	};
	public final static String[] CourseData5_1 = { 
		"��","è","��","��","ֽ",Const.COURSE_BREAK,
		"ñ","��","��","ˮ","��",Const.COURSE_BREAK,
		"��","��","ƿ","��","ͷ",Const.COURSE_BREAK,
		"��","Ѽ","��","��","��",Const.COURSE_BREAK,
		"Ϻ","��","��","��","��"
	};
	public final static String[] CourseData6_1 = { 
		"è","��","��","ֽ","��",Const.COURSE_BREAK,
		"��","��","ˮ","��","��",Const.COURSE_BREAK,
		"��","ƿ","��","ͷ","��",Const.COURSE_BREAK,
		"Ѽ","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��"
	};
	public final static String[] CourseData7_1 = { 
		"��","��","ֽ","��","ţ",Const.COURSE_BREAK,
		"��","ˮ","��","��","��",Const.COURSE_BREAK,
		"ƿ","��","ͷ","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��"
	};
	public final static String[] CourseData8_1 = { 
		"��","ֽ","��","ţ","��",Const.COURSE_BREAK,
		"ˮ","��","��","��","��",Const.COURSE_BREAK,
		"��","ͷ","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��"
	};
	public final static String[] CourseData9_1 = { 
		"ֽ","��","ţ","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"ͷ","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��"
	};
	public final static String[] CourseData10_1 = { 
		"��","ţ","��","��","վ",Const.COURSE_BREAK,
		"��","��","��","��","ҩ",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","ɽ"
	};
	public final static String[] CourseData11_1 = { 
		"ţ","��","��","վ","��",Const.COURSE_BREAK,
		"��","��","��","ҩ","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","ɽ","��"
	};
	public final static String[] CourseData12_1 = { 
		"��","��","վ","��","��",Const.COURSE_BREAK,
		"��","��","ҩ","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","ɽ","��","��"
	};
	public final static String[] CourseData13_1 = { 
		"��","վ","��","��","��",Const.COURSE_BREAK,
		"��","ҩ","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","ɽ","��","��","��"
	};
	public final static String[] CourseData14_1 = { 
		"վ","��","��","��","��",Const.COURSE_BREAK,
		"ҩ","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"ɽ","��","��","��","Ц"
	};
	public final static String[] CourseData15_1 = { 
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","Ц","��"
	};
	public final static String[] CourseData16_1 = { 
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","Ь",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","Ц","��","ñ"
	};
	public final static String[] CourseData17_1 = { 
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","Ь","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","Ц","��","ñ","��"
	};
	public final static String[] CourseData18_1 = { 
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","ǽ",Const.COURSE_BREAK,
		"��","��","Ь","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"Ц","��","ñ","��","��"
	};
	public final static String[] CourseData19_1 = { 
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","��","��","ǽ","��",Const.COURSE_BREAK,
		"��","Ь","��","��","��",Const.COURSE_BREAK,
		"��","��","��","��","��",Const.COURSE_BREAK,
		"��","ñ","��","��","Ϻ"
	};
	
	public static final HashMap<String, Integer> mSoundMap = new HashMap<String, Integer>() {
		{
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("Ь", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("ñ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		
		put("��", Const.SOUND_INVALID);
		put("ǽ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("Ϻ", Const.SOUND_INVALID);
		put("è", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		put("Ѽ", Const.SOUND_INVALID);
		put("��", Const.SOUND_INVALID);
		
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
