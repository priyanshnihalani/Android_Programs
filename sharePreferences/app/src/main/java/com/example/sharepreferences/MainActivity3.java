package com.example.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button lobtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lobtn = findViewById(R.id.lobtn);

        lobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("login", MODE_PRIVATE) ;
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putBoolean("flag", false);
                editor.apply();

                Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(i);
            }
        });


    }
}