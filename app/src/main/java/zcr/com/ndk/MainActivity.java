/*
 * Copyright (c)$today.year.month.day
 *  admin:郑程荣.
 *  文件名:MainActivity.java
 *  项目功能:
 */

package zcr.com.ndk;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private TextView testjni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        testjni = findViewById(R.id.testjni);
//        JniCTest jniCTest = new JniCTest();
//        testjni.setText(jniCTest.accessField());
    }


    public void mDecode(View btn){
        String dir = this.getFilesDir().getAbsolutePath();
        String input = new File(this.getFilesDir(),"input.mp4").getAbsolutePath();
        String output = new File(this.getFilesDir(),"output_1280x720_yuv420p.yuv").getAbsolutePath();
        VideoUtils.decode(input, output);
    }
}
