package com.example.sergi.clothesapp.DATABASE;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.Editable;

import com.example.sergi.clothesapp.Activities.SignUpActivity;
import com.example.sergi.clothesapp.Data.Man;
import com.example.sergi.clothesapp.Data.Person;
import com.example.sergi.clothesapp.Data.Woman;

/**
 * Created by sergi on 06/12/2017.
 */

public class SQLiteDatabase extends SQLiteOpenHelper {

    private static final String TABLE_NAME = "Persons";
    private static final String DATABASE_NAME = "PersonsDatabase.db";
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_CREATION = "create database"+ TABLE_NAME + " ( " + "Sex VARCHAR(1)," + "Name VARCHAR(15)," +
            "Surname VARCHAR(30)," + "DNI CHAR(9) PRIMARY KEY," + "Email CHAR(20)," + "Password CHAR(20)," + "Height INT," +
            "Scarf Hot TINYINT(1)," + "Scarf Warm TINYTINT(1)," + "Gloves TINYINT(1)," + "Hat TINYINT(1)," + "Tracksuit TINYINT(1)," +
            "Anorak TINYINT(1)," + "Suspenders TINYINT(1)," + "Flip Flops TINYINT(1)," + "Swimsuit TINYINT(1)," + "Leggins TINYINT(1)," +
            "Suit TINYINT(1)," + "Thermal T-Shirt TINYINT(1)," + "Skirt TINYINT(1)," + "Long Socks TINYINT(1)," + "Boots TINYINT(1)," +
            "Dress TINYINT(1) )";
    private static android.database.sqlite.SQLiteDatabase db;

    public SQLiteDatabase(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATION);
    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData2(Person person){
        String sqlMan = "INSERT INTO Persons (Sex, Name, Surname, DNI, Email, Password, Height, Scarf Hot, Scarf Warm, Gloves, Hat, Tracksuit, " +
                "Anorak, Suspenders, Flip Flops, Swimsuit, Leggins, Suit, Thermal T-Shirt) VALUES ("+person.getSex()+","+person.getName()+","+
                person.getSurname()+","+person.getDni()+","+person.getEmail()+","+person.getPassword()+","+person.getHeight()+","+
                person.isLikeScarfHot()+","+person.isLikeScarfWarm()+","+person.isLikeGloves()+";"+person.isLikeHat()+","+
                person.isLikeTracksuit()+","+person.isLikeAnorak()+","+person.isLikeSuspenders()+","+person.isLikeFlipFlops()+","+
                person.isLikeSwimSuit()+";"+person.isLikeLeggins()+","+person.isLikeSuit()+","+((Man) person).isLikeThermalTshirt()+")";

        String sqlWoman = "INSERT INTO Persons (Sex, Name, Surname, DNI, Email, Password, Height, Scarf Hot, Scarf Warm, Gloves, Hat, Tracksuit, " +
                "Anorak, Suspenders, Flip Flops, Swimsuit, Leggins, Suit, Skirt, Long Socks, Boots, Dress) VALUES ("+person.getSex()+","+person.getName()+","+
                person.getSurname()+","+person.getDni()+","+person.getEmail()+","+person.getPassword()+","+person.getHeight()+","+
                person.isLikeScarfHot()+","+person.isLikeScarfWarm()+","+person.isLikeGloves()+";"+person.isLikeHat()+","+
                person.isLikeTracksuit()+","+person.isLikeAnorak()+","+person.isLikeSuspenders()+","+person.isLikeFlipFlops()+","+
                person.isLikeSwimSuit()+";"+person.isLikeLeggins()+","+person.isLikeSuit()+","+((Woman) person).isLikeSkirt()+","+
                ((Woman) person).isLikeLongSocks()+","+((Woman) person).isLikeBoots()+","+((Woman) person).isLikeDress()+")";

        db = this.getWritableDatabase();
        SQLiteStatement stmMan = db.compileStatement(sqlMan);
        SQLiteStatement stmWoman = db.compileStatement(sqlWoman);

        //Inserting the values
        if (person instanceof Man){
            stmMan.bindString(0, person.getSex());
            stmMan.bindString(1, person.getName());
            stmMan.bindString(2, person.getSurname());
            stmMan.bindString(3, person.getDni());
            stmMan.bindString(4, person.getEmail());
            stmMan.bindString(5, person.getPassword());
            stmMan.bindString(6, String.valueOf(person.getHeight());
            stmMan.bindString(7, Boolean.toString(person.isLikeScarfHot()));
            stmMan.bindString(7, Boolean.toString(person.isLikeScarfWarm()));
        }else{

        }
    }
    public void insertData1(Person person){
        db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        //Insert values
        if(person instanceof Man) {
            values.put("Sex", person.getSex());
            values.put("Name", person.getName());
            values.put("Surname", person.getSurname());
            values.put("DNI", person.getDni());
            values.put("Email", person.getEmail());
            values.put("Password", person.getPassword());
            values.put("Height", person.getHeight());
            values.put("Scarf Hot", person.isLikeScarfHot());
            values.put("Scarf Warm", person.isLikeScarfWarm());
            values.put("Gloves", person.isLikeGloves());
            values.put("Hat", person.isLikeHat());
            values.put("Tracksuit", person.isLikeTracksuit());
            values.put("Anorak", person.isLikeAnorak());
            values.put("Suspenders", person.isLikeSuspenders());
            values.put("Flip Flops", person.isLikeFlipFlops());
            values.put("Swimsuit", person.isLikeSwimSuit());
            values.put("Leggins", person.isLikeLeggins());
            values.put("Suit", person.isLikeSuit());
            values.put("Thermal T-Shirt", ((Man) person).isLikeThermalTshirt());

            //Inserting the rows into the database
            db.insert("Man", null, values);

            //Closing the database
            db.close();
        }else {
            values.put("Sex", person.getSex());
            values.put("Name", person.getName());
            values.put("Surname", person.getSurname());
            values.put("DNI", person.getDni());
            values.put("Email", person.getEmail());
            values.put("Password", person.getPassword());
            values.put("Height", person.getHeight());
            values.put("Scarf Hot", person.isLikeScarfHot());
            values.put("Scarf Warm", person.isLikeScarfWarm());
            values.put("Gloves", person.isLikeGloves());
            values.put("Hat", person.isLikeHat());
            values.put("Tracksuit", person.isLikeTracksuit());
            values.put("Anorak", person.isLikeAnorak());
            values.put("Suspenders", person.isLikeSuspenders());
            values.put("Flip Flops", person.isLikeFlipFlops());
            values.put("Swimsuit", person.isLikeSwimSuit());
            values.put("Leggins", person.isLikeLeggins());
            values.put("Suit", person.isLikeSuit());
            values.put("Skirt", ((Woman) person).isLikeSkirt());
            values.put("Long Socks", ((Woman) person).isLikeLongSocks());
            values.put("Boots", ((Woman) person).isLikeBoots());
            values.put("Dress", ((Woman) person).isLikeDress());

            //Inserting the row into the database
            db.insert("Woman", null, values);

            //Closing the database
            db.close();
        }
    }

    public static void checkUserDataInDatabase(Editable eMail, Editable passWord){
        String query = "SELECT * FROM Persons";

        //Runs Database
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                if(cursor.getString(4).equals(eMail.toString()) && cursor.getString(5).equals(passWord.toString()))

            }while(cursor.moveToNext());
        }
    }

    //Method for starting an activity
    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(, startActivity);
        startActivity(intent);
    }
}