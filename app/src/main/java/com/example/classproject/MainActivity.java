package com.example.classproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText);

    }

    public void btn_click(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,TwoActivity.class);
        startActivity(intent);
    }

    public void btn_sendmessage(View view) {
        Intent intent = new Intent(this,TwoActivity.class);
        String message = editText.getText().toString();
        intent.putExtra("EXTRA_MESSAGE",message);
        Toast.makeText(MainActivity.this,message, Toast.LENGTH_SHORT).show();
        //启动意图
        startActivity(intent);

    }

   

}
