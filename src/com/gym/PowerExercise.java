package com.gym;

import java.util.Collections;
import java.util.List;

/**
 * Project: Gym
 * Created by Max on 15.05.2017.
 */
public class PowerExercise extends AbstractWorkoutplanEntity{

    private final String name;
    private final String desctiption;
    private final List<String> muscles;
    private final int difficulty;

    public PowerExercise(String name, String desctiption, List<String> muscles, int difficulty) {
        this.name = name;
        this.desctiption = desctiption;
        this.muscles = muscles;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public List<String> getMuscles() {
        return Collections.unmodifiableList(muscles);
    }

    public int getDifficulty() {
        return difficulty;
    }

    @Override
    public double avgDifficulty() {
        return difficulty;
    }

    @Override
    public List<String> musclesOnPower() {
        return Collections.unmodifiableList(muscles);
    }

    @Override
    public int getAmountOfPowerExercises() {
        return 1;
    }

    @Override
    public String toString() {
        return "PowerExercise{" +
                "name='" + name + '\'' +
                ", desctiption='" + desctiption + '\'' +
                ", muscles=" + muscles +
                ", difficulty=" + difficulty +
                '}';
    }
}
