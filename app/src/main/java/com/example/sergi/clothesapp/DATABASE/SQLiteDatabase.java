package com.example.sergi.clothesapp.DATABASE;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import com.example.sergi.clothesapp.Activities.WeatherActivity;
import com.example.sergi.clothesapp.Data.Man;
import com.example.sergi.clothesapp.Data.Person;
import com.example.sergi.clothesapp.Data.Woman;

/**
 * Created by sergi on 06/12/2017.
 */

public class SQLiteDatabase extends SQLiteOpenHelper {

    private static final String TABLE_NAME_MAN = "Man";
    private static final String TABLE_NAME_WOMAN = "Woman";
    private static final String DATABASE_NAME = "PeopleDatabase.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_CREATION_MAN = "create table "+TABLE_NAME_MAN+" ("+"Sex VARCHAR(1),"+"Name VARCHAR(15),"+ "Surname VARCHAR(30),"+
            "Dni CHAR(9) PRIMARY KEY,"+"Email CHAR(20),"+"Password CHAR(20),"+"Height INT(3),"+"ScarfHot TINYINT(1),"+"ScarfWarm TINYINT(1),"+
            "Gloves TINYINT(1)," + "Hat TINYINT(1)," + "Tracksuit TINYINT(1)," + "Anorak TINYINT(1)," + "Suspenders TINYINT(1)," +
            "FlipFlops TINYINT(1)," + "Swimsuit TINYINT(1)," + "Leggins TINYINT(1)," + "Suit TINYINT(1)," + "ThermalTShirt TINYINT(1)," +
            "Black TINYINT(1)," + "White TINYINT(1)," + "Yellow TINYINT(1)," + "Red TINYINT(1)," + "Blue TINYINT(1)," + "Green TINYINT(1)," +
            "SoftBlue TINYINT(1)," + "Grey TINYINT(1)," + "Brown TINYINT(1)," + "SoftBrown TINYINT(1))," + "SoftGreen TINYINT(1)"+")";
    private static final String DATABSE_CREATION_WOMAN = "create table "+TABLE_NAME_WOMAN+" ( " + "Sex VARCHAR(1)," + "Name VARCHAR(15)," +
            "Surname VARCHAR(30)," + "Dni CHAR(9) PRIMARY KEY," + "Email CHAR(20)," + "Password CHAR(20)," + "Height INT(3)," +
            "ScarfHot TINYINT(1)," + "ScarfWarm TINYINT(1)," + "Gloves TINYINT(1)," + "Hat TINYINT(1)," + "Tracksuit TINYINT(1)," +
            "Anorak TINYINT(1)," + "Suspenders TINYINT(1)," + "FlipFlops TINYINT(1)," + "Swimsuit TINYINT(1)," + "Leggins TINYINT(1)," +
            "Suit TINYINT(1)," + "ThermalTShirt TINYINT(1)," + "Skirt TINYINT(1)," + "LongSocks TINYINT(1)," + "Boots TINYINT(1)," +
            "Dress TINYINT(1)," + "Black TINYINT(1)," + "White TINYINT(1)," + "Yellow TINYINT(1)," + "Red TINYINT(1)," + "Blue TINYINT(1)," + "Green TINYINT(1)," +
            "SoftBlue TINYINT(1)," + "Grey TINYINT(1)," + "Brown TINYINT(1)," + "SoftBrown TINYINT(1)," + "SoftGreen TINYINT(1)" +")";

    public SQLiteDatabase(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATION_MAN);
        db.execSQL(DATABSE_CREATION_WOMAN);
    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
        /*if(oldVersion < newVersion) {
            onCreate(db);
        }*/
    }
}
