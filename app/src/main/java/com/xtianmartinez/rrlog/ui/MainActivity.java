package com.xtianmartinez.rrlog.ui;


import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.xtianmartinez.rrlog.R;
import com.xtianmartinez.rrlog.WorkoutViewModel;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    WorkoutViewModel mWorkoutViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        WorkoutFormFragment fragment = new WorkoutFormFragment();
        Log.d(TAG, "onCreate: Starting...");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWorkoutViewModel = ViewModelProviders.of(this).get(WorkoutViewModel.class);
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();

    }
}