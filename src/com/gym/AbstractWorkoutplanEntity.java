package com.gym;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcel Sailer on 18.05.2017.
 */
public abstract class AbstractWorkoutplanEntity implements WorkoutplanEntity {

    @Override
    public double movedWeightOnPower() {
        return 0;
    }

    @Override
    public double timeOneEndurance() {
        return 0;
    }

    @Override
    public double caloriesOnEndurance() {
        return 0;
    }

    @Override
    public List<String> musclesOnPower() {
        return new ArrayList<String>();
    }

    @Override
    public double avgDifficulty() {
        return 0;
    }

    @Override
    public int getAmountOfPowerExercises() {
        return 0;
    }

    @Override
    public int getAmountOfEnduranceExercises() {
        return 0;
    }
}
