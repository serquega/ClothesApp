package com.example.sergi.clothesapp.DATABASE;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sergi.clothesapp.Data.Man;
import com.example.sergi.clothesapp.Data.Person;
import com.example.sergi.clothesapp.Data.Woman;

/**
 * Created by sergi on 06/12/2017.
 */

public class SQLiteDatabase extends SQLiteOpenHelper {

    public SQLiteDatabase(Context context){
        super(context, "PersonsDtabase.db", null, 1);
    }
    @Override
    public void onCreate(android.database.sqlite.SQLiteDatabase db) {
        String dbCreation = "create database Persons";
        db.execSQL(dbCreation);
    }

    @Override
    public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertData(Person person){
        android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        //Insert values
        if(person instanceof Man) {
            values.put("Sex", person.getSex());
            values.put("Name", person.getName());
            values.put("Surname", person.getSurname());
            values.put("DNI", person.getDni());
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
            //Inserting the row into the database
            db.insert("Man", null, values);
        }else {
            values.put("Sex", person.getSex());
            values.put("Name", person.getName());
            values.put("Surname", person.getSurname());
            values.put("DNI", person.getDni());
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
        }
    }
}
