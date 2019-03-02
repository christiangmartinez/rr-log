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
   private WorkoutViewModel workoutViewModel;

    private TextView currentDate;
    private EditText userWeight;
    private Spinner pullSpinner;
    private EditText pullSet1;
    private EditText pullSet2;
    private EditText pullSet3;

    private Spinner squatSpinner;
    private EditText squatSet1;
    private EditText squatSet2;
    private EditText squatSet3;

    private Spinner dipSpinner;
    private EditText dipsSet1;
    private EditText dipSet2;
    private EditText dipSet3;

    private Spinner hingeSpinner;
    private EditText hingeSet1;
    private EditText hingeSet2;
    private EditText hingeSet3;

    private Spinner rowSpinner;
    private EditText rowSet1;
    private EditText rowSet2;
    private EditText rowSet3;

    private Spinner pushupSpinner;
    private EditText pushupSet1;
    private EditText pushupSet2;
    private EditText pushupSet3;

    private Spinner antiExtensionSpinner;
    private EditText antiExtensionSet1;
    private EditText antiExtensionSet2;
    private EditText antiExtensionSet3;

    private EditText antiRotationSet1;
    private EditText antiRotationSet2;
    private EditText antiRotationSet3;

    private EditText extensionSet1;
    private EditText extensionSet2;
    private EditText extensionSet3;

    private Button saveWorkoutButton;

    public WorkoutFormFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        workoutViewModel = ViewModelProviders.of(getActivity()).get(WorkoutViewModel.class);
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
        pullSet1 = v.findViewById(R.id.pull_set_1);
        pullSet2 = v.findViewById(R.id.pull_set_2);
        pullSet3 = v.findViewById(R.id.pull_set_3);

        squatSpinner = v.findViewById(R.id.squat_progressions);
        ArrayAdapter<CharSequence> squatAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.squat_array, android.R.layout.simple_spinner_item);
        squatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        squatSpinner.setAdapter(squatAdapter);
        squatSpinner.setOnItemSelectedListener(this);
        squatSet1 = v.findViewById(R.id.squat_set_1);
        squatSet2 = v.findViewById(R.id.squat_set_2);
        squatSet3 = v.findViewById(R.id.squat_set_3);

        dipSpinner = v.findViewById(R.id.dip_progressions);
        ArrayAdapter<CharSequence> dipAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.dip_array, android.R.layout.simple_spinner_item);
        dipAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dipSpinner.setAdapter(dipAdapter);
        dipSpinner.setOnItemSelectedListener(this);
        dipsSet1 = v.findViewById(R.id.dip_set_1);
        dipSet2 = v.findViewById(R.id.dip_set_2);
        dipSet3 = v.findViewById(R.id.dip_set_3);

        hingeSpinner = v.findViewById(R.id.hinge_progressions);
        ArrayAdapter<CharSequence> hingeAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hinge_array, android.R.layout.simple_spinner_item);
        hingeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hingeSpinner.setAdapter(hingeAdapter);
        hingeSpinner.setOnItemSelectedListener(this);
        hingeSet1 = v.findViewById(R.id.hinge_set_1);
        hingeSet2 = v.findViewById(R.id.hinge_set_2);
        hingeSet3 = v.findViewById(R.id.hinge_set_3);

        rowSpinner = v.findViewById(R.id.row_progressions);
        ArrayAdapter<CharSequence> rowAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hinge_array, android.R.layout.simple_spinner_item);
        rowAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rowSpinner.setAdapter(rowAdapter);
        rowSpinner.setOnItemSelectedListener(this);
        rowSet1 = v.findViewById(R.id.row_set_1);
        rowSet2 = v.findViewById(R.id.row_set_2);
        rowSet3 = v.findViewById(R.id.row_set_3);

        pushupSpinner = v.findViewById(R.id.pushup_progressions);
        ArrayAdapter<CharSequence> pushupAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.pushup_array, android.R.layout.simple_spinner_item);
        pushupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pushupSpinner.setAdapter(pushupAdapter);
        pushupSpinner.setOnItemSelectedListener(this);
        pushupSet1 = v.findViewById(R.id.pushup_set_1);
        pushupSet2 = v.findViewById(R.id.pushup_set_2);
        pushupSet3 = v.findViewById(R.id.pushup_set_3);

        antiExtensionSpinner = v.findViewById(R.id.anti_extension_progressions);
        ArrayAdapter<CharSequence> antiExtensionAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.anti_extension_array, android.R.layout.simple_spinner_item);
        antiExtensionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        antiExtensionSpinner.setAdapter(antiExtensionAdapter);
        antiExtensionSpinner.setOnItemSelectedListener(this);
        antiExtensionSet1 = v.findViewById(R.id.anti_extension_set_1);
        antiExtensionSet2 = v.findViewById(R.id.anti_extension_set_2);
        antiExtensionSet3 = v.findViewById(R.id.anti_extension_set_3);

        antiRotationSet1 = v.findViewById(R.id.anti_rotation_set_1);
        antiRotationSet2 = v.findViewById(R.id.anti_rotation_set_2);
        antiRotationSet3 = v.findViewById(R.id.anti_rotation_set_3);

        extensionSet1 = v.findViewById(R.id.extension_set_1);
        extensionSet2 = v.findViewById(R.id.extension_set_2);
        extensionSet3 = v.findViewById(R.id.extension_set_3);

        saveWorkoutButton = v.findViewById(R.id.save_workout);

        saveWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: done! button clicked...");
                saveWorkout();
            }
        });

        return v;
    }

    public void saveWorkout() {
        String workoutDate = currentDate.getText().toString();
        String bodyWeight = userWeight.getText().toString();
        String pullProgression = pullSpinner.getSelectedItem().toString();
        if (bodyWeight.trim().isEmpty()) {
            Log.d(TAG, "saveWorkout: field empty, save FAIL");
            Toast.makeText(getActivity(), "Add body weight", Toast.LENGTH_SHORT).show();
            return;
        }
        Log.d(TAG, "saveWorkout: function called");
//        Workout workout = new Workout(workoutDate, bodyWeight, pullProgression);
//        workoutViewModel.insert(workout);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {

    }
}
