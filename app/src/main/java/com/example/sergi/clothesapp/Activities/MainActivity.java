package com.example.sergi.clothesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import com.example.sergi.clothesapp.R;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton buttonAbove;
    private FloatingActionButton buttonDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAbove=(FloatingActionButton) findViewById(R.id.buttonAbove);
        buttonDown=(FloatingActionButton) findViewById(R.id.buttonDown);

        buttonAbove.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(ManActivity.class);
            }
        });

        buttonDown.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(WomanActivity.class);
            }
        });
    }

    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }
}
