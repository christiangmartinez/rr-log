package com.xtianmartinez.rrlog.ui;


import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
import com.xtianmartinez.rrlog.WorkoutViewModel;
import com.xtianmartinez.rrlog.models.Workout;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private WorkoutViewModel mWorkoutViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Starting...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWorkoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel.class);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}