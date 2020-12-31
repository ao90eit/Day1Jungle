package com.aoinc.day1jungle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jungle {
    public List<Animal> animals = new ArrayList<Animal>() {
//        {
//            add(new Tiger());
//            add(new Monkey());
//            add(new Snake());
//        }
    };

    public void AddAnimal(Animal newAnimal) {
        int otherAnimalCount = 0;
        for (Animal a : animals) {
            if (a.getClass() == newAnimal.getClass()) {
                a.otherAnimalsSameType++;
                otherAnimalCount++;
            }
        }
        newAnimal.otherAnimalsSameType = otherAnimalCount;
        animals.add(newAnimal);
    }
    
    public void SoundOff() {
        for (Animal a : animals) {
            a.MakeSound();
            a.ReportEnergy();
        }
    }

    public void DoRandom() {
        Random random = new Random();

        for (Animal a : animals) {
            int n = random.nextInt(4);
            switch (n) {
                case 3:
                    a.EatFood(new Grain());
                    break;
                case 2:
                    a.Sleep();
                    break;
                case 1:
                    if (a instanceof Monkey) {
                        ((Monkey) a).Play();
                        break;
                    }
                default:
                    a.MakeSound();
                    break;
            }
            a.MakeSound();
            a.ReportEnergy();
        }
    }
}
