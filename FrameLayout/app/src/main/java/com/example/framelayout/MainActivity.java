package com.example.framelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    Button swap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        swap = findViewById(R.id.swap);

        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv1.getVisibility() == View.VISIBLE)
                {
                    tv1.setVisibility(View.INVISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                }
                else {
                    tv1.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}