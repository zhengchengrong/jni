//
// Created by admin on 2019/3/26.
//
#define _CRT_SECURE_NO_WARNINGS
#include "zcr_com_ndk_JniCTest.h"
#include <string.h>
#include <stdlib.h>
//#include <Windows.h>

JNIEXPORT jstring JNICALL Java_zcr_com_ndk_JniCTest_getStringFromC
  (JNIEnv * env, jclass jcls){
      	return (*env)->NewStringUTF(env,"C String");
  }

JNIEXPORT jstring JNICALL Java_zcr_com_ndk_JniCTest_accessField
(JNIEnv *env, jobject jobj){
//jobj是t对象，JniTest.class
	jclass cls = (*env)->GetObjectClass(env, jobj);
	//jfieldID
	//属性名称，属性签名
	jfieldID fid = (*env)->GetFieldID(env, cls, "key", "Ljava/lang/String;");

	//jason >> super jason
	//获取key属性的值
	//Get<Type>Field
	jstring jstr = (*env)->GetObjectField(env, jobj, fid);
	printf("jstr:%#x\n",&jstr);

	//jstring -> c字符串
	//isCopy 是否复制（true代表赋值，false不复制）
	char *c_str = (*env)->GetStringUTFChars(env,jstr,JNI_FALSE);
	//拼接得到新的字符串
	char text[20] = "super ";
	strcat(text,c_str);

	//c字符串 ->jstring
	jstring new_jstr = (*env)->NewStringUTF(env, text);

	//修改key
	//Set<Type>Field
	(*env)->SetObjectField(env, jobj, fid, new_jstr);

	printf("new_jstr:%#x\n", &new_jstr);

	return new_jstr;
}