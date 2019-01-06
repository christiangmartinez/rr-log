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

    public Workout(String workoutDate, String bodyWeight, String pullProgression) {
        this.workoutDate = workoutDate;
        this.bodyWeight = bodyWeight;
        this.pullProgression = pullProgression;
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
}
