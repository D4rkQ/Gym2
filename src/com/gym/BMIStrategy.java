package com.gym;

/**
 * Project: Gym
 * Created by Marcel Sailer on 15.05.2017.
 */
public class BMIStrategy implements FitnessLevelStrategy {
    //Body-Mass-Index
    @Override
    public double calculate(IsMember isMember) {
        double bmi;

        bmi = isMember.getWeight()/Math.pow(isMember.getSize(),2);
        bmi = Math.round(bmi*100)/100.0;

        return bmi;
    }
}
