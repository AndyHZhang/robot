package com.robot.language.unit0206;

import java.util.ArrayList;

import com.robot.language.common.PlayerBaseActivity;

public class Player extends PlayerBaseActivity {

	public static final int TOTAL_NUMBER = 10;

	public static final int[] PIC = { R.drawable.pic01, R.drawable.pic02,
			R.drawable.pic03, R.drawable.pic04, R.drawable.pic05,
			R.drawable.pic06, R.drawable.pic07, R.drawable.pic08,
			R.drawable.pic09, R.drawable.pic10 };

	public static final int[] TEXT_CN = { R.drawable.cn00, R.drawable.cn01,
			R.drawable.cn02, R.drawable.cn03, R.drawable.cn04, R.drawable.cn05,
			R.drawable.cn06, R.drawable.cn07, R.drawable.cn08, R.drawable.cn09,
			R.drawable.cn10 };
	public static final int[] TEXT_EN = { R.drawable.en00, R.drawable.en01,
			R.drawable.en02, R.drawable.en03, R.drawable.en04, R.drawable.en05,
			R.drawable.en06, R.drawable.en07, R.drawable.en08, R.drawable.en09,
			R.drawable.en10 };
	public static final int[] TEXT_ES = { R.drawable.es00, R.drawable.es01,
			R.drawable.es02, R.drawable.es03, R.drawable.es04, R.drawable.es05,
			R.drawable.es06, R.drawable.es07, R.drawable.es08, R.drawable.es09,
			R.drawable.es10 };
	public static final int[] TEXT_FR = { R.drawable.fr00, R.drawable.fr01,
			R.drawable.fr02, R.drawable.fr03, R.drawable.fr04, R.drawable.fr05,
			R.drawable.fr06, R.drawable.fr07, R.drawable.fr08, R.drawable.fr09,
			R.drawable.fr10 };
	public static final int[] TEXT_IT = { R.drawable.it00, R.drawable.it01,
			R.drawable.it02, R.drawable.it03, R.drawable.it04, R.drawable.it05,
			R.drawable.it06, R.drawable.it07, R.drawable.it08, R.drawable.it09,
			R.drawable.it10 };
	public static final int[] TEXT_JP = { R.drawable.jp00, R.drawable.jp01,
			R.drawable.jp02, R.drawable.jp03, R.drawable.jp04, R.drawable.jp05,
			R.drawable.jp06, R.drawable.jp07, R.drawable.jp08, R.drawable.jp09,
			R.drawable.jp10 };

	public static final int[] TEXT_SOUND_CN = { R.raw.cn00, R.raw.cn01,
			R.raw.cn02, R.raw.cn03, R.raw.cn04, R.raw.cn05, R.raw.cn06,
			R.raw.cn07, R.raw.cn08, R.raw.cn09, R.raw.cn10 };
	public static final int[] TEXT_SOUND_EN = { R.raw.en00, R.raw.en01,
			R.raw.en02, R.raw.en03, R.raw.en04, R.raw.en05, R.raw.en06,
			R.raw.en07, R.raw.en08, R.raw.en09, R.raw.en10 };
	public static final int[] TEXT_SOUND_ES = { R.raw.es00, R.raw.es01,
			R.raw.es02, R.raw.es03, R.raw.es04, R.raw.es05, R.raw.es06,
			R.raw.es07, R.raw.es08, R.raw.es09, R.raw.es10 };
	public static final int[] TEXT_SOUND_FR = { R.raw.fr00, R.raw.fr01,
			R.raw.fr02, R.raw.fr03, R.raw.fr04, R.raw.fr05, R.raw.fr06,
			R.raw.fr07, R.raw.fr08, R.raw.fr09, R.raw.fr10 };
	public static final int[] TEXT_SOUND_IT = { R.raw.it00, R.raw.it01,
			R.raw.it02, R.raw.it03, R.raw.it04, R.raw.it05, R.raw.it06,
			R.raw.it07, R.raw.it08, R.raw.it09, R.raw.it10 };
	public static final int[] TEXT_SOUND_JP = { R.raw.jp00, R.raw.jp01,
			R.raw.jp02, R.raw.jp03, R.raw.jp04, R.raw.jp05, R.raw.jp06,
			R.raw.jp07, R.raw.jp08, R.raw.jp09, R.raw.jp10 };
	
	private void fillTitle(ArrayList<Integer> imgArray,
			ArrayList<Integer> sndArray) {
		if (bCNSelected) {
			imgArray.add(TEXT_CN[0]);
			sndArray.add(TEXT_SOUND_CN[0]);
			return;
		}

		if (bENSelected) {
			imgArray.add(TEXT_EN[0]);
			sndArray.add(TEXT_SOUND_EN[0]);
			return;
		}
		
		if (bJPSelected) {
			imgArray.add(TEXT_JP[0]);
			sndArray.add(TEXT_SOUND_JP[0]);
			return;
		}

		if (bFRSelected) {
			imgArray.add(TEXT_FR[0]);
			sndArray.add(TEXT_SOUND_FR[0]);
			return;
		}

		if (bITSelected) {
			imgArray.add(TEXT_IT[0]);
			sndArray.add(TEXT_SOUND_IT[0]);
			return;
		}

		if (bESSelected) {
			imgArray.add(TEXT_ES[0]);
			sndArray.add(TEXT_SOUND_ES[0]);
			return;
		}
	}

	public void createArrayList(ArrayList<Integer> imgArray,
			ArrayList<Integer> sndArray) {
		
		fillTitle(imgArray, sndArray);
		
		for (int i = 0; i < TOTAL_NUMBER; i++) {
			if (bTextSelected) {
				if (bCNSelected) {
					imgArray.add(TEXT_CN[i+1]);
					sndArray.add(TEXT_SOUND_CN[i+1]);
				}

				if (bENSelected) {
					imgArray.add(TEXT_EN[i+1]);
					sndArray.add(TEXT_SOUND_EN[i+1]);
				}

				if (bESSelected) {
					imgArray.add(TEXT_ES[i+1]);
					sndArray.add(TEXT_SOUND_ES[i+1]);
				}

				if (bFRSelected) {
					imgArray.add(TEXT_FR[i+1]);
					sndArray.add(TEXT_SOUND_FR[i+1]);
				}

				if (bITSelected) {
					imgArray.add(TEXT_IT[i+1]);
					sndArray.add(TEXT_SOUND_IT[i+1]);
				}

				if (bJPSelected) {
					imgArray.add(TEXT_JP[i+1]);
					sndArray.add(TEXT_SOUND_JP[i+1]);
				}
			}

			if (bImageSelected) {
				if (bTextSelected) {
					imgArray.add(PIC[i]);
					sndArray.add(PlayerBaseActivity.SND_INVALID);
				} else {
					if (bCNSelected) {
						imgArray.add(PIC[i]);
						sndArray.add(TEXT_SOUND_CN[i+1]);
					}

					if (bENSelected) {
						imgArray.add(PIC[i]);
						sndArray.add(TEXT_SOUND_EN[i+1]);
					}

					if (bESSelected) {
						imgArray.add(PIC[i]);
						sndArray.add(TEXT_SOUND_ES[i+1]);
					}

					if (bFRSelected) {
						imgArray.add(PIC[i]);
						sndArray.add(TEXT_SOUND_FR[i+1]);
					}

					if (bITSelected) {
						imgArray.add(PIC[i]);
						sndArray.add(TEXT_SOUND_IT[i+1]);
					}

					if (bJPSelected) {
						imgArray.add(PIC[i]);
						sndArray.add(TEXT_SOUND_JP[i+1]);
					}
				}
			}
		}
	}
}
