package com.aoinc.day1jungle;

public class Monkey extends Animal {
    @Override
    protected void MakeSound() {
        System.out.println("MONKEY SCREECH GO!");
        energyLevel -= 4;
    }

    @Override
    protected void EatFood(Food food) {
        System.out.printf("Monkey eats {0}.", food.getClass().getSimpleName());
        energyLevel += 2;
    }

    protected void Play() {
        if (energyLevel > 0) {
            System.out.println("Oooo Oooo Oooo");
            energyLevel -= 8;
        }
        else {
            System.out.println("Monkey is too tired.");
        }
    }
}
