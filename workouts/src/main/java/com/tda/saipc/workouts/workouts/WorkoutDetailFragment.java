package com.tda.saipc.workouts.workouts;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutDetailFragment extends Fragment {

    private int workoutID;

    public WorkoutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null) {
            this.workoutID = savedInstanceState.getInt("workoutID");
        }
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        TextView title = (TextView) view.findViewById(R.id.workoutTitle);
        title.setText(Workout.workouts[workoutID].getName());
        TextView details = (TextView) view.findViewById(R.id.workoutDetails);
        details.setText(Workout.workouts[workoutID].getDescription());
    }

    public void setWorkoutID(int workoutID) {
        this.workoutID = workoutID;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("workoutID", this.workoutID);
    }
}
