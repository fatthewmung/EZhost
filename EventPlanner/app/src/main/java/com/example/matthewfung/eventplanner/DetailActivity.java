package com.example.matthewfung.eventplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DetailActivity extends AppCompatActivity {
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();

        Button button3 = (Button)findViewById(R.id.button3);
    }

    public void addOns(View view){
        Intent intent = new Intent(this, AddOnsActivity.class);
        startActivity(intent);
    }
}
