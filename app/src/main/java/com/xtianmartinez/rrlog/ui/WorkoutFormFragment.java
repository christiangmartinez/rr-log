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
    private EditText pullWeight;
    private TextView pullSet1;
    private TextView pullSet2;
    private TextView pullSet3;

    private Spinner squatSpinner;
    private EditText shrimpSquatWeight;
    private EditText barbellSquatWeight;
    private TextView squatSet1;
    private TextView squatSet2;
    private TextView squatSet3;

    private Spinner dipSpinner;
    private EditText dipWeight;
    private TextView dipSet1;
    private TextView dipSet2;
    private TextView dipSet3;

    private Spinner hingeSpinner;
    private EditText hingeWeight;
    private TextView hingeSet1;
    private TextView hingeSet2;
    private TextView hingeSet3;

    private Spinner rowSpinner;
    private EditText rowWeight;
    private TextView rowSet1;
    private TextView rowSet2;
    private TextView rowSet3;

    private Spinner pushupSpinner;
    private TextView pushupSet1;
    private TextView pushupSet2;
    private TextView pushupSet3;

    private Spinner antiExtensionSpinner;
    private TextView antiExtensionSet1;
    private TextView antiExtensionSet2;
    private TextView antiExtensionSet3;

    private TextView antiRotationSet1;
    private TextView antiRotationSet2;
    private TextView antiRotationSet3;

    private TextView extensionSet1;
    private TextView extensionSet2;
    private TextView extensionSet3;

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

// First Pair
        pullSpinner = v.findViewById(R.id.pull_progressions);
        ArrayAdapter<CharSequence> pullAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.pull_array, android.R.layout.simple_spinner_item);
        pullAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pullSpinner.setAdapter(pullAdapter);
        pullSpinner.setOnItemSelectedListener(this);
        pullWeight = v.findViewById(R.id.pull_weight);
        pullSet1 = v.findViewById(R.id.pull_set_1);
        pullSet1.setOnClickListener(this);
        pullSet2 = v.findViewById(R.id.pull_set_2);
        pullSet2.setOnClickListener(this);
        pullSet3 = v.findViewById(R.id.pull_set_3);
        pullSet3.setOnClickListener(this);

        squatSpinner = v.findViewById(R.id.squat_progressions);
        ArrayAdapter<CharSequence> squatAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.squat_array, android.R.layout.simple_spinner_item);
        squatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        squatSpinner.setAdapter(squatAdapter);
        squatSpinner.setOnItemSelectedListener(this);
        shrimpSquatWeight = v.findViewById(R.id.shrimp_squat_weight);
        barbellSquatWeight = v.findViewById(R.id.barbell_squat_weight);
        squatSet1 = v.findViewById(R.id.squat_set_1);
        squatSet1.setOnClickListener(this);
        squatSet2 = v.findViewById(R.id.squat_set_2);
        squatSet2.setOnClickListener(this);
        squatSet3 = v.findViewById(R.id.squat_set_3);
        squatSet3.setOnClickListener(this);

// Second Pair
        dipSpinner = v.findViewById(R.id.dip_progressions);
        ArrayAdapter<CharSequence> dipAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.dip_array, android.R.layout.simple_spinner_item);
        dipAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dipSpinner.setAdapter(dipAdapter);
        dipSpinner.setOnItemSelectedListener(this);
        dipWeight = v.findViewById(R.id.dip_weight);
        dipSet1 = v.findViewById(R.id.dip_set_1);
        dipSet1.setOnClickListener(this);
        dipSet2 = v.findViewById(R.id.dip_set_2);
        dipSet2.setOnClickListener(this);
        dipSet3 = v.findViewById(R.id.dip_set_3);
        dipSet3.setOnClickListener(this);

        hingeSpinner = v.findViewById(R.id.hinge_progressions);
        ArrayAdapter<CharSequence> hingeAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.hinge_array, android.R.layout.simple_spinner_item);
        hingeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hingeSpinner.setAdapter(hingeAdapter);
        hingeSpinner.setOnItemSelectedListener(this);
        hingeWeight = v.findViewById(R.id.hinge_weight);
        hingeSet1 = v.findViewById(R.id.hinge_set_1);
        hingeSet1.setOnClickListener(this);
        hingeSet2 = v.findViewById(R.id.hinge_set_2);
        hingeSet2.setOnClickListener(this);
        hingeSet3 = v.findViewById(R.id.hinge_set_3);
        hingeSet3.setOnClickListener(this);

