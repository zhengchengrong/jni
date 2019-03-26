/*
 * Copyright (c)$today.year.month.day
 *  admin:郑程荣.
 *  文件名:JniCTest.java
 *  项目功能:
 */

package zcr.com.ndk;

/**
 * Created by llz on 2019/3/26.
 */
public class JniCTest {

    public  String key = "key";
    static {
        System.loadLibrary("JniClib");
    }
    public native static String getStringFromC();
    public native  String accessField();

    public static void main(String[] args){
        JniCTest jniCTest = new JniCTest();
        jniCTest.accessField();
    }

}
