package com.tda.saipc.workouts.workouts;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment {


    public WorkoutListFragment() {
        // Required empty public constructor
    }

    // define a static interface, which can be implemented by the activities
    // that want to listen to list-clicks
    static interface WorkoutListListener {
        void itemClicked(int position);
    }

    private WorkoutListListener listener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // works cause toString overridden in workouts --> good going Pc.
        ArrayAdapter<Workout> listAdapter = new ArrayAdapter<Workout>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                Workout.workouts
            );
        setListAdapter(listAdapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (WorkoutListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (this.listener != null) {
            this.listener.itemClicked(position);
        }
    }
}
