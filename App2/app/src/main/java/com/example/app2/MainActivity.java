package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText e1, e2;
    TextView a1, a2, a3, a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.b);

        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);

        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              int num1 =  Integer.parseInt(e1.getText().toString());
              int num2 =  Integer.parseInt(e2.getText().toString());

              int sum   = num1 + num2;
              int sub   = num1 - num2;
              int multi = num1 * num2;
              int div   = num1 / num2;

              a1.setText("Addition is: " + sum);
              a2.setText("Substraction is: " + sub);
              a3.setText("Multiplication is: " + multi);
              a4.setText("Division is: " + div);

            }
        });
    }
}