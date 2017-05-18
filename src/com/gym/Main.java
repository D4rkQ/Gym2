package com.gym;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Members, Builders and Strategies

        MemberBuilder memberBuilder = new MemberBuilder("Martha", 1.65, 65, 30, new BMIStrategy());

        System.out.println(memberBuilder);
        System.out.println("Fitnesslevel " + "of " + memberBuilder.getName() + " calculated with BMI Strategy is " + memberBuilder.calcFitnesslevel());

        memberBuilder.setFitnessLevelStrategy(new FFMIStrategy());
        System.out.println("Fitnesslevel " + "of " + memberBuilder.getName() + " calculated with FFMI Strategy is " + memberBuilder.calcFitnesslevel());

        Member member = memberBuilder.build();
        System.out.println("Martha is now builded her Fitnesslevel and some other Attributes are finally set");
        System.out.println(member);

        System.out.println();

        //Generating a Workoutplan in a Composite

        List<MachineExercise> machineExerciseList = new ArrayList<>();

        List<String> muscleListBenchpress =new ArrayList<>();
        muscleListBenchpress.add("Chest");
        muscleListBenchpress.add("Shoulders");

        List<String> muscleListDeadlift =new ArrayList<>();
        muscleListDeadlift.add("Legs");
        muscleListDeadlift.add("lowerBack");

        machineExerciseList.add(
                new MachineExercise(3,
                        new PowerSet(10, 100,
                                new PowerExercise("Benchpress", "description", muscleListBenchpress, 9)))
        );
        machineExerciseList.add(
                new MachineExercise(4,
                        new PowerSet(8, 140,
                                new PowerExercise("Deadlift", "description", muscleListDeadlift, 10)))
        );
        machineExerciseList.add(
                new MachineExercise(2,
                        new EnduranceSet(60,
                                new EnduranceExercise("Crosstrainer", "description", 600)))
        );
        machineExerciseList.add(
                new MachineExercise(1,
                        new EnduranceSet(90,
                                new EnduranceExercise("treadmill", "description", 800)))
        );

        Workoutplan workoutplan = new Workoutplan(member, machineExerciseList);

        //Composite Power Questions
        System.out.println("Average difficulty of the Woroutplan: " + workoutplan.avgDifficulty() + " (0 = very easy, 10 = very difficult)");
        System.out.println("Moved weight of the Workoutplan: " + workoutplan.movedWeightOnPower() + " kg");
        System.out.println("Trained muscles on the Workoutplan: " + workoutplan.musclesOnPower());
        System.out.println("Amount of power exercises of the Workoutplan: " + workoutplan.getAmountOfPowerExercises());

        System.out.println();

        //Composite Endurance Questions
        System.out.println("Hours spend on endurance exercises: " + workoutplan.timeOneEndurance() + " hours");
        System.out.println("Calories burned on endurance exercises: " + workoutplan.caloriesOnEndurance() + " kcal");
        System.out.println("Amount of endurance exercises of the Workoutplan: " + workoutplan.getAmountOfEnduranceExercises());


    }
}
