package com.example.qrdemo_1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {

    public static final String DBNAME="restaurant.db";

    public DBhelper(Context context) {
        super(context, "restaurant.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(isim TEXT primary key,masa TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase MYDB, int oldVersion, int newVersion) {
        MYDB.execSQL("drop Table if exists users");


    }

    public Boolean insertData(String isim,String masa){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("isim",isim);
        contentValues.put("masa",masa);
        Long result=MyDB.insert("users",null,contentValues);
        if (result==1)
            return false;
        else return true;




    }

    public Boolean checkİsim(String isim){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("Select * from users where isim= ?",new String[] {isim});
        if (cursor.getCount()>0)
            return true;
        else return false;

    }
    public Boolean checkİsimMasa(String isim, String masa){
        SQLiteDatabase MYDB=this.getWritableDatabase();
        Cursor cursor =MYDB.rawQuery("Select * from users where username = ? and masa = ?", new String[] {isim,masa});
        if (cursor.getCount()>0)
            return true;
        else return false;

    }



}
