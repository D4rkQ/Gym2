package com.gym;

/**
 * Project: Gym
 * Created by Max on 15.05.2017.
 */
public class Member implements IsMember{

    private final String name;
    private final double size;
    private final double weight;
    private final int bodyFatRatio;
    private final  FitnessLevelStrategy fitnessLevelStrategy;

    public Member(String name, double size, double weight, int bodyFatRatio, FitnessLevelStrategy fitnessLevelStrategy) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.bodyFatRatio = bodyFatRatio;
        this.fitnessLevelStrategy = fitnessLevelStrategy;
    }

    public double calcFitnesslevel(){
        return fitnessLevelStrategy.calculate(this);
    }

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public int getBodyFatRatio() {
        return bodyFatRatio;
    }

    public FitnessLevelStrategy getFitnessLevelStrategy() {
        return fitnessLevelStrategy;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", bodyFatRatio=" + bodyFatRatio +
                ", fitnessLevelStrategy=" + fitnessLevelStrategy +
                '}';
    }
}
