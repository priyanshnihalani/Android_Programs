package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        //Handling Database
        SqliteHelper sqliteHelper = new SqliteHelper(this);
        SQLiteDatabase db = sqliteHelper.getWritableDatabase();

        //Inserting Values
        ContentValues values = new ContentValues();
        values.put("name", "Priyansh");
        values.put("email", "priyansh.nihalani@gmail.com");
        long row =  db.insert("info", null, values);
        if (row > 0)
        {
            textView.setText("Data Inserted " + values.get("name") +" \n"+ values.get("email"));
        }
        else {
            textView.setText("Data Not Inserted");
        }

        //Retriving Data
        SQLiteDatabase db1 = sqliteHelper.getReadableDatabase();
        Cursor cursor = db1.rawQuery("select * from info", null);
        ListView ls;
        while(cursor.moveToNext())
        {

            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String email = cursor.getString(2);
            Log.d("TAG" ,id + " "+ name + " " + email);
        }
        db.close();
        sqliteHelper.close();
    }
}