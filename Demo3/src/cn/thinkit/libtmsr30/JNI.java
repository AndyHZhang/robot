package cn.thinkit.libtmsr30;

public class JNI
{
	public native int  msrInit();
	public native int  msrInitWithPenalty(int penalty);
	public native int  msrExit();
	public native int  msrOpen();
	public native int  msrClose();
	public native int  msrStart();
	public native int  msrStop();
	public native long msrCreateVocabulary(int size);
	public native int  msrAddActiveWord(long hVoc, String strWord);
	public native int  msrSetVocabularyToDecoder(long hVoc);
	public native int  msrRemoveVocabularyFromDecoder(long hVoc);
	public native int  msrDestroyVocabulary(long hVoc);
	public native void msrSendData(short[] pDataBuf, int iLen);
	public native String msrRecognize();
	public native void msrSetLogLevel(int loglevel);
	public native void msrSetSerialNumber(int sn1, int sn2, int sn3);
}

