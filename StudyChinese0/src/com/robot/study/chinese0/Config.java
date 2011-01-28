package com.robot.study.chinese0;

import java.util.ArrayList;
import java.util.HashMap;

import com.robot.study.Const;
import com.robot.study.Course;
import com.robot.study.Progress;

public class Config {
	
	public final static int COURSE_PLAYER_LAYOUT_ID = R.layout.courses;
	public final static int TEXT_WIDGET_ID = R.id.text;
	public final static int STRING_NEXT_COURSE = R.string.next_course;
	
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
		
		put("��", R.raw.sound091);
		put("��", R.raw.sound092);
		put("ƿ", R.raw.sound093);
		put("��", R.raw.sound094);
		put("��", R.raw.sound095);
		put("��", R.raw.sound096);
		put("ˮ", R.raw.sound097);
		put("��", R.raw.sound098);
		put("��", R.raw.sound099);
		put("��", R.raw.sound100);
		put("ֽ", R.raw.sound101);
		put("��", R.raw.sound102);
		put("ͷ", R.raw.sound103);
		put("��", R.raw.sound104);
		put("��", R.raw.sound105);
		put("��", R.raw.sound106);
		put("��", R.raw.sound107);
		put("��", R.raw.sound108);
		put("��", R.raw.sound109);
		put("��", R.raw.sound110);
		put("ţ", R.raw.sound111);
		put("��", R.raw.sound112);
		put("��", R.raw.sound113);
		put("��", R.raw.sound114);
		put("��", R.raw.sound115);
		put("��", R.raw.sound116);
		put("��", R.raw.sound117);
		put("��", R.raw.sound118);
		put("��", R.raw.sound119);
		put("��", R.raw.sound120);
		put("��", R.raw.sound121);
		put("��", R.raw.sound122);
		put("��", R.raw.sound123);
		put("��", R.raw.sound124);
		put("��", R.raw.sound125);
		put("վ", R.raw.sound126);
		put("ҩ", R.raw.sound127);
		put("��", R.raw.sound128);
		put("��", R.raw.sound129);
		put("ɽ", R.raw.sound130);
		put("��", R.raw.sound131);
		put("��", R.raw.sound132);
		put("��", R.raw.sound133);
		put("��", R.raw.sound134);
		put("��", R.raw.sound135);
		put("��", R.raw.sound136);
		put("��", R.raw.sound137);
		put("��", R.raw.sound138);
		put("��", R.raw.sound139);
		put("��", R.raw.sound140);
		put("��", R.raw.sound141);
		put("��", R.raw.sound142);
		put("��", R.raw.sound143);
		put("��", R.raw.sound144);
		put("��", R.raw.sound145);
		put("��", R.raw.sound146);
		put("��", R.raw.sound147);
		put("��", R.raw.sound148);
		put("��", R.raw.sound149);
		put("Ц", R.raw.sound150);
		}
	};
}
