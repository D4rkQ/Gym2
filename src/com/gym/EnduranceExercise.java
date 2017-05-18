package com.gym;



/**
 * Project: Gym
 * Created by Marcel Sailer on 15.05.2017.
 */
public class EnduranceExercise extends AbstractWorkoutplanEntity{

    private final String name;
    private final String description;
    private final int calorieConsumptionPerHour;

    public EnduranceExercise(String name, String description, int calorieConsumptionPerHour) {
        this.name = name;
        this.description = description;
        this.calorieConsumptionPerHour = calorieConsumptionPerHour;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
                ", description='" + description + '\'' +
                ", calorieConsumptionPerHour=" + calorieConsumptionPerHour +
                '}';
    }
}


