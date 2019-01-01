package com.xtianmartinez.rrlog.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "workouts")
public class Workout {
    @PrimaryKey
    @ColumnInfo(name = "workout_date")
    public String workoutDate;

    @ColumnInfo(name = "body_weight")
    public String bodyWeight;

    @ColumnInfo(name = "pull_progression")
    public String pullProgression;

}
