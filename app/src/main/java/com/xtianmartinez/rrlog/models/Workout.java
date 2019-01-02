package com.xtianmartinez.rrlog.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "workouts")
public class Workout {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "workout_date")
    public String workoutDate;

    @ColumnInfo(name = "body_weight")
    public String bodyWeight;

    @ColumnInfo(name = "pull_progression")
    public String pullProgression;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
