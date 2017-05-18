package com.gym;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Project: Gym
 * Created by Marcel Sailer on 18.05.2017.
 */
public class GymTest {

    @Test
    public void memberTest(){

        MemberBuilder memberBuilder = new MemberBuilder("Martha", 1.65, 65, 30, new BMIStrategy());
        assertEquals(23.88, memberBuilder.calcFitnesslevel(),0);

        memberBuilder.setFitnessLevelStrategy(new FFMIStrategy());
        assertEquals(17.66, memberBuilder.calcFitnesslevel(),0);

        Member member = memberBuilder.build();
        assertEquals("Martha", member.getName());

        memberBuilder.setFitnessLevelStrategy(new BMIStrategy());
        memberBuilder.setName("Hans");

        member = memberBuilder.build();

        assertEquals("Hans", member.getName());
        assertEquals((new BMIStrategy()).getClass(), member.getFitnessLevelStrategy().getClass());

    }

    @Test
    public void workoutplanTest(){
        MemberBuilder memberBuilder = new MemberBuilder("Martha", 1.65, 65, 30, new BMIStrategy());
        Member member = memberBuilder.build();

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
        assertEquals(9.5, workoutplan.avgDifficulty(),0);
        assertEquals(7480.0, workoutplan.movedWeightOnPower(),0);
        assertEquals("[Chest, Shoulders, Legs, lowerBack]", workoutplan.musclesOnPower().toString());
        assertEquals(2, workoutplan.getAmountOfPowerExercises(),0);

        //Composite Endurance Questions
        assertEquals(3.5, workoutplan.timeOneEndurance(), 0);
        assertEquals(2400.0, workoutplan.caloriesOnEndurance(), 0);
        assertEquals(2, workoutplan.getAmountOfEnduranceExercises(),0);

    }
}
