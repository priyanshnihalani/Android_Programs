package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btns;
        EditText e1, e2, e3;
        TextView txt;

        btns = findViewById(R.id.btns);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        txt = findViewById(R.id.txt);

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p = Integer.parseInt(e1.getText().toString());
                int n = Integer.parseInt(e2.getText().toString());
                int r = Integer.parseInt(e3.getText().toString());

                int si = p * n * r/100;
                txt.setText("Simple Interest is: " + si);

            }
        });

    }
}