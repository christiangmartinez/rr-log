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
    private TextView pullSet1;
    private EditText pullSet2;
    private EditText pullSet3;

    private Spinner squatSpinner;
    private EditText squatSet1;
    private EditText squatSet2;
    private EditText squatSet3;

    private Spinner dipSpinner;
    private EditText dipSet1;
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
        final ArrayAdapter<CharSequence> pullAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.pull_array, android.R.layout.simple_spinner_item);
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
        dipSet1 = v.findViewById(R.id.dip_set_1);
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
        ArrayAdapter<CharSequence> rowAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.row_array, android.R.layout.simple_spinner_item);
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

        pullSet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "It's been clicked!!!", Toast.LENGTH_LONG).show();
                int repNumber = Integer.parseInt(pullSet1.getText().toString());
                if (repNumber == 0) {
                    pullSet1.setText("8");
                } else {
                    pullSet1.setText(String.valueOf(repNumber - 1));
                }
            }
        });

        saveWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Done! button clicked...");
                saveWorkout();
            }
        });

        return v;
    }

    public void saveWorkout() {
        String workoutDate = currentDate.getText().toString();
        String bodyWeight = userWeight.getText().toString();
        if (bodyWeight.trim().isEmpty()) {
            Log.d(TAG, "saveWorkout: field empty, save FAIL");
            Toast.makeText(getActivity(), "Add body weight", Toast.LENGTH_SHORT).show();
            return;
        }
        String pullProgression = pullSpinner.getSelectedItem().toString();
        int pullReps1 = Integer.parseInt(pullSet1.getText().toString());
        int pullReps2 = Integer.parseInt(pullSet2.getText().toString());
        int pullReps3 = Integer.parseInt(pullSet3.getText().toString());
        String squatProgression = squatSpinner.getSelectedItem().toString();
        int squatReps1 = Integer.parseInt(squatSet1.getText().toString());
        int squatReps2 = Integer.parseInt(squatSet2.getText().toString());
        int squatReps3 = Integer.parseInt(squatSet3.getText().toString());
        String dipProgression = dipSpinner.getSelectedItem().toString();
        int dipReps1 = Integer.parseInt(dipSet1.getText().toString());
        int dipReps2 = Integer.parseInt(dipSet2.getText().toString());
        int dipReps3 = Integer.parseInt(dipSet3.getText().toString());
        String hingeProgression = hingeSpinner.getSelectedItem().toString();
        int hingeReps1 = Integer.parseInt(hingeSet1.getText().toString());
        int hingeReps2 = Integer.parseInt(hingeSet2.getText().toString());
        int hingeReps3 = Integer.parseInt(hingeSet3.getText().toString());
        String rowProgression = rowSpinner.getSelectedItem().toString();
        int rowReps1 = Integer.parseInt(rowSet1.getText().toString());
        int rowReps2 = Integer.parseInt(rowSet2.getText().toString());
        int rowReps3 = Integer.parseInt(rowSet3.getText().toString());
        String pushupProgression = pushupSpinner.getSelectedItem().toString();
        int pushupReps1 = Integer.parseInt(pushupSet1.getText().toString());
        int pushupReps2 = Integer.parseInt(pushupSet2.getText().toString());
        int pushupReps3 = Integer.parseInt(pushupSet3.getText().toString());
        String antiExtensionProgression = antiExtensionSpinner.getSelectedItem().toString();
        int antiExtensionReps1 = Integer.parseInt(antiExtensionSet1.getText().toString());
        int antiExtensionReps2 = Integer.parseInt(antiExtensionSet2.getText().toString());
        int antiExtensionReps3 = Integer.parseInt(antiExtensionSet3.getText().toString());
        String antiRotationProgression = "Banded pallof press";
        int antiRotationReps1 = Integer.parseInt(antiRotationSet1.getText().toString());
        int antiRotationReps2 = Integer.parseInt(antiRotationSet2.getText().toString());
        int antiRotationReps3 = Integer.parseInt(antiRotationSet3.getText().toString());
        String extensionProgression = "Reverse hyperextension";
        int extensionReps1 = Integer.parseInt(extensionSet1.getText().toString());
        int extensionReps2 = Integer.parseInt(extensionSet2.getText().toString());
        int extensionReps3 = Integer.parseInt(extensionSet3.getText().toString());

        Log.d(TAG, "saveWorkout: function called");
        Workout workout = new Workout(workoutDate,
                bodyWeight,
                pullProgression,
                pullReps1,
                pullReps2,
                pullReps3,
                squatProgression,
                squatReps1,
                squatReps2,
                squatReps3,
                dipProgression,
                dipReps1,
                dipReps2,
                dipReps3,
                hingeProgression,
                hingeReps1,
                hingeReps2,
                hingeReps3,
                rowProgression,
                rowReps1,
                rowReps2,
                rowReps3,
                pushupProgression,
                pushupReps1,
                pushupReps2,
                pushupReps3,
                antiExtensionProgression,
                antiExtensionReps1,
                antiExtensionReps2,
                antiExtensionReps3,
                antiRotationProgression,
                antiRotationReps1,
                antiRotationReps2,
                antiRotationReps3,
                extensionProgression,
                extensionReps1,
                extensionReps2,
                extensionReps3);
        workoutViewModel.insert(workout);
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
