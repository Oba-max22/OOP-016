package org.example.calc;

public interface CalculatorService {

    double add();

    double subtract();

    double multiply();

    double divide();

    default void defaultMeth() {
        System.out.println("This is a default method!");
    }
}
