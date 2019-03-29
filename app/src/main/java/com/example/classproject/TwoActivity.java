package com.example.classproject;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TwoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);


        Intent intent = getIntent();
        //把传送进来的String类型的Message的值赋给新的变量message
        String message = intent.getStringExtra("EXTRA_MESSAGE");
        //把布局文件中的文本框和textview链接起来
        TextView textView = (TextView) findViewById(R.id.RecMes);
        //在textview中显示出来message
        textView.setText(message);
    }
}