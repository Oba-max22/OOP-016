package org.example.anim;

public class Animal {

    public static final boolean IS_ALIVE = true;

    boolean hasPairOfEyes;
    static int numberOfLegs;

    public Animal(boolean hasPairOfEyes, int numberOfLegs) {
        this.hasPairOfEyes = hasPairOfEyes;
        this.numberOfLegs = numberOfLegs;
    }

    public void makeSound() {
        System.out.println("Generic Animal Sound!");
    }
}
