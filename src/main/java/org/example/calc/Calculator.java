package org.example.calc;

public class Calculator implements CalculatorService {

    // data hiding - encapsulation

    // (("abc") "cde")
    // print(strVar) -> abc

    private double num1;
    private double num2;


    // No args constructor
    public Calculator() {
        this.num1 = 1.0;
        this.num2 = 2.0;
    }

    // Required args constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public void setNum1(double val1) {
        this.num1 = val1;
    }

    public void setNum2(double val2) {
        this.num2 = val2;
    }

    @Override
    public double add() {
        return this.num1 + this.num2;
    }

    @Override
    public double subtract() {
        return this.num1 - this.num2;
    }

    @Override
    public double multiply() {
        return this.num1 * this.num2;
    }

    @Override
    public double divide() {
        return this.num1 / this.num2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
