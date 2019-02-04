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
    private static final String DATABASE_CREATION_MAN = "create table "+TABLE_NAME_MAN+" ( " + "Sex VARCHAR(1)," + "Name VARCHAR(15)," +
            "Surname VARCHAR(30)," + "DNI CHAR(9) PRIMARY KEY," + "Email CHAR(20)," + "Password CHAR(20)," + "Height INT(3)," + "Scarf Hot TINYINT(1)," +
            "Scarf Warm TINYINT(1)," + "Gloves TINYINT(1)," + "Hat TINYINT(1)," + "Tracksuit TINYINT(1)," + "Anorak TINYINT(1)," + "Suspenders TINYINT(1)," +
            "Flip Flops TINYINT(1)," + "Swimsuit TINYINT(1)," + "Leggins TINYINT(1)," + "Suit TINYINT(1)," + "Thermal T-Shirt TINYINT(1)" +
            "Black TINYINT(1)," + "White TINYINT(1)," + "Yellow TINYINT(1)," + "Red TINYINT(1)," + "Blue TINYINT(1)," + "Green TINYINT(1)," +
            "Soft Blue TINYINT(1)," + "Grey TINYINT(1)," + "Brown TINYINT(1)," + "Soft Brown TINYINT(1))," + "Soft Green TINYINT(1)" +")";
    private static final String DATABSE_CREATION_WOMAN = "create table "+TABLE_NAME_WOMAN+" ( " + "Sex VARCHAR(1)," + "Name VARCHAR(15)," +
            "Surname VARCHAR(30)," + "DNI CHAR(9) PRIMARY KEY," + "Email CHAR(20)," + "Password CHAR(20)," + "Height INT(3)," +
            "Scarf Hot TINYINT(1)," + "Scarf Warm TINYINT(1)," + "Gloves TINYINT(1)," + "Hat TINYINT(1)," + "Tracksuit TINYINT(1)," +
            "Anorak TINYINT(1)," + "Suspenders TINYINT(1)," + "Flip Flops TINYINT(1)," + "Swimsuit TINYINT(1)," + "Leggins TINYINT(1)," +
            "Suit TINYINT(1)," + "Thermal T-Shirt TINYINT(1)," + "Skirt TINYINT(1)," + "Long Socks TINYINT(1)," + "Boots TINYINT(1)," +
            "Dress TINYINT(1)," + "Black TINYINT(1)," + "White TINYINT(1)," + "Yellow TINYINT(1)," + "Red TINYINT(1)," + "Blue TINYINT(1)," + "Green TINYINT(1)," +
            "Soft Blue TINYINT(1)," + "Grey TINYINT(1)," + "Brown TINYINT(1)," + "Soft Brown TINYINT(1))," + "Soft Green TINYINT(1)" +")";

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

    /*public void insertManData(Person person){
        String sqlMan = "INSERT INTO Persons (Sex, Name, Surname, DNI, Email, Password, Height, Scarf Hot, Scarf Warm, Gloves, Hat, Tracksuit, " +
                "Anorak, Suspenders, Flip Flops, Swimsuit, Leggins, Suit, Thermal T-Shirt) VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?" +
                "?, ?, ?)";

        String sqlWoman = "INSERT INTO Persons (Sex, Name, Surname, DNI, Email, Password, Height, Scarf Hot, Scarf Warm, Gloves, Hat, Tracksuit, " +
                "Anorak, Suspenders, Flip Flops, Swimsuit, Leggins, Suit, Thermal T-shirt, Skirt, Long Socks, Boots, Dress) VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?," +
                " ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?)";

        db = this.getWritableDatabase();
        SQLiteStatement stmMan = db.compileStatement(sqlMan);
        SQLiteStatement stmWoman = db.compileStatement(sqlWoman);

        //Inserting the values
        if (person instanceof Man){
            stmMan.bindString(1, person.getSex());
            stmMan.bindString(2, person.getName());
            stmMan.bindString(3, person.getSurname());
            stmMan.bindString(4, person.getDni());
            stmMan.bindString(5, person.getEmail());
            stmMan.bindString(6, person.getPassword());
            stmMan.bindString(7, String.valueOf(person.getHeight()));
            stmMan.bindString(8, Boolean.toString(person.isLikeScarfHot()));
            stmMan.bindString(9, Boolean.toString(person.isLikeScarfWarm()));
            stmMan.bindString(10, Boolean.toString(person.isLikeGloves()));
            stmMan.bindString(11, Boolean.toString(person.isLikeHat()));
            stmMan.bindString(12, Boolean.toString(person.isLikeTracksuit()));
            stmMan.bindString(13, Boolean.toString(person.isLikeAnorak()));
            stmMan.bindString(14, Boolean.toString(person.isLikeSuspenders()));
            stmMan.bindString(15, Boolean.toString(person.isLikeFlipFlops()));
            stmMan.bindString(16, Boolean.toString(person.isLikeSwimSuit()));
            stmMan.bindString(17, Boolean.toString(person.isLikeLeggins()));
            stmMan.bindString(18, Boolean.toString(person.isLikeSuit()));
            stmMan.bindString(19, Boolean.toString(((Man)person).isLikeThermalTshirt()));
            stmMan.executeInsert();
        }else{
            stmWoman.bindString(1, person.getSex());
            stmWoman.bindString(2, person.getName());
            stmWoman.bindString(3, person.getSurname());
            stmWoman.bindString(4, person.getDni());
            stmWoman.bindString(5, person.getEmail());
            stmWoman.bindString(6, person.getPassword());
            stmWoman.bindString(7, String.valueOf(person.getHeight()));
            stmWoman.bindString(8, Boolean.toString(person.isLikeScarfHot()));
            stmWoman.bindString(9, Boolean.toString(person.isLikeScarfWarm()));
            stmWoman.bindString(10, Boolean.toString(person.isLikeGloves()));
            stmWoman.bindString(11, Boolean.toString(person.isLikeHat()));
            stmWoman.bindString(12, Boolean.toString(person.isLikeTracksuit()));
            stmWoman.bindString(13, Boolean.toString(person.isLikeAnorak()));
            stmWoman.bindString(14, Boolean.toString(person.isLikeSuspenders()));
            stmWoman.bindString(15, Boolean.toString(person.isLikeFlipFlops()));
            stmWoman.bindString(16, Boolean.toString(person.isLikeSwimSuit()));
            stmWoman.bindString(17, Boolean.toString(person.isLikeLeggins()));
            stmWoman.bindString(18, Boolean.toString(person.isLikeSuit()));
            stmWoman.bindString(19, Boolean.toString(((Woman) person).isLikeSkirt()));
            stmWoman.bindString(20, Boolean.toString(((Woman) person).isLikeLongSocks()));
            stmWoman.bindString(21, Boolean.toString(((Woman) person).isLikeBoots()));
            stmWoman.bindString(22, Boolean.toString(((Woman) person).isLikeDress()));
            stmWoman.executeInsert();
        }
    }

    public void insertWomanData(Person person){
        String sqlMan = "INSERT INTO Persons (Sex, Name, Surname, DNI, Email, Password, Height, Scarf Hot, Scarf Warm, Gloves, Hat, Tracksuit, " +
                "Anorak, Suspenders, Flip Flops, Swimsuit, Leggins, Suit, Thermal T-Shirt) VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?" +
                "?, ?, ?)";

        String sqlWoman = "INSERT INTO Persons (Sex, Name, Surname, DNI, Email, Password, Height, Scarf Hot, Scarf Warm, Gloves, Hat, Tracksuit, " +
                "Anorak, Suspenders, Flip Flops, Swimsuit, Leggins, Suit, Skirt, Long Socks, Boots, Dress) VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?," +
                " ?, ?,?, ?, ?, ?, ?, ?, ?, ?, ?)";

        db = this.getWritableDatabase();
        SQLiteStatement stmMan = db.compileStatement(sqlMan);
        SQLiteStatement stmWoman = db.compileStatement(sqlWoman);

        //Inserting the values
        if (person instanceof Man){
            stmMan.bindString(1, person.getSex());
            stmMan.bindString(2, person.getName());
            stmMan.bindString(3, person.getSurname());
            stmMan.bindString(4, person.getDni());
            stmMan.bindString(5, person.getEmail());
            stmMan.bindString(6, person.getPassword());
            stmMan.bindString(7, String.valueOf(person.getHeight()));
            stmMan.bindString(8, Boolean.toString(person.isLikeScarfHot()));
            stmMan.bindString(9, Boolean.toString(person.isLikeScarfWarm()));
            stmMan.bindString(10, Boolean.toString(person.isLikeGloves()));
            stmMan.bindString(11, Boolean.toString(person.isLikeHat()));
            stmMan.bindString(12, Boolean.toString(person.isLikeTracksuit()));
            stmMan.bindString(13, Boolean.toString(person.isLikeAnorak()));
            stmMan.bindString(14, Boolean.toString(person.isLikeSuspenders()));
            stmMan.bindString(15, Boolean.toString(person.isLikeFlipFlops()));
            stmMan.bindString(16, Boolean.toString(person.isLikeSwimSuit()));
            stmMan.bindString(17, Boolean.toString(person.isLikeLeggins()));
            stmMan.bindString(18, Boolean.toString(person.isLikeSuit()));
            stmMan.bindString(19, Boolean.toString(((Man)person).isLikeThermalTshirt()));
            stmMan.executeInsert();
        }else{
            stmWoman.bindString(1, person.getSex());
            stmWoman.bindString(2, person.getName());
            stmWoman.bindString(3, person.getSurname());
            stmWoman.bindString(4, person.getDni());
            stmWoman.bindString(5, person.getEmail());
            stmWoman.bindString(6, person.getPassword());
            stmWoman.bindString(7, String.valueOf(person.getHeight()));
            stmWoman.bindString(8, Boolean.toString(person.isLikeScarfHot()));
            stmWoman.bindString(9, Boolean.toString(person.isLikeScarfWarm()));
            stmWoman.bindString(10, Boolean.toString(person.isLikeGloves()));
            stmWoman.bindString(11, Boolean.toString(person.isLikeHat()));
            stmWoman.bindString(12, Boolean.toString(person.isLikeTracksuit()));
            stmWoman.bindString(13, Boolean.toString(person.isLikeAnorak()));
            stmWoman.bindString(14, Boolean.toString(person.isLikeSuspenders()));
            stmWoman.bindString(15, Boolean.toString(person.isLikeFlipFlops()));
            stmWoman.bindString(16, Boolean.toString(person.isLikeSwimSuit()));
            stmWoman.bindString(17, Boolean.toString(person.isLikeLeggins()));
            stmWoman.bindString(18, Boolean.toString(person.isLikeSuit()));
            stmWoman.bindString(19, Boolean.toString(((Woman) person).isLikeSkirt()));
            stmWoman.bindString(20, Boolean.toString(((Woman) person).isLikeLongSocks()));
            stmWoman.bindString(21, Boolean.toString(((Woman) person).isLikeBoots()));
            stmWoman.bindString(22, Boolean.toString(((Woman) person).isLikeDress()));
            stmWoman.executeInsert();
        }*/
    }
}
