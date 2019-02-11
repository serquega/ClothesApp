package com.example.sergi.clothesapp.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sergi.clothesapp.R;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.firebase.auth.FirebaseAuth;

public class GoogleSignInActivity extends AppCompatActivity {

    private static final String GOOGLE_ID = "267904840693-a5d2a3ghs140g55ci885c4iersoj25lq.apps.googleusercontent.com";
    private FirebaseAuth mAuth;
    private GoogleSignInClient mGoogleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_sign_in);

    }

}
