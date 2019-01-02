package com.xtianmartinez.rrlog;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.text.method.NumberKeyListener;

import com.xtianmartinez.rrlog.models.Workout;

@Database(entities = {Workout.class}, version = 1)
public abstract class WorkoutDatabase extends RoomDatabase {
    public abstract WorkoutDao workoutDao();

    private static volatile WorkoutDatabase INSTANCE;

    static WorkoutDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (WorkoutDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), WorkoutDatabase.class, "workout_database").build();
                }
            }
        }
        return INSTANCE;
    }

}
