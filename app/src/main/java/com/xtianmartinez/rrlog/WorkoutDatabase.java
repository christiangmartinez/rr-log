package com.xtianmartinez.rrlog;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.xtianmartinez.rrlog.models.Workout;

@Database(entities = Workout.class,version = 1)
public abstract class WorkoutDatabase extends RoomDatabase {
    public abstract WorkoutDao workoutDao();
}
