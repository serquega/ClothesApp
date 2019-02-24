package com.example.sergi.clothesapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.sergi.clothesapp.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        GoogleSignInAccount objectAccount = null;

        //We get the user information from the intent
        Bundle extras = getIntent().getExtras();
        if(extras != null)
            objectAccount = (GoogleSignInAccount) extras.get("userAccount");
        else
            Toast.makeText(getApplicationContext(), "There is not any user signed in", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}
