package org.example.anim;

import org.example.anim.Animal;

public class Dog extends Animal {
    boolean isPet;

    public Dog(boolean hasPairOfEyes, int numberOfLegs) {
        super(hasPairOfEyes, numberOfLegs);
        this.isPet = true;
    }

    @Override
    public void makeSound() {
        System.out.println("Barking!");
    }

    // Method Overloading
    public String move(String name, String message) {
        return name + " : " + message;
    }

    public String move(String message) {
        return message;
    }

    public String move() {
        return "Running, catch you later!";
    }
}
