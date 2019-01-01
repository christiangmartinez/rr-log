package com.xtianmartinez.rrlog;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import com.xtianmartinez.rrlog.models.Workout;

@Dao
public interface WorkoutDao {
    @Insert
    public void insertWorkout(Workout workout);
}
