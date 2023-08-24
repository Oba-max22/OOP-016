package org.example.anim;

import org.example.anim.Animal;

public class Cat extends Animal {
    boolean isPet;

    public Cat(boolean hasPairOfEyes, int numberOfLegs) {
        super(hasPairOfEyes, numberOfLegs);
        this.isPet = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Meowing!");
    }
}
