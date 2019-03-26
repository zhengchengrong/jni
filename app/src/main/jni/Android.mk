LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := JniClib
LOCAL_SRC_FILES := JniClib.c
include $(BUILD_SHARED_LIBRARY)