/*
 * Copyright (c)$today.year.month.day
 *  admin:郑程荣.
 *  文件名:MainActivity.java
 *  项目功能:
 */

package zcr.com.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView testjni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testjni = findViewById(R.id.testjni);
        JniCTest jniCTest = new JniCTest();
        testjni.setText(jniCTest.accessField());
    }
}
