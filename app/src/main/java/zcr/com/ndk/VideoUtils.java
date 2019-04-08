/*
 * Copyright (c)$today.year.month.day
 *  zhengchengrong:郑程荣.
 *  文件名:VideoUtils.java
 *  项目功能:
 */

package zcr.com.ndk;

public class VideoUtils {

	public native static void decode(String input,String output);
	
	static{
		System.loadLibrary("avutil-54");
		System.loadLibrary("swresample-1");
		System.loadLibrary("avcodec-56");
		System.loadLibrary("avformat-56");
		System.loadLibrary("swscale-3");
		System.loadLibrary("postproc-53");
		System.loadLibrary("avfilter-5");
		System.loadLibrary("avdevice-56");
		System.loadLibrary("myffmpeg");
	}
}
