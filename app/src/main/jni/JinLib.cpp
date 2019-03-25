#include "zcr_com_ndk_JniTest.h"
#include <string.h>


/*
 * Class:     zcr_com_ndk_JniTest
 * Method:    getString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_zcr_com_ndk_JniTest_getString
  (JNIEnv * env, jclass jcls){
	return (*env).NewStringUTF("Hello cpp"); // C++的调用方式，必须用这种
}


JNIEXPORT jstring JNICALL Java_zcr_com_ndk_JniTest_getStringFromC
  (JNIEnv * env, jclass jcls){
    return (*env).NewStringUTF("C String");
  }

