package com.aoinc.day1jungle;

public class Tiger extends Animal {
    @Override
    protected void EatFood(Food food) {
        if (food instanceof Grain)
            System.out.println("Tigers can't eat that!");
        else {
            System.out.printf("Tiger eats {0}.", food.getClass().getSimpleName());
            energyLevel += 5;
        }
    }

    @Override
    protected void Sleep() {
        System.out.println("Tiger sleeps.");
        energyLevel += 5;
    }
}
