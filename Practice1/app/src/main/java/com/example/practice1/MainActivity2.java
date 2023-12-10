package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView, course;
        textView = findViewById(R.id.textView);
        course = findViewById(R.id.course);
        Intent intent = getIntent();
        String value = intent.getStringExtra("gender");
        String info = intent.getStringExtra("value");
        textView.setText(value);
        course.setText(info);

    }
}