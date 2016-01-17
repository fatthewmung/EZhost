package com.example.matthewfung.eventplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        Intent intent =getIntent();

    }

    public void corpPage(View v){
        Intent intent = new Intent(this, corporateActivity.class);
        startActivity(intent);
    }
}
