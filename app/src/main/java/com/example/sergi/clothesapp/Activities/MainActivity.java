package com.example.sergi.clothesapp.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sergi.clothesapp.DATABASE.SQLiteDatabase;
import com.example.sergi.clothesapp.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignUp;
    private CheckBox checkBox;
    private static String PREFS_KEY = "mypreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editTextPassword);
        buttonSignIn=(Button) findViewById(R.id.buttonSignIn);
        textViewSignUp=(TextView) findViewById(R.id.textViewSignup);
        String email = readPreferences(getBaseContext(), "user email");
        String password = readPreferences(getBaseContext(), "password");
        editTextEmail.setText(email);
        editTextPassword.setText(password);
        textViewSignUp.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                startActivity(SignUpActivity.class);
                return false;
            }
        });

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase dbAdmin = new SQLiteDatabase(getBaseContext());
                dbAdmin.open();

                //Check the checkbox
                if(checkBox.isChecked()) {
                    savePreferences(getBaseContext(),"user email", editTextEmail.getText().toString());
                    savePreferences(getBaseContext(), "password", editTextPassword.getText().toString());
                }

                //Check if user exists in our database

            }
        });
    }

    //Method for starting an activity
    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }

    //Save user's e-mail and password
    public static void savePreferences(Context context, String keyPref, String value) {
        SharedPreferences settings = context.getSharedPreferences(PREFS_KEY, MODE_PRIVATE);
        SharedPreferences.Editor editor;
        editor = settings.edit();
        editor.putString(keyPref, value);
        editor.commit();
    }

    //Read user's e-mail and password
    public static String readPreferences(Context context, String keyPref) {
        SharedPreferences preferences = context.getSharedPreferences(PREFS_KEY, MODE_PRIVATE);
        return preferences.getString(keyPref, "");
    }


}
