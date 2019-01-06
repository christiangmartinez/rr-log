package com.xtianmartinez.rrlog.ui;


import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.xtianmartinez.rrlog.R;
import com.xtianmartinez.rrlog.WorkoutViewModel;
import com.xtianmartinez.rrlog.models.Workout;


public class MainActivity extends AppCompatActivity {
    public static final int WORKOUT_FORM_FRAGMENT_REQUEST_CODE = 1;
    private static final String TAG = MainActivity.class.getSimpleName();
    private WorkoutViewModel mWorkoutViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mWorkoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel.class);
        Log.d(TAG, "onCreate: Starting...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WorkoutFormFragment()).commit();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == WORKOUT_FORM_FRAGMENT_REQUEST_CODE && resultCode == RESULT_OK) {
            String workoutDate = data.getStringExtra(WorkoutFormFragment.EXTRA_WORKOUT_DATE);
            String bodyWeight = data.getStringExtra(WorkoutFormFragment.EXTRA_USER_WEIGHT);
            String pullProgression = data.getStringExtra(WorkoutFormFragment.EXTRA_PULL_PROGRESSION);
            Workout workout = new Workout(workoutDate, bodyWeight, pullProgression);
            mWorkoutViewModel.insert(workout);
            Toast.makeText(getApplicationContext(), "Workout saved!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "ERROR: Workout not saved", Toast.LENGTH_LONG).show();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch (menuItem.getItemId()) {
                        case R.id.nav_workout_form:
                            selectedFragment = new WorkoutFormFragment();
                            break;
                        case R.id.nav_progress:
                            selectedFragment = new ProgressFragment();
                            break;
                        case R.id.nav_calendar:
                            selectedFragment = new CalendarFragment();
                            break;
                        case R.id.nav_settings:
                            selectedFragment = new SettingsFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    return true;
                }
            };
}