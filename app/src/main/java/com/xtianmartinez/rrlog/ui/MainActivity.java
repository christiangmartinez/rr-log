package com.xtianmartinez.rrlog.ui;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.xtianmartinez.rrlog.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private TextView currentDate;
    private EditText userWeight;
    private Spinner pullSpinner;
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();

        currentDate = findViewById(R.id.current_date);
        userWeight = findViewById(R.id.user_weight);
        Button saveWorkout = findViewById(R.id.save_workout);

        Toolbar workoutToolbar = findViewById(R.id.workout_toolbar);
        setSupportActionBar(workoutToolbar);
        SimpleDateFormat dateFormat = new SimpleDateFormat( "MM/dd/yyyy");
        String date = dateFormat.format(calendar.getTime());
        currentDate.setText(date);

        pullSpinner = findViewById(R.id.pull_progressions);
        ArrayAdapter<CharSequence> pullAdapter = ArrayAdapter.createFromResource(this, R.array.pull_array, android.R.layout.simple_spinner_item);
        pullAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pullSpinner.setAdapter(pullAdapter);
        pullSpinner.setOnItemSelectedListener(this);

        saveWorkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String workoutDate = currentDate.getText().toString();
                int bodyWeight = Integer.parseInt(userWeight.getText().toString());
                String pullProgression = pullSpinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, workoutDate + " " + bodyWeight + " " + pullProgression, Toast.LENGTH_LONG).show();
            }
        });
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
