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
		
		put("Àº", R.raw.sound091);
		put("µÊ", R.raw.sound092);
		put("Æ¿", R.raw.sound093);
		put("±­", R.raw.sound094);
		put("µú", R.raw.sound095);
		put("µ¶", R.raw.sound096);
		put("Ë®", R.raw.sound097);
		put("±í", R.raw.sound098);
		put("ÉÈ", R.raw.sound099);
		put("±Ê", R.raw.sound100);
		put("Ö½", R.raw.sound101);
		put("±¨", R.raw.sound102);
		put("Í·", R.raw.sound103);
		put("ÑÛ", R.raw.sound104);
		put("±Ç", R.raw.sound105);
		put("Á³", R.raw.sound106);
		put("ÊÖ", R.raw.sound107);
		put("½Å", R.raw.sound108);
		put("×ì", R.raw.sound109);
		put("¶ú", R.raw.sound110);
		put("Å£", R.raw.sound111);
		put("Ñò", R.raw.sound112);
		put("Öí", R.raw.sound113);
		put("¹ê", R.raw.sound114);
		put("Ê÷", R.raw.sound115);
		put("²Ý", R.raw.sound116);
		put("ÌÇ", R.raw.sound117);
		put("¹Ï", R.raw.sound118);
		put("±ý", R.raw.sound119);
		put("×ß", R.raw.sound120);
		put("ÅÀ", R.raw.sound121);
		put("ÅÜ", R.raw.sound122);
		put("Ìø", R.raw.sound123);
		put("±§", R.raw.sound124);
		put("¶×", R.raw.sound125);
		put("Õ¾", R.raw.sound126);
		put("Ò©", R.raw.sound127);
		put("Ìì", R.raw.sound128);
		put("µØ", R.raw.sound129);
		put("É½", R.raw.sound130);
		put("·ç", R.raw.sound131);
		put("Óê", R.raw.sound132);
		put("ºþ", R.raw.sound133);
		put("ºÓ", R.raw.sound134);
		put("ºÐ", R.raw.sound135);
		put("»ð", R.raw.sound136);
		put("¹Þ", R.raw.sound137);
		put("Ã×", R.raw.sound138);
		put("²è", R.raw.sound139);
		put("Ìð", R.raw.sound140);
		put("Ëá", R.raw.sound141);
		put("¿à", R.raw.sound142);
		put("À±", R.raw.sound143);
		put("ºì", R.raw.sound144);
		put("»Æ", R.raw.sound145);
		put("ÂÌ", R.raw.sound146);
		put("ºÚ", R.raw.sound147);
		put("°×", R.raw.sound148);
		put("¿Þ", R.raw.sound149);
		put("Ð¦", R.raw.sound150);
		}
	};
}
