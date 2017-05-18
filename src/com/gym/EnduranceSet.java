package com.gym;

/**
 * Project: Gym
 * Created by Max on 15.05.2017.
 */
public class EnduranceSet extends AbstractWorkoutplanEntity{

    private final int durationInMinutes;
    private final EnduranceExercise enduranceExercise;

    public EnduranceSet(int durationInMinutes, EnduranceExercise enduranceExercise) {
        this.durationInMinutes = durationInMinutes;
        this.enduranceExercise = enduranceExercise;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public EnduranceExercise getEnduranceExercise() {
        return enduranceExercise;
    }

    @Override
    public double timeOneEndurance() {
        return durationInMinutes;
    }

    @Override
    public double caloriesOnEndurance() {
        return enduranceExercise.caloriesOnEndurance()*(durationInMinutes/60.0);
    }

    @Override
    public int getAmountOfEnduranceExercises() {
        return enduranceExercise.getAmountOfEnduranceExercises();
    }

    @Override
    public String toString() {
        return "EnduranceSet{" +
                "durationInMinutes=" + durationInMinutes +
                ", enduranceExercise=" + enduranceExercise +
                '}';
    }
}
