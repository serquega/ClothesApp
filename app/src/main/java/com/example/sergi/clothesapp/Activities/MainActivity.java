package com.example.sergi.clothesapp.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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
    AlertDialog.Builder builder=null;
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
                SQLiteDatabase admin = new SQLiteDatabase(getBaseContext());
                android.database.sqlite.SQLiteDatabase db = admin.getWritableDatabase();
                String queryMan = "SELECT * FROM Man";

                //Check the checkbox
                if(checkBox.isChecked()) {
                    savePreferences(getBaseContext(),"user email", editTextEmail.getText().toString());
                    savePreferences(getBaseContext(), "password", editTextPassword.getText().toString());
                }

                //Runs Database
                Cursor cursorMan = db.rawQuery(queryMan, null);

                //Search into de database
                if(cursorMan.moveToFirst()){
                    do{
                        if(cursorMan.getString(5).equals(editTextEmail.getText().toString()) && cursorMan.getString(6).equals(editTextPassword.getText().toString()))
                            startActivity(WeatherActivity.class);
                        else
                            searchInWomanDatabase();
                    }while(cursorMan.moveToNext());
                }
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

    //Search email and password in woman database
    public void searchInWomanDatabase() {
        SQLiteDatabase admin = new SQLiteDatabase(getBaseContext());
        android.database.sqlite.SQLiteDatabase db = admin.getWritableDatabase();
        String queryWoman = "SELECT * FROM Woman";

        //Runs Database
        Cursor cursorWoman = db.rawQuery(queryWoman, null);

        //Search into de database
        if(cursorWoman.moveToFirst()){
            do{
                if(cursorWoman.getString(5).equals(editTextEmail.getText().toString()) && cursorWoman.getString(6).equals(editTextPassword.getText().toString()))
                    startActivity(WeatherActivity.class);
                else
                    builder.setTitle("ERROR!").setMessage("Your email or your password are incorrects");
            }while(cursorWoman.moveToNext());
        }
    }
}
