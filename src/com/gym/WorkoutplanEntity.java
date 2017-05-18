package com.gym;

import java.util.List;

/**
 * Project: Gym
 * Created by Marcel Sailer on 18.05.2017.
 */
public interface WorkoutplanEntity {

    double movedWeightOnPower();
    double timeOneEndurance();
    double caloriesOnEndurance();
    List<String> musclesOnPower();
    double avgDifficulty();
    int getAmountOfPowerExercises();
    int getAmountOfEnduranceExercises();

}
