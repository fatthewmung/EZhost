package com.example.matthewfung.eventplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FinalActivity extends AppCompatActivity {
    Button button;

    //Make sure links work
    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

    }

    /** Called when the user clicks the Corporate button */
    public void toStart(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}





