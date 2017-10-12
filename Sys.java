package com.example.vidhya.melange;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vidhya Krishnan on 1/6/2017.
 */
public class Sys extends SQLiteOpenHelper {


    Context con;
    SQLiteDatabase s;
    public Sys(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        con=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create Table if not exists sympos(Name Varchar,Clg Varchar,Mail Varchar,Dept Varchar,Phone Integer)");


    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public Sys connect()
    {
        s=new Sys(con,"tab",null,1).getWritableDatabase();
        return this;
    }

    public void add(String mgs,String col,String em,String dep,int ph)
    {
        ContentValues v=new ContentValues();
        v.put("Name",mgs);
        v.put("Clg",col);
        v.put("Mail",em);
        v.put("dept",dep);
        v.put("Phone",ph);
        s.insert("Sympos",null,v);

    }



}



