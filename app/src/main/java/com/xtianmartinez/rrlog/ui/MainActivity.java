package com.xtianmartinez.rrlog.ui;


import android.arch.persistence.room.Room;
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
import com.xtianmartinez.rrlog.WorkoutDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public static WorkoutDatabase workoutDatabase;
    private TextView currentDate;
    private EditText userWeight;
    private Spinner pullSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workoutDatabase = Room.databaseBuilder(getApplicationContext(), WorkoutDatabase.class, "workouts").build();
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
                String bodyWeight = userWeight.getText().toString();
                String pullProgression = pullSpinner.getSelectedItem().toString();
                boolean validEntry = isValidEntry(bodyWeight);
                if(!validEntry) return;
                Toast.makeText(MainActivity.this, workoutDate + " " + bodyWeight + " " + pullProgression, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private boolean isValidEntry(String n) {
        if(n.equals("")) {
            userWeight.setError("Enter body weight");
            return false;
        }
        return true;
    }

}