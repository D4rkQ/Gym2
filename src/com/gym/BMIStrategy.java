package com.gym;

/**
 * Project: Gym
 * Created by Max on 15.05.2017.
 */
public class BMIStrategy implements FitnessLevelStrategy {

    @Override
    public double calculate(IsMember isMember) {
        double bmi;

        bmi = isMember.getWeight()/Math.pow(isMember.getSize(),2);
        bmi = Math.round(bmi*100)/100.0;

        return bmi;
    }



}
