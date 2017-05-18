package com.gym;

/**
 * Project: Gym
 * Created by Marcel Sailer on 15.05.2017.
 */
public class FFMIStrategy implements FitnessLevelStrategy {

    //Fat-Free-Muscle-Index
    @Override
    public double calculate(IsMember isMember) {
        double ffm = 0;
        double ffmi = 0;

        ffm = isMember.getWeight()*(100-isMember.getBodyFatRatio())/100;
        ffmi = ffm/(isMember.getSize()*isMember.getSize())+6.3*(1.8-isMember.getSize());
        ffmi = Math.round(ffmi*100)/100.0;

        return ffmi;
    }
}
