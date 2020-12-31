package com.aoinc.day1jungle;

public abstract class Animal {

    int energyLevel = 10;
    public int otherAnimalsSameType = 0;

    protected void MakeSound() {
        System.out.printf("{0} is making noise", this.getClass().getSimpleName());
        energyLevel -= 3;
    }

    protected void EatFood(Food food) {
        System.out.printf("eating {0}", food.getClass().getSimpleName());
        energyLevel += 5;
    }

    protected void Sleep() {
        System.out.printf("{0} is sleeping.", this.getClass().getSimpleName());
        energyLevel += 10;
    }

    protected void ReportEnergy() {
        System.out.printf("Energy level: {0}", energyLevel);
    }
}
