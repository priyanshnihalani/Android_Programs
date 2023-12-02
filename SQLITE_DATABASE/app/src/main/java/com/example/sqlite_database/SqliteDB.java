package com.example.sqlite_database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Sqlite extends SQLiteOpenHelper {

    private static final String Database_Name = "Student_Info";
    private static final int Database_Version = 1;
    private static final String Table_Name = "SY_IMCA";
    private static final String ID = "ID";
    private static final String Name = "Name";
    private static final String City = "City";
    private static final String Contact = "Contact";

    public Sqlite(Context context) {
        super(context, Database_Name, null, Database_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Table_Name + "(" + ID + "integer primary key autoincrement, "+ Name + "Text, " + City + "Text," + Contact + "Text" +")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " +  Table_Name);
        onCreate(db);
    }
    public void addRecord(String name, String city, String contact){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(Name, name);
        contentValues.put(City, city);
        contentValues.put(Contact, contact);

        db.insert(Table_Name, null, contentValues);
    }
}
