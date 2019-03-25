package zcr.com.ndk;

/**
 * Created by llz on 2019/3/25.
 */
public class JniTest {

    //访问java的属性
    public String key = "key";


    static {
        System.loadLibrary("JniLib");
    }

    public static native String getString();

    public native static String getStringFromC();

    public native static String accessField();



}
