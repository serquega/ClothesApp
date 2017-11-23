package com.example.sergi.clothesapp.Activities;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sergi.clothesapp.Data.Man;
import com.example.sergi.clothesapp.Data.Person;
import com.example.sergi.clothesapp.R;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    private Button buttonSignIn;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignUp;
    private ArrayList<Person> listPerson=new ArrayList<Person>();
    AlertDialog.Builder builder=null;

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
                //checkData(editTextEmail.getText(), editTextPassword.getText());
                checkUserData(editTextEmail.getText(), editTextPassword.getText());
            }
        });
    }


    public void checkUserData(Editable eMail, Editable passWord){
        for(int i=0; i<listPerson.size(); i++){
            if(listPerson.get(i).getEmail().equals(eMail.toString()) && listPerson.get(i).getPassword().equals(passWord.toString()))
                Log.i("my tag", "Hi");      //Remove it
                //startActivity();
            else
                builder.setTitle("ATENTION").setMessage("E-mail or password incorrect");
        }
    }
    //When the user clicks on the button SIGN IN, this method checks if the user is registered(file method)
    public void checkData(Editable eMail, Editable passWord){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/example/sergi/clothesapp/Files/data.txt"));
            String line=null;
            boolean found=false;
            StringTokenizer token;
            line=bufferedReader.readLine();
            while(line!=null && !found) {
                token = new StringTokenizer(line, ",");
                String sex = token.nextToken();
                if (sex.equalsIgnoreCase("m")){
                    String name = token.nextToken();
                    String surname = token.nextToken();
                    String dni = token.nextToken();
                    String email = token.nextToken();
                    String password = token.nextToken();
                    int height=Integer.parseInt(token.nextToken());
                    boolean likeScarfHot=Boolean.parseBoolean(token.nextToken());
                    boolean likeScarfWarm=Boolean.parseBoolean(token.nextToken());
                    boolean likeGloves=Boolean.parseBoolean(token.nextToken());
                    boolean likeHat=Boolean.parseBoolean(token.nextToken());
                    boolean likeTracksuit=Boolean.parseBoolean(token.nextToken());
                    boolean likeAnorak=Boolean.parseBoolean(token.nextToken());
                    boolean likeSuspenders=Boolean.parseBoolean(token.nextToken());
                    boolean likeFlipFlops=Boolean.parseBoolean(token.nextToken());
                    if (email.equals(eMail.toString()) && password.equals(passWord.toString())) {
                        found = true;
                        //startActivity();
                    } else {
                        builder = new AlertDialog.Builder(this);
                        builder.setTitle("Warning!").setMessage("This user is not registered");
                    }
                }else if(sex.equalsIgnoreCase("f")){

                }
                line=bufferedReader.readLine();
            }
            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //Method for starting an activity
    public void startActivity(Class<?> startActivity){
        Intent intent = new Intent(this, startActivity);
        startActivity(intent);
    }
}
