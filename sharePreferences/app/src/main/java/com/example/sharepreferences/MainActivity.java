package com.example.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE);
               Boolean check = sharedPreferences.getBoolean("flag", false);

               Intent intent;
               if (check)
               {
                    intent = new Intent(MainActivity.this, MainActivity3.class);
               }
               else {
                    intent = new Intent(MainActivity.this, MainActivity2.class);
               }
            }
        }, 4000);
    }
}