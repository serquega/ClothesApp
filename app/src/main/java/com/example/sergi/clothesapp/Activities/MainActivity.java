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
import android.widget.EditText;
import android.widget.TextView;

import com.example.sergi.clothesapp.DATABASE.SQLiteDatabase;
import com.example.sergi.clothesapp.Data.Person;
import com.example.sergi.clothesapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignUp;
    private ArrayList<Person> listPerson=new ArrayList<Person>();
    AlertDialog.Builder builder=null;
    private static String PREFS_KEY = "mypreferences";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editTextPassword);
        buttonSignIn=(Button) findViewById(R.id.buttonSignIn);
        textViewSignUp=(TextView) findViewById(R.id.textViewSignup);
        textViewSignUp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                startActivity(SignUpActivity.class);
                return true;
            }
        });

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase admin = new SQLiteDatabase(getBaseContext());
                android.database.sqlite.SQLiteDatabase db = admin.getWritableDatabase();

                String query = "SELECT * FROM Persons";

                //
                if() {
                    savePreferences(getBaseContext(),"user email", editTextEmail.getText().toString());
                    savePreferences(getBaseContext(), "password", editTextPassword.getText().toString());
                }

                //Runs Database
                Cursor cursor = db.rawQuery(query, null);

                //Search into de database
                if(cursor.moveToFirst()){
                    do{
                        if(cursor.getString(5).equals(editTextEmail.getText().toString()) && cursor.getString(6).equals(editTextPassword.getText().toString()))
                            startActivity(WeatherActivity.class);
                        else
                            builder.setTitle("ERROR!").setMessage("Your email or your password are incorrects");
                    }while(cursor.moveToNext());
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
}
