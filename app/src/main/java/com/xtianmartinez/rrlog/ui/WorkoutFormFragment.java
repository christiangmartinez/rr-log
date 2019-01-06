package com.xtianmartinez.rrlog.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.xtianmartinez.rrlog.R;
import com.xtianmartinez.rrlog.WorkoutViewModel;
import com.xtianmartinez.rrlog.models.Workout;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static android.support.constraint.Constraints.TAG;

public class WorkoutFormFragment extends Fragment implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private TextView currentDate;
    private EditText userWeight;
    Spinner pullSpinner;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.fragment_workout_form, container, false);

        Toolbar workoutToolbar = v.findViewById(R.id.workout_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(workoutToolbar);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat( "MM/dd/yyyy");
        String date = dateFormat.format(calendar.getTime());
        currentDate = v.findViewById(R.id.current_date);
        currentDate.setText(date);
        userWeight = v.findViewById(R.id.user_weight);
        pullSpinner = v.findViewById(R.id.pull_progressions);
        ArrayAdapter<CharSequence> pullAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.pull_array, android.R.layout.simple_spinner_item);
        pullAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pullSpinner.setAdapter(pullAdapter);
        pullSpinner.setOnItemSelectedListener(this);
//        Button saveWorkout = v.findViewById(R.id.save_workout);
//        saveWorkout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: clicked...");
//                String workoutDate = currentDate.getText().toString();
//                String bodyWeight = userWeight.getText().toString();
//                String pullProgression = pullSpinner.getSelectedItem().toString();
//                boolean validEntry = isValidEntry(bodyWeight);
//                if(!validEntry) return;
//                Workout workout = new Workout();
//                mWorkoutViewModel.insert(workout);
//                Toast.makeText(MainActivity.this, workoutDate + " " + bodyWeight + " " + pullProgression, Toast.LENGTH_LONG).show();
//            }
//        });
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    private boolean isValidEntry(String n) {
        if(n.equals("")) {
            userWeight.setError("Enter body weight");
            return false;
        }
        return true;
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String pullProgression = adapterView.getItemAtPosition(i).toString();
       Toast.makeText(adapterView.getContext(), pullProgression, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {

    }
}