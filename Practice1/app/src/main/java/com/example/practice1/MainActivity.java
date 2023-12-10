package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText editText, editText1;
    RadioGroup rg;
    RadioButton male, female;
    Button button;
    CheckBox python, java, javascript;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        rg = findViewById(R.id.rg);
        button = findViewById(R.id.button);
        python = findViewById(R.id.python);
        java = findViewById(R.id.java);
        javascript = findViewById(R.id.javascript);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // RadioButton
                int rgrp = rg.getCheckedRadioButtonId();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                if(rgrp != -1) {
                    RadioButton btn = findViewById(rgrp);
                    String opt = btn.getText().toString();
                    intent.putExtra("gender", opt);
                    startActivity(intent);
                }

                // CheckBox
                StringBuilder builder = new StringBuilder();
               if(python.isChecked())
               {

                   intent.putExtra("value",builder.append(" "+python.getText()).toString()+" ");
                   startActivity(intent);
               }
                if(java.isChecked())
                {
                    intent.putExtra("value",builder.append(" "+java.getText()).toString()+" ");
                    startActivity(intent);
                }
                if (javascript.isChecked()) {
                    intent.putExtra("value",builder.append(" " + javascript.getText()).toString()+" ");
                    startActivity(intent);
                }

            }
        });

    }
}