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

    }
}
