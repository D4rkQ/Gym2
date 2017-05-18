package com.gym;

import java.util.List;

/**
 * Project: Gym
 * Created by Marcel Sailer on 15.05.2017.
 */
public class PowerSet extends AbstractWorkoutplanEntity{

    private final int amountOfReps;
    private final double weight;
    private final PowerExercise powerExercise;

    public PowerSet(int amountOfReps, double weight, PowerExercise powerExercise) {
        this.amountOfReps = amountOfReps;
        this.weight = weight;
        this.powerExercise = powerExercise;
    }

    public int getAmountOfReps() {
        return amountOfReps;
    }

    public double getWeight() {
        return weight;
    }

    public PowerExercise getPowerExercise() {
        return powerExercise;
    }

    @Override
    public double avgDifficulty() {
        return powerExercise.avgDifficulty();
    }

    @Override
    public double movedWeightOnPower() {
        return amountOfReps *weight;
    }

    @Override
    public List<String> musclesOnPower() {
        return powerExercise.musclesOnPower();
    }

    @Override
    public int getAmountOfPowerExercises() {
        return powerExercise.getAmountOfPowerExercises();
    }

    @Override
    public String toString() {
        return "PowerSet{" +
                "amountOfReps=" + amountOfReps +
                ", weight=" + weight +
                ", powerExercise=" + powerExercise +
                '}';
    }
}