// Third Pair
        rowSpinner = v.findViewById(R.id.row_progressions);
        ArrayAdapter<CharSequence> rowAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.row_array, android.R.layout.simple_spinner_item);
        rowAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rowSpinner.setAdapter(rowAdapter);
        rowSpinner.setOnItemSelectedListener(this);
        rowWeight = v.findViewById(R.id.row_weight);
        rowSet1 = v.findViewById(R.id.row_set_1);
        rowSet1.setOnClickListener(this);
        rowSet2 = v.findViewById(R.id.row_set_2);
        rowSet2.setOnClickListener(this);
        rowSet3 = v.findViewById(R.id.row_set_3);
        rowSet3.setOnClickListener(this);

        pushupSpinner = v.findViewById(R.id.pushup_progressions);
        ArrayAdapter<CharSequence> pushupAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.pushup_array, android.R.layout.simple_spinner_item);
        pushupAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pushupSpinner.setAdapter(pushupAdapter);
        pushupSpinner.setOnItemSelectedListener(this);
        pushupSet1 = v.findViewById(R.id.pushup_set_1);
        pushupSet1.setOnClickListener(this);
        pushupSet2 = v.findViewById(R.id.pushup_set_2);
        pushupSet2.setOnClickListener(this);
        pushupSet3 = v.findViewById(R.id.pushup_set_3);
        pushupSet3.setOnClickListener(this);

