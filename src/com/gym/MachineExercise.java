package com.gym;

import java.util.List;

/**
 * Project: Gym
 * Created by Max on 15.05.2017.
 */
public class MachineExercise extends AbstractWorkoutplanEntity{

    private final int amountOfSets;
    private final WorkoutplanEntity set; //Has to be a PowerSet or a Endurance Set

    public MachineExercise(int amountOfSets, WorkoutplanEntity set) {
        this.amountOfSets = amountOfSets;
        this.set = set;
    }

    public int getAmountOfSets() {
        return amountOfSets;
    }

    public WorkoutplanEntity getSet() {
        return set;
    }


    @Override
    public double avgDifficulty() {
        return set.avgDifficulty();
    }

    @Override
    public double movedWeightOnPower() {
        return set.movedWeightOnPower()*amountOfSets;
    }

    @Override
    public List<String> musclesOnPower() {
        return set.musclesOnPower();
    }

    @Override
    public double timeOneEndurance() {
        return set.timeOneEndurance()*amountOfSets;
    }

    @Override
    public double caloriesOnEndurance() {
        return set.caloriesOnEndurance()*amountOfSets;
    }

    @Override
    public int getAmountOfPowerExercises() {
        return set.getAmountOfPowerExercises();
    }

    @Override
    public int getAmountOfEnduranceExercises() {
        return set.getAmountOfEnduranceExercises();
    }

    @Override
    public String toString() {
        return "MachineExercise{" +
                "amountOfSets=" + amountOfSets +
                ", set=" + set +
                '}';
    }
}
