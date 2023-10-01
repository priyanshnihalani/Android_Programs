package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    int progress = 0;
    ProgressBar p1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = findViewById(R.id.p1);
        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setprogressvalue(progress);
            }
        });
    }
    private void setprogressvalue(final int progress){
        p1.setProgress(progress);
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                setprogressvalue(progress+10);
            }
        });
        th.start();
    }
}