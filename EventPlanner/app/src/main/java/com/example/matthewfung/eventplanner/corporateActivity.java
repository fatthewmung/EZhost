package com.example.matthewfung.eventplanner;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;

import java.util.Calendar;

public class corporateActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView, venue1, venue2, desc1, desc2, price1, price2;
    private int year, month, day;
    private Button button, button1, button2;
    private ImageView test_image, test_image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate);

        //Link to main page
        Intent intent = getIntent();

        calendar = Calendar.getInstance();
        dateView = (TextView) findViewById(R.id.textView3);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);


        initialize();
    }

        public void initialize() {
            TextView venue1 = (TextView) findViewById(R.id.venue1);
            TextView venue2 = (TextView) findViewById(R.id.venue2);
            TextView desc1 = (TextView) findViewById(R.id.desc1);
            TextView desc2 = (TextView) findViewById(R.id.desc2);
            TextView price1 = (TextView) findViewById(R.id.price1);
            TextView price2 = (TextView) findViewById(R.id.price2);
            ImageView test_image = (ImageView) findViewById(R.id.test_image);
            ImageView test_image2 = (ImageView) findViewById(R.id.test_image2);

            Button button1 = (Button) findViewById(R.id.button1);
            Button button2 = (Button) findViewById(R.id.button2);
        }

            @SuppressWarnings("deprecation")
            public void setDate(View view) {
                showDialog(999);
                Toast.makeText(getApplicationContext(), "ca", Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            protected Dialog onCreateDialog(int id) {
                // TODO Auto-generated method stub
                if (id == 999) {
                    return new DatePickerDialog(this, myDateListener, year, month, day);
                }
                return null;
            }

            private DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2 + 1, arg3);
                }
            };

            private void showDate(int year, int month, int day) {
                dateView.setText(new StringBuilder().append(month).append("/")
                        .append(day).append("/").append(year));
            }

            public void detail(View v){
                Intent intent = new Intent(this, DetailActivity.class);
                startActivity(intent);
            }

        }

