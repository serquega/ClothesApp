package com.example.sergi.clothesapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sergi.clothesapp.R;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEmail=(EditText) findViewById(R.id.editTextEmail);
        editTextPassword=(EditText) findViewById(R.id.editTextPassword);
        buttonSignIn=(Button) findViewById(R.id.buttonSignIn);
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkData(editTextEmail.getText(), editTextPassword.getText());

            }
        });

    }

    public void checkData(Editable email, Editable password){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/example/sergi/clothesapp/Files/data.txt"));
            String line=null;
            StringTokenizer token;
            bufferedReader.readLine();
            while(line!=null){
                token=new StringTokenizer(line,",");
                bufferedReader.readLine();
            }

            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }
}
