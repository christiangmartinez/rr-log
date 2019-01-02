package com.xtianmartinez.rrlog;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.xtianmartinez.rrlog.models.Workout;

import java.util.List;

@Dao
public interface WorkoutDao {
    @Insert
    void insert(Workout workout);

    @Query("SELECT * from workouts ORDER BY id DESC")
    LiveData<List<Workout>> getAllWorkouts();

}
