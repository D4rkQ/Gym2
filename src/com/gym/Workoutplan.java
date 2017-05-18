package com.gym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project: Gym
 * Created by Max on 15.05.2017.
 */
public class Workoutplan extends AbstractWorkoutplanEntity {

    private final Member member;
    private final List<MachineExercise> machineExerciseList;

    public Workoutplan(Member member, List<MachineExercise> machineExerciseList) {
        this.member = member;
        this.machineExerciseList = machineExerciseList;
    }

    public Member getMember() {
        return member;
    }

    public List<MachineExercise> getMachineExerciseList() {
        return Collections.unmodifiableList(machineExerciseList);
    }

    @Override
    public double avgDifficulty() {
        double tmp = 0;
        for (MachineExercise x : machineExerciseList) {
            tmp += x.avgDifficulty();
        }
        return tmp / this.getAmountOfPowerExercises();
    }

    @Override
    public double movedWeightOnPower() {
        double tmp = 0;
        for (MachineExercise x : machineExerciseList) {
            tmp += x.movedWeightOnPower();
        }
        return tmp;
    }

    @Override
    public List<String> musclesOnPower() {
        List<String> tmp = new ArrayList<>();
        for (MachineExercise x : machineExerciseList) {
            tmp.addAll(x.musclesOnPower());
        }
        return tmp;
    }

    @Override
    public double timeOneEndurance() {
        double tmp = 0;
        for (MachineExercise x : machineExerciseList) {
            tmp += x.timeOneEndurance();
        }
        return tmp/60.0;
    }

    @Override
    public double caloriesOnEndurance() {
        double tmp = 0;
        for (MachineExercise x : machineExerciseList) {
            tmp += x.caloriesOnEndurance();
        }
        return tmp;
    }

    @Override
    public int getAmountOfPowerExercises() {
        int tmp = 0;
        for (MachineExercise x : machineExerciseList) {
            tmp += x.getAmountOfPowerExercises();
        }
        return tmp;
    }

    @Override
    public int getAmountOfEnduranceExercises() {
        int tmp = 0;
        for (MachineExercise x : machineExerciseList) {
            tmp += x.getAmountOfEnduranceExercises();
        }
        return tmp;
    }

    @Override
    public String toString() {
        return "Workoutplan{" +
                "member=" + member +
                ", machineExerciseList=" + machineExerciseList +
                '}';
    }
}
