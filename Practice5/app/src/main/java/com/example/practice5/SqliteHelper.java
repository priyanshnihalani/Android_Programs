package com.example.practice5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper {

    private static final String Database_Name="Info";
    private static final int Database_Version=1;
    String create =  "Create table info(id integer primary key autoincrement, name text, email text)";
    public SqliteHelper(Context context) {
        super(context,Database_Name,null,  Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

            sqLiteDatabase.execSQL("Drop table info");
            onCreate(sqLiteDatabase);
    }
}
