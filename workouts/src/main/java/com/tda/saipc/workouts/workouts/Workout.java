package com.tda.saipc.workouts.workouts;

/**
 * Created by schandramouli on 8/16/15.
 */
public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("Limb Loosener", "5 pushups\n 10 Hardups \n blah"),
            new Workout("Core Agony", "100 dos\n100 donts"),
            new Workout("Wimp spl", "easy to do \n exercises"),
            new Workout("Teen spl", "not very easy\n but still doable")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