// Core Triplet
        antiExtensionSpinner = v.findViewById(R.id.anti_extension_progressions);
        ArrayAdapter<CharSequence> antiExtensionAdapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.anti_extension_array, android.R.layout.simple_spinner_item);
        antiExtensionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        antiExtensionSpinner.setAdapter(antiExtensionAdapter);
        antiExtensionSpinner.setOnItemSelectedListener(this);
        antiExtensionSet1 = v.findViewById(R.id.anti_extension_set_1);
        antiExtensionSet1.setOnClickListener(this);
        antiExtensionSet2 = v.findViewById(R.id.anti_extension_set_2);
        antiExtensionSet2.setOnClickListener(this);
        antiExtensionSet3 = v.findViewById(R.id.anti_extension_set_3);
        antiExtensionSet3.setOnClickListener(this);

        antiRotationSet1 = v.findViewById(R.id.anti_rotation_set_1);
        antiRotationSet1.setOnClickListener(this);
        antiRotationSet2 = v.findViewById(R.id.anti_rotation_set_2);
        antiRotationSet2.setOnClickListener(this);
        antiRotationSet3 = v.findViewById(R.id.anti_rotation_set_3);
        antiRotationSet3.setOnClickListener(this);

        extensionSet1 = v.findViewById(R.id.extension_set_1);
        extensionSet1.setOnClickListener(this);
        extensionSet2 = v.findViewById(R.id.extension_set_2);
        extensionSet2.setOnClickListener(this);
        extensionSet3 = v.findViewById(R.id.extension_set_3);
        extensionSet3.setOnClickListener(this);

        saveWorkoutButton = v.findViewById(R.id.save_workout);
        saveWorkoutButton.setOnClickListener(this);

        return v;
    }

    public Integer getTextViewInt(TextView currentView) {
        return Integer.parseInt(currentView.getText().toString());
    }

    public void countReps(TextView currentSet) {
        int repNumber = Integer.parseInt(currentSet.getText().toString());
        if (repNumber == 0) {
            currentSet.setText("8");
        } else {
            currentSet.setText(String.valueOf(repNumber - 1));
        }
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
        int pullReps1 = getTextViewInt(pullSet1);
        int pullReps2 = getTextViewInt(pullSet2);
        int pullReps3 = getTextViewInt(pullSet3);
        String squatProgression = squatSpinner.getSelectedItem().toString();
        int squatReps1 = getTextViewInt(squatSet1);
        int squatReps2 = getTextViewInt(squatSet2);
        int squatReps3 = getTextViewInt(squatSet3);
        String dipProgression = dipSpinner.getSelectedItem().toString();
        int dipReps1 = getTextViewInt(dipSet1);
        int dipReps2 = getTextViewInt(dipSet2);
        int dipReps3 = getTextViewInt(dipSet3);
        String hingeProgression = hingeSpinner.getSelectedItem().toString();
        int hingeReps1 = getTextViewInt(hingeSet1);
        int hingeReps2 = getTextViewInt(hingeSet2);
        int hingeReps3 = getTextViewInt(hingeSet3);
        String rowProgression = rowSpinner.getSelectedItem().toString();
        int rowReps1 = getTextViewInt(rowSet1);
        int rowReps2 = getTextViewInt(rowSet2);
        int rowReps3 = getTextViewInt(rowSet3);
        String pushupProgression = pushupSpinner.getSelectedItem().toString();
        int pushupReps1 = getTextViewInt(pushupSet1);
        int pushupReps2 = getTextViewInt(pushupSet2);
        int pushupReps3 = getTextViewInt(pushupSet3);
        String antiExtensionProgression = antiExtensionSpinner.getSelectedItem().toString();
        int antiExtensionReps1 = getTextViewInt(antiExtensionSet1);
        int antiExtensionReps2 = getTextViewInt(antiExtensionSet2);
        int antiExtensionReps3 = getTextViewInt(antiExtensionSet3);
        String antiRotationProgression = "Banded pallof press";
        int antiRotationReps1 = getTextViewInt(antiRotationSet1);
        int antiRotationReps2 = getTextViewInt(antiRotationSet2);
        int antiRotationReps3 = getTextViewInt(antiRotationSet3);
        String extensionProgression = "Reverse hyperextension";
        int extensionReps1 = getTextViewInt(extensionSet1);
        int extensionReps2 = getTextViewInt(extensionSet2);
        int extensionReps3 = getTextViewInt(extensionSet3);

        Log.d(TAG, "saveWorkout: saveWorkout called...");
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
        switch (adapterView.getId()) {
            case R.id.pull_progressions:
               if (i == 4) {
                   pullWeight.setVisibility(View.VISIBLE);
               } else {
                   pullWeight.setVisibility(View.GONE);
               }
               break;
            case R.id.squat_progressions:
                if (i == 5) {
                    shrimpSquatWeight.setVisibility(View.VISIBLE);
                    barbellSquatWeight.setVisibility(View.GONE);
                } else if (i == 6) {
                    barbellSquatWeight.setVisibility(View.VISIBLE);
                    shrimpSquatWeight.setVisibility(View.GONE);
                } else {
                    shrimpSquatWeight.setVisibility(View.GONE);
                    barbellSquatWeight.setVisibility(View.GONE);
                }
                break;

            case R.id.dip_progressions:
                if (i == 3) {
                    dipWeight.setVisibility(View.VISIBLE);
                } else {
                    dipWeight.setVisibility(View.GONE);
                }
                break;

            case R.id.hinge_progressions:
                if (i == 5) {
                    hingeWeight.setVisibility(View.VISIBLE);
                } else {
                    hingeWeight.setVisibility(View.GONE);
                }
                break;

            case R.id.row_progressions:
                if (i == 4) {
                    rowWeight.setVisibility(View.VISIBLE);
                } else {
                    rowWeight.setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.save_workout:
                saveWorkout();
                break;

            case R.id.pull_set_1:
                countReps(pullSet1);
                break;

            case R.id.pull_set_2:
                countReps(pullSet2);
                break;

            case R.id.pull_set_3:
                countReps(pullSet3);
                break;

            case R.id.squat_set_1:
                countReps(squatSet1);
                break;

            case R.id.squat_set_2:
                countReps(squatSet2);
                break;

            case R.id.squat_set_3:
                countReps(squatSet3);
                break;

            case R.id.dip_set_1:
                countReps(dipSet1);
                break;

            case R.id.dip_set_2:
                countReps(dipSet2);
                break;

            case R.id.dip_set_3:
                countReps(dipSet3);
                break;

            case R.id.hinge_set_1:
                countReps(hingeSet1);
                break;
            case R.id.hinge_set_2:
                countReps(hingeSet2);
                break;
            case R.id.hinge_set_3:
                countReps(hingeSet3);
                break;

            case R.id.row_set_1:
                countReps(rowSet1);
                break;

            case R.id.row_set_2:
                countReps(rowSet2);
                break;
            case R.id.row_set_3:
                countReps(rowSet3);
                break;

            case R.id.pushup_set_1:
                countReps(pushupSet1);
                break;

            case R.id.pushup_set_2:
                countReps(pushupSet2);
                break;

            case R.id.pushup_set_3:
                countReps(pushupSet3);
                break;

            case R.id.anti_extension_set_1:
                countReps(antiExtensionSet1);
                break;

            case R.id.anti_extension_set_2:
                countReps(antiExtensionSet2);
                break;
            case R.id.anti_extension_set_3:
                countReps(antiExtensionSet3);
                break;

            case R.id.anti_rotation_set_1:
                countReps(antiRotationSet1);
                break;

            case R.id.anti_rotation_set_2:
                countReps(antiRotationSet2);
                break;

            case R.id.anti_rotation_set_3:
                countReps(antiRotationSet3);
                break;

            case R.id.extension_set_1:
                countReps(extensionSet1);
                break;

            case R.id.extension_set_2:
                countReps(extensionSet2);
                break;

            case R.id.extension_set_3:
                countReps(extensionSet3);
                break;
        }
    }

}
