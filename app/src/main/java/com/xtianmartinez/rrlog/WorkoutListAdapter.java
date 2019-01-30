package com.xtianmartinez.rrlog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xtianmartinez.rrlog.models.Workout;

import java.util.List;

public class WorkoutListAdapter extends RecyclerView.Adapter<WorkoutListAdapter.WorkoutViewHolder> {
    class WorkoutViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemDate;
        private final TextView itemBodyWeight;
        private final TextView itemPullProgression;

        private WorkoutViewHolder(View itemView) {
            super(itemView);
            itemDate= itemView.findViewById(R.id.progressDate);
            itemBodyWeight = itemView.findViewById(R.id.progressBodyWeight);
            itemPullProgression = itemView.findViewById(R.id.progressPullProgression);
        }
    }

    private final LayoutInflater mInflater;
    private List<Workout> mWorkouts;

    public WorkoutListAdapter(Context context) { mInflater= LayoutInflater.from(context); }

    @Override
    public WorkoutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.progress_recyclerview_item, parent, false);
        return new WorkoutViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutViewHolder holder, int position) {
        if (mWorkouts != null) {
            Workout current = mWorkouts.get(position);
            holder.itemDate.setText(current.getWorkoutDate());
            holder.itemBodyWeight.setText(current.getBodyWeight());
            holder.itemPullProgression.setText(current.getPullProgression());
        } else {
            holder.itemDate.setText("No date found");
            holder.itemBodyWeight.setText("No body weight found");
            holder.itemPullProgression.setText("No pull progression found");
        }
    }

    public void setWorkouts(List<Workout> workouts) {
        mWorkouts = workouts;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mWorkouts != null)
            return mWorkouts.size();
        else return 0;
    }

}
