package com.xtianmartinez.rrlog.ui;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.xtianmartinez.rrlog.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Toolbar workoutToolbar;
    private TextView currentDate;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = Calendar.getInstance();
        workoutToolbar = findViewById(R.id.workout_toolbar);
        currentDate = (findViewById(R.id.current_date));
        setSupportActionBar(workoutToolbar);
        dateFormat = new SimpleDateFormat( "MM/dd/yyyy");
        date = dateFormat.format(calendar.getTime());
        currentDate.setText(date);
        Spinner pullSpinner = findViewById(R.id.pull_progressions);
        ArrayAdapter<CharSequence> pullAdapter = ArrayAdapter.createFromResource(this, R.array.pull_array, android.R.layout.simple_spinner_item);
        pullAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pullSpinner.setAdapter(pullAdapter);
        pullSpinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String pullProgression = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), pullProgression, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
