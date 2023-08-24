package org.example.calc;

public class StatisticsCalculator implements CalculatorService, CalculatorServiceExt {

    private double num1;
    private double num2;

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
    public double avg() {
        return (this.num1 * this.num2) / 2;
    }

}
