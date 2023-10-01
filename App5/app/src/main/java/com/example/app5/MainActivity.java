package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] citynm = {"Rajkot", "Jetpur", "Virpur", "Junagadh", "Gondal", "Porbandar", "Gandhinagar", "Raipur", "Somnath", "Surat"};
    Spinner spn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn = findViewById(R.id.spn);
        ArrayAdapter adp = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, citynm);
        spn.setAdapter(adp);


    }
}