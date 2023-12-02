package com.example.sqlite_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            SqliteDB sqlitedb = new SqliteDB(this);
            sqlitedb.addRecord("Aman", "Junagadh", "1434567890");
            Toast.makeText(this, "Data inserted", Toast.LENGTH_LONG).show();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Data Not Inserted", Toast.LENGTH_LONG).show();
        }

    }
}