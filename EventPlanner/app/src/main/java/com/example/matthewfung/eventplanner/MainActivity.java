package com.example.matthewfung.eventplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView text;
    Button corporate;
    Button personal;
    Button custom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView)findViewById(R.id.text);
        corporate = (Button)findViewById(R.id.button);
        personal = (Button)findViewById(R.id.button2);
        custom = (Button)findViewById(R.id.button4);

    }

    public void location(View v){
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }
    /** Called when the user clicks the Corporate button */
    public void persPage(View view) {
        Intent intent = new Intent(this, PersonalActivity.class);
        startActivity(intent);
    }
    public void custPage(View view) {
        Intent intent = new Intent(this, CustomActivity.class);
        startActivity(intent);
    }
}

