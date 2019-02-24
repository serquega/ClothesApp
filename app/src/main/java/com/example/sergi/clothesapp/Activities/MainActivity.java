package com.example.sergi.clothesapp.Activities;

import android.annotation.SuppressLint;
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
import android.widget.Toast;

import com.example.sergi.clothesapp.DATABASE.SQLiteDatabase;
import com.example.sergi.clothesapp.R;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.SignInButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int RC_GOOGLE = 9001;
    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignUp;
    private CheckBox checkBox;
    private SignInButton signInButton;
    private static GoogleSignInClient mGoogleSignInClient;
    private static final String PREFS_KEY = "mypreferences";

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editTextPassword);
        buttonSignIn=(Button) findViewById(R.id.buttonSignIn);
        textViewSignUp=(TextView) findViewById(R.id.textViewSignup);
        signInButton=(SignInButton) findViewById(R.id.googleSignInButton);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        signInButton.setOnClickListener(this);
        String email = readPreferences(getApplicationContext(), "user email");
        String password = readPreferences(getApplicationContext(), "password");
        editTextEmail.setText(email);
        editTextPassword.setText(password);

        //Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

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
                SQLiteDatabase db = new SQLiteDatabase(getApplicationContext());

                //Check the checkbox
                if(checkBox.isChecked()) {
                    savePreferences(getApplicationContext(),"user email", editTextEmail.getText().toString());
                    savePreferences(getApplicationContext(), "password", editTextPassword.getText().toString());
                }

                //Check a database login correct
                if(db.loginDatabase(editTextEmail.getText().toString(), editTextPassword.getText().toString()) == 1)
                    startActivity(WeatherActivity.class);
                else
                    Toast.makeText(getApplicationContext(), "Error, email or password incorrects", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RC_GOOGLE) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }
    }

    public void handleSignInResult(GoogleSignInResult result) {
        if (result.isSuccess()) {
            GoogleSignInAccount account = result.getSignInAccount();

            //We pass the user signed in data through the intent
            Intent intent = new Intent(this, WeatherActivity.class);
            intent.putExtra("userAccount", account);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.googleSignInButton:
                signIn();
                break;
        }
    }

    public void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_GOOGLE);
    }
}
