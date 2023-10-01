package com.example.app8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btncls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncls=findViewById(R.id.btncls);
        btncls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ab1 = new AlertDialog.Builder(MainActivity.this);
                ab1.setTitle("Confirm Exit");
                ab1.setIcon(R.drawable.ic_launcher_foreground);
                ab1.setMessage("Are You sure , You want to exit ");
                ab1.setCancelable(true);

                ab1.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                ab1.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "You cancel to Exit", Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog ad1 = ab1.create();
                ad1.show();
            }
       });
        }
}