package com.gym;



/**
 * Project: Gym
 * Created by Marcel Sailer on 15.05.2017.
 */
public class EnduranceExercise extends AbstractWorkoutplanEntity{

    private final String name;
    private final String desctiption;
    private final int calorieConsumptionPerHour;

    public EnduranceExercise(String name, String desctiption, int calorieConsumptionPerHour) {
        this.name = name;
        this.desctiption = desctiption;
        this.calorieConsumptionPerHour = calorieConsumptionPerHour;
    }

    public String getName() {
        return name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public int getCalorieConsumptionPerHour() {
        return calorieConsumptionPerHour;
    }

    @Override
    public double caloriesOnEndurance() {
        return calorieConsumptionPerHour;
    }

    @Override
    public int getAmountOfEnduranceExercises() {
        return 1;
    }

    @Override
    public String toString() {
        return "EnduranceExercise{" +
                "name='" + name + '\'' +
                ", desctiption='" + desctiption + '\'' +
                ", calorieConsumptionPerHour=" + calorieConsumptionPerHour +
                '}';
    }
}


