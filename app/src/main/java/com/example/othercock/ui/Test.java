package com.example.othercock.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.othercock.R;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        System.out.println("안녕하세요 새로운액티비티입니다.");
    }
}