package com.gym;

/**
 * Project: Gym
 * Created by Marcel Sailer on 15.05.2017.
 */
public class MemberBuilder implements IsMember{

    private String name;
    private double size;
    private double weight;
    private int bodyFatRatio;
    private FitnessLevelStrategy fitnessLevelStrategy;

    public MemberBuilder(String name, double size, double weight, int bodyFatRatio, FitnessLevelStrategy fitnessLevelStrategy) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.bodyFatRatio = bodyFatRatio;
        this.fitnessLevelStrategy = fitnessLevelStrategy;
    }

    public Member build(){
        return new Member(name, size, weight, bodyFatRatio, fitnessLevelStrategy);
    }

    @Override
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBodyFatRatio(int bodyFatRatio) {
        this.bodyFatRatio = bodyFatRatio;
    }

    public void setFitnessLevelStrategy(FitnessLevelStrategy fitnessLevelStrategy) {
        this.fitnessLevelStrategy = fitnessLevelStrategy;
    }

    @Override
    public String toString() {
        return "MemberBuilder{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", bodyFatRatio=" + bodyFatRatio +
                ", fitnessLevelStrategy=" + fitnessLevelStrategy +
                '}';
    }
}
