package com.example.sergi.clothesapp.Activities;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sergi.clothesapp.DATABASE.SQLiteDatabase;
import com.example.sergi.clothesapp.Data.Person;
import com.example.sergi.clothesapp.Data.Woman;
import com.example.sergi.clothesapp.R;

public class WomanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman);
    }

    //Method for starting an activity
    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }

    //Insert woman data into the database
    public void insertWomanDataInDatabase(Person person) {
        //We access to our database
        SQLiteDatabase mydb = new SQLiteDatabase(getBaseContext());
        android.database.sqlite.SQLiteDatabase db = mydb.getWritableDatabase();

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
        long primaryKey = db.insert("Woman", null, values);
    }
}
