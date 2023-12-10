package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        SharedPreferences sharedPreferences = getSharedPreferences("preference", MODE_PRIVATE);
        String name =  sharedPreferences.getString("name", "Name");
        String email = sharedPreferences.getString("email", "Email");
        textView.setText(name + " " + email);
    }
}