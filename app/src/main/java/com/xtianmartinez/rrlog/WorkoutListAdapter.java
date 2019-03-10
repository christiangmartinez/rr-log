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
        private final TextView bodyWeight;
        private final TextView pullProgression;
        private final TextView pullReps1;
        private final TextView pullReps2;
        private final TextView pullReps3;
        private final TextView squatProgression;
        private final TextView squatReps1;
        private final TextView squatReps2;
        private final TextView squatReps3;
        private final TextView dipProgression;
        private final TextView dipReps1;
        private final TextView dipReps2;
        private final TextView dipReps3;
        private final TextView hingeProgression;
        private final TextView hingeReps1;
        private final TextView hingeReps2;
        private final TextView hingeReps3;
        private final TextView rowProgression;
        private final TextView rowReps1;
        private final TextView rowReps2;
        private final TextView rowReps3;
        private final TextView pushupProgression;
        private final TextView pushupReps1;
        private final TextView pushupReps2;
        private final TextView pushupReps3;
        private final TextView antiExtensionProgression;
        private final TextView antiExtensionReps1;
        private final TextView antiExtensionReps2;
        private final TextView antiExtensionReps3;
        private final TextView antiRotationProgression;
        private final TextView antiRotationReps1;
        private final TextView antiRotationReps2;
        private final TextView antiRotationReps3;
        private final TextView extensionProgression;
        private final TextView extensionReps1;
        private final TextView extensionReps2;
        private final TextView extensionReps3;

        private WorkoutViewHolder(View itemView) {
            super(itemView);
            itemDate= itemView.findViewById(R.id.progressDate);
            bodyWeight = itemView.findViewById(R.id.bodyWeight);
            pullProgression = itemView.findViewById(R.id.pullProgression);
            pullReps1 = itemView.findViewById(R.id.pullReps1);
            pullReps2 = itemView.findViewById(R.id.pullReps2);
            pullReps3 = itemView.findViewById(R.id.pullReps3);
            squatProgression = itemView.findViewById(R.id.squatProgression);
            squatReps1 = itemView.findViewById(R.id.squatReps1);
            squatReps2 = itemView.findViewById(R.id.squatReps2);
            squatReps3 = itemView.findViewById(R.id.squatReps3);
            dipProgression = itemView.findViewById(R.id.dipProgression);
            dipReps1 = itemView.findViewById(R.id.dipReps1);
            dipReps2 = itemView.findViewById(R.id.dipReps2);
            dipReps3 = itemView.findViewById(R.id.dipReps3);
            hingeProgression = itemView.findViewById(R.id.hingeProgression);
            hingeReps1 = itemView.findViewById(R.id.hingeReps1);
            hingeReps2 = itemView.findViewById(R.id.hingeReps2);
            hingeReps3 = itemView.findViewById(R.id.hingeReps3);
            rowProgression = itemView.findViewById(R.id.rowProgression);
            rowReps1 = itemView.findViewById(R.id.rowReps1);
            rowReps2 = itemView.findViewById(R.id.rowReps2);
            rowReps3 = itemView.findViewById(R.id.rowReps3);
            pushupProgression = itemView.findViewById(R.id.pushupProgression);
            pushupReps1 = itemView.findViewById(R.id.pushupReps1);
            pushupReps2 = itemView.findViewById(R.id.pushupReps2);
            pushupReps3 = itemView.findViewById(R.id.pushupReps3);
            antiExtensionProgression = itemView.findViewById(R.id.antiExtensionProgression);
            antiExtensionReps1 = itemView.findViewById(R.id.antiExtensionReps1);
            antiExtensionReps2 = itemView.findViewById(R.id.antiExtensionReps2);
            antiExtensionReps3 = itemView.findViewById(R.id.antiExtensionReps3);
            antiRotationProgression = itemView.findViewById(R.id.antiRotationProgression);
            antiRotationReps1 = itemView.findViewById(R.id.antiRotationReps1);
            antiRotationReps2 = itemView.findViewById(R.id.antiRotationReps2);
            antiRotationReps3 = itemView.findViewById(R.id.antiRotationReps3);
            extensionProgression = itemView.findViewById(R.id.extensionProgression);
            extensionReps1 = itemView.findViewById(R.id.extensionReps1);
            extensionReps2 = itemView.findViewById(R.id.extensionReps2);
            extensionReps3 = itemView.findViewById(R.id.extensionReps3);
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
            holder.bodyWeight.setText(current.getBodyWeight());
            holder.pullProgression.setText(current.getPullProgression());
            holder.pullReps1.setText(current.getPullSet1());
            holder.pullReps2.setText(current.getPullSet2());
            holder.pullReps3.setText(current.getPullSet3());
            holder.squatProgression.setText(current.getSquatProgression());
            holder.squatReps1.setText(current.getSquatSet1());
            holder.squatReps2.setText(current.getSquatSet2());
            holder.squatReps3.setText(current.getSquatSet3());
            holder.dipProgression.setText(current.getDipProgression());
            holder.dipReps1.setText(current.getDipSet1());
            holder.dipReps2.setText(current.getDipSet2());
            holder.dipReps3.setText(current.getDipSet3());
            holder.hingeProgression.setText(current.getHingeProgression());
            holder.hingeReps1.setText(current.getHingeSet1());
            holder.hingeReps2.setText(current.getHingeSet2());
            holder.hingeReps3.setText(current.getHingeSet3());
            holder.rowProgression.setText(current.getRowProgression());
            holder.rowReps1.setText(current.getRowSet1());
            holder.rowReps2.setText(current.getRowSet2());
            holder.rowReps3.setText(current.getRowSet3());
            holder.pushupProgression.setText(current.getPushupProgression());
            holder.pushupReps1.setText(current.getPushupSet1());
            holder.pushupReps2.setText(current.getPushupSet2());
            holder.pushupReps3.setText(current.getPushupSet3());
            holder.antiExtensionProgression.setText(current.getAntiExtensionProgression());
            holder.antiExtensionReps1.setText(current.getAntiExtensionSet1());
            holder.antiExtensionReps2.setText(current.getAntiExtensionSet2());
            holder.antiExtensionReps3.setText(current.getAntiExtensionSet3());
            holder.antiRotationProgression.setText(current.getAntiRotationProgression());
            holder.antiRotationReps1.setText(current.getAntiRotationSet1());
            holder.antiRotationReps2.setText(current.getAntiRotationSet2());
            holder.antiRotationReps3.setText(current.getAntiRotationSet3());
            holder.extensionProgression.setText(current.getExtensionProgression());
            holder.extensionReps1.setText(current.getExtensionSet1());
            holder.extensionReps2.setText(current.getExtensionSet2());
            holder.extensionReps3.setText(current.getExtensionSet3());
        } else {
            holder.itemDate.setText("No data found");
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
