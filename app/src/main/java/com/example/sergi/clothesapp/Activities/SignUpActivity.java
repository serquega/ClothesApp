package com.example.sergi.clothesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.sergi.clothesapp.R;

public class SignUpActivity extends AppCompatActivity {

    FloatingActionButton fabMan;
    FloatingActionButton fabWoman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fabMan=(FloatingActionButton) findViewById(R.id.fabMan);
        fabWoman=(FloatingActionButton) findViewById(R.id.fabWoman);

        fabMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ManActivity.class);
            }
        });

        fabWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(WomanActivity.class);
            }
        });
    }

    //Method for starting an activity
    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }

}
