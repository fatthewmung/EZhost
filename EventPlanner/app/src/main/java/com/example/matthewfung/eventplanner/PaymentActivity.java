package com.example.matthewfung.eventplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        //Make sure links work
        Intent intent = getIntent();

    }

        /** Called when the user clicks the Corporate button */
        public void finalPage(View view) {
            Intent intent = new Intent(this, FinalActivity.class);
            startActivity(intent);
        }

}
