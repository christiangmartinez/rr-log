package com.xtianmartinez.rrlog.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.xtianmartinez.rrlog.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView currentDate;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = Calendar.getInstance();
        currentDate = (TextView)findViewById(R.id.current_date);
        dateFormat = new SimpleDateFormat( "MM/dd/yyyy");
        date = dateFormat.format(calendar.getTime());
        currentDate.setText(date);
    }
}
