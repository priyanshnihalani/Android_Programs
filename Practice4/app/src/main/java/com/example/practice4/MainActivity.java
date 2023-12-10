package com.example.practice4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, email;
    Button log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        log = findViewById(R.id.log);
        
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("preference", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name", name.getText().toString());
                editor.putString("email", email.getText().toString());
                editor.apply();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}