package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        layout = findViewById(R.id.layout);
        String color[] = {"red", "blue", "green", "yellow"};

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, color);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        layout.setBackgroundColor(Color.RED);
                        break;
                    case 1:
                        layout.setBackgroundColor(Color.BLUE);
                        break;
                    case 2:
                        layout.setBackgroundColor(Color.GREEN);
                        break;
                    case 3:
                        layout.setBackgroundColor(Color.YELLOW);
                        break;
                    default:
                        layout.setBackgroundColor(Color.WHITE);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}