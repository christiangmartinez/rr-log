package com.xtianmartinez.rrlog.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "workout_table")
public class Workout {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "workout_date")
    private String workoutDate;

    @ColumnInfo(name = "body_weight")
    private String bodyWeight;

    @ColumnInfo(name = "pull_progression")
    private String pullProgression;
    @ColumnInfo(name = "pull_set_1")
    private int pullSet1;
    @ColumnInfo(name = "pull_set_2")
    private int pullSet2;
    @ColumnInfo(name = "pull_set_3")
    private int pullSet3;

    @ColumnInfo(name = "squat_progression")
    private String squatProgression;
    @ColumnInfo(name = "squat_set_1")
    private int squatSet1;
    @ColumnInfo(name = "squat_set_2")
    private int squatSet2;
    @ColumnInfo(name = "squat_set_3")
    private int squatSet3;

    @ColumnInfo(name = "dip_progression")
    private String dipProgression;
    @ColumnInfo(name = "dip_set_1")
    private int dipSet1;
    @ColumnInfo(name = "dip_set_2")
    private int dipSet2;
    @ColumnInfo(name = "dip_set_3")
    private int dipSet3;


    @ColumnInfo(name = "hinge_progression")
    private String hingeProgression;
    @ColumnInfo(name = "hinge_set_1")
    private int hingeSet1;
    @ColumnInfo(name = "hinge_set_2")
    private int hingeSet2;
    @ColumnInfo(name = "hinge_set_3")
    private int hingeSet3;

    @ColumnInfo(name = "row_progression")
    private String rowProgression;
    @ColumnInfo(name = "row_set_1")
    private int rowSet1;
    @ColumnInfo(name = "row_set_2")
    private int rowSet2;
    @ColumnInfo(name = "row_set_3")
    private int rowSet3;

    @ColumnInfo(name = "pushup_progression")
    private String pushupProgression;
    @ColumnInfo(name = "pushup_set_1")
    private int pushupSet1;
    @ColumnInfo(name = "pushup_set_2")
    private int pushupSet2;
    @ColumnInfo(name = "pushup_set_3")
    private int pushupSet3;

    @ColumnInfo(name = "anti_extension_progression")
    private String antiExtensionProgression;
    @ColumnInfo(name = "anti_extension_set_1")
    private int antiExtensionSet1;
    @ColumnInfo(name = "anti_extension_set_2")
    private int antiExtensionSet2;
    @ColumnInfo(name = "anti_extension_set_3")
    private int antiExtensionSet3;

    @ColumnInfo(name = "anti_rotation_progression")
    private String antiRotationProgression;
    @ColumnInfo(name = "anti_rotation_set_1")
    private int antiRotationSet1;
    @ColumnInfo(name = "anti_rotation_set_2")
    private int antiRotationSet2;
    @ColumnInfo(name = "anti_rotation_set_3")
    private int antiRotationSet3;

    @ColumnInfo(name = "extension_progression")
    private String extensionProgression;
    @ColumnInfo(name = "extension_set_1")
    private int extensionSet1;
    @ColumnInfo(name = "extension_set_2")
    private int extensionSet2;
    @ColumnInfo(name = "extension_set_3")
    private int extensionSet3;

    public Workout(String workoutDate,
                   String bodyWeight,
                   String pullProgression,
                   int pullSet1,
                   int pullSet2,
                   int pullSet3,
                   String squatProgression,
                   int squatSet1,
                   int squatSet2,
                   int squatSet3,
                   String dipProgression,
                   int dipSet1,
                   int dipSet2,
                   int dipSet3,
                   String hingeProgression,
                   int hingeSet1,
                   int hingeSet2,
                   int hingeSet3,
                   String rowProgression,
                   int rowSet1,
                   int rowSet2,
                   int rowSet3,
                   String pushupProgression,
                   int pushupSet1,
                   int pushupSet2,
                   int pushupSet3,
                   String antiExtensionProgression,
                   int antiExtensionSet1,
                   int antiExtensionSet2,
                   int antiExtensionSet3,
                   String antiRotationProgression,
                   int antiRotationSet1,
                   int antiRotationSet2,
                   int antiRotationSet3,
                   String extensionProgression,
                   int extensionSet1,
                   int extensionSet2,
                   int extensionSet3) {
        this.workoutDate = workoutDate;
        this.bodyWeight = bodyWeight;
        this.pullProgression = pullProgression;
        this.pullSet1 = pullSet1;
        this.pullSet2 = pullSet2;
        this.pullSet3 = pullSet3;
        this.squatProgression = squatProgression;
        this.squatSet1 = squatSet1;
        this.squatSet2 = squatSet2;
        this.squatSet3 = squatSet3;
        this.dipProgression = dipProgression;
        this.dipSet1 = dipSet1;
        this.dipSet2 = dipSet2;
        this.dipSet3 = dipSet3;
        this.hingeProgression = hingeProgression;
        this.hingeSet1 = hingeSet1;
        this.hingeSet2 = hingeSet2;
        this.hingeSet3 = hingeSet3;
        this. rowProgression = rowProgression;
        this.rowSet1 = rowSet1;
        this.rowSet2 = rowSet2;
        this.rowSet3 = rowSet3;
        this.pushupProgression = pushupProgression;
        this.pushupSet1 = pushupSet1;
        this.pushupSet2 = pushupSet2;
        this.pushupSet3 = pushupSet3;
        this.antiExtensionProgression = antiExtensionProgression;
        this.antiExtensionSet1 = antiExtensionSet1;
        this.antiExtensionSet2 = antiExtensionSet2;
        this.antiExtensionSet3 = antiExtensionSet3;
        this.antiRotationProgression = antiRotationProgression;
        this.antiRotationSet1 = antiRotationSet1;
        this.antiRotationSet2 = antiRotationSet2;
        this.antiRotationSet3 = antiRotationSet3;
        this.extensionProgression = extensionProgression;
        this.extensionSet1 = extensionSet1;
        this.extensionSet2 = extensionSet2;
        this.extensionSet3 = extensionSet3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getWorkoutDate() {
        return workoutDate;
    }

    public String getBodyWeight() {
        return bodyWeight;
    }

    public String getPullProgression() {
        return pullProgression;
    }

    public int getPullSet1() {
        return pullSet1;
    }

    public int getPullSet2() {
        return pullSet2;
    }

    public int getPullSet3() {
        return pullSet3;
    }

    public String getSquatProgression() {
        return squatProgression;
    }

    public int getSquatSet1() {
        return squatSet1;
    }

    public int getSquatSet2() {
        return squatSet2;
    }

    public int getSquatSet3() {
        return squatSet3;
    }

    public String getDipProgression() {
        return dipProgression;
    }

    public int getDipSet1() {
        return dipSet1;
    }

    public int getDipSet2() {
        return dipSet2;
    }

    public int getDipSet3() {
        return dipSet3;
    }

    public String getHingeProgression() {
        return hingeProgression;
    }

    public int getHingeSet1() {
        return hingeSet1;
    }

    public int getHingeSet2() {
        return hingeSet2;
    }

    public int getHingeSet3() {
        return hingeSet3;
    }

    public String getRowProgression() {
        return rowProgression;
    }

    public int getRowSet1() {
        return rowSet1;
    }

    public int getRowSet2() {
        return rowSet2;
    }

    public int getRowSet3() {
        return rowSet3;
    }

    public String getPushupProgression() {
        return pushupProgression;
    }

    public int getPushupSet1() {
        return pushupSet1;
    }

    public int getPushupSet2() {
        return pushupSet2;
    }

    public int getPushupSet3() {
        return pushupSet3;
    }

    public String getAntiExtensionProgression() {
        return antiExtensionProgression;
    }

    public int getAntiExtensionSet1() {
        return antiExtensionSet1;
    }

    public int getAntiExtensionSet2() {
        return antiExtensionSet2;
    }

    public int getAntiExtensionSet3() {
        return antiExtensionSet3;
    }

    public String getAntiRotationProgression() {
        return antiRotationProgression;
    }

    public int getAntiRotationSet1() {
        return antiRotationSet1;
    }

    public int getAntiRotationSet2() {
        return antiRotationSet2;
    }

    public int getAntiRotationSet3() {
        return antiRotationSet3;
    }

    public String getExtensionProgression() {
        return extensionProgression;
    }

    public int getExtensionSet1() {
        return extensionSet1;
    }

    public int getExtensionSet2() {
        return extensionSet2;
    }

    public int getExtensionSet3() {
        return extensionSet3;
    }
}
