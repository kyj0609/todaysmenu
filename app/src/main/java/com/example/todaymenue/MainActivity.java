package com.example.todaymenue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // 어플을 실행하면, manifest에서 MainActivity 클래스를 시작시키고, MainActivity클래스의 onCreate()함수가
    // activity_main_xml 파일을 읽어서 화면에 레이아웃을 그려 안드로이드 기기 화면에 보여준다dd
    @Override
    protected void onCreate(Bundle savedInstanceState) {// 프로그램의 시작점
        super.onCreate(savedInstanceState); //부모 클래스의 onCreate()함수를 상속받아 실행한다.
        setContentView(R.layout.activity_main);// reg<layout> activity_main.xml를 호출한것
    }
}
