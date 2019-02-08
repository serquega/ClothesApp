package com.example.sergi.clothesapp.DATABASE;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;

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
            "SoftBlue TINYINT(1)," + "Grey TINYINT(1)," + "Brown TINYINT(1)," + "SoftBrown TINYINT(1)," + "SoftGreen TINYINT(1)"+")";
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

    //Method to check a login in the databse
    //Returns 1 if the login is correct
    //Return 0 if the login was not correct
    public int loginDatabase(String email, String password) {
        try {
            int i = 0;
            int j = 0;
            Cursor cursorMan = null;
            Cursor cursorWoman = null;
            android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
            cursorMan = db.rawQuery("select * from Man where email =" + "\""+ email + "\""+" and password="+ "\""+ password + "\"", null);
            cursorWoman = db.rawQuery("select * from Woman where email =" + "\""+ email + "\""+" and password="+ "\""+ password + "\"", null);
            cursorMan.moveToFirst();
            cursorWoman.moveToFirst();
            j = cursorWoman.getCount();
            i = cursorMan.getCount();
            cursorMan.close();
            cursorWoman.close();
            if((i == 1) || (j == 1))
                return 1;
        }catch(Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    //Method to add new people to the database
    public void insertPersonInDatabase(Person person) {
        android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();

        if (person instanceof Man) {
            //We add the data to a map of values
            ContentValues values = new ContentValues();
            values.put("Sex", person.getSex());
            values.put("Name", person.getName());
            values.put("Surname", person.getSurname());
            values.put("Dni", person.getDni());
            values.put("Email", person.getEmail());
            values.put("Password", person.getPassword());
            values.put("Height", person.getHeight());
            values.put("ScarfHot", person.isLikeScarfHot());
            values.put("ScarfWarm", person.isLikeScarfWarm());
            values.put("Gloves", person.isLikeGloves());
            values.put("Hat", person.isLikeHat());
            values.put("Anorak", person.isLikeAnorak());
            values.put("Suspenders", person.isLikeSuspenders());
            values.put("FlipFlops", person.isLikeFlipFlops());
            values.put("Swimsuit", person.isLikeSwimSuit());
            values.put("Leggins", person.isLikeLeggins());
            values.put("Suit", person.isLikeSuit());
            values.put("ThermalTShirt", ((Man) person).isLikeThermalTshirt());
            values.put("Black", person.isLikeBlack());
            values.put("White", person.isLikeWhite());
            values.put("Yellow", person.isLikeYellow());
            values.put("Red", person.isLikeRed());
            values.put("Blue", person.isLikeBlue());
            values.put("Green", person.isLikeGreen());
            values.put("SoftBlue", person.isLikeSoft_blue());
            values.put("Grey", person.isLikeGrey());
            values.put("Brown", person.isLikeBrown());
            values.put("SoftBrown", person.isLikeSoft_brown());
            values.put("SoftGreen", person.isLikeSoft_green());

            //We add the data into de database
            db.insert("Man", null, values);

            //We close the database
            db.close();
        } else {
            //We add the data to the map of values
            ContentValues values = new ContentValues();
            values.put("Sex", person.getSex());
            values.put("Name", person.getName());
            values.put("Surname", person.getSurname());
            values.put("Dni", person.getDni());
            values.put("Email", person.getEmail());
            values.put("Password", person.getPassword());
            values.put("Height", person.getHeight());
            values.put("ScarfHot", person.isLikeScarfHot());
            values.put("ScarfWarm", person.isLikeScarfWarm());
            values.put("Gloves", person.isLikeGloves());
            values.put("Hat", person.isLikeHat());
            values.put("Anorak", person.isLikeAnorak());
            values.put("Suspenders", person.isLikeSuspenders());
            values.put("FlipFlops", person.isLikeFlipFlops());
            values.put("Swimsuit", person.isLikeSwimSuit());
            values.put("Leggins", person.isLikeLeggins());
            values.put("Suit", person.isLikeSuit());
            values.put("Skirt", ((Woman) person).isLikeSkirt());
            values.put("LongSocks", ((Woman) person).isLikeLongSocks());
            values.put("Boots", ((Woman) person).isLikeBoots());
            values.put("Dress", ((Woman) person).isLikeDress());
            values.put("Black", person.isLikeBlack());
            values.put("White", person.isLikeWhite());
            values.put("Yellow", person.isLikeYellow());
            values.put("Red", person.isLikeRed());
            values.put("Blue", person.isLikeBlue());
            values.put("Green", person.isLikeGreen());
            values.put("SoftBlue", person.isLikeSoft_blue());
            values.put("Grey", person.isLikeGrey());
            values.put("Brown", person.isLikeBrown());
            values.put("SoftBrown", person.isLikeSoft_brown());
            values.put("SoftGreen", person.isLikeSoft_green());

            //We add the data into de database
            db.insert("Woman", null, values);

            //We close de database
            db.close();
        }
    }
    //Deletes a person in our database using his/her dni
    public void deletePersonInDatabase(Person person) {
        android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
        if(person instanceof Man) {
            String deleteSqlMan = "delete from" +TABLE_NAME_MAN+ "where dni="+person.getDni();
            db.execSQL(deleteSqlMan);
            db.close();
        }else {
            String deleteSqlWoman = "delete from" +TABLE_NAME_WOMAN+ "where dni="+person.getDni();
            db.execSQL(deleteSqlWoman);
            db.close();
        }
    }
}
