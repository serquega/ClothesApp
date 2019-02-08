package com.example.sergi.clothesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sergi.clothesapp.R;

public class ManActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);
    }

    //Method for starting an activity
    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }
}
