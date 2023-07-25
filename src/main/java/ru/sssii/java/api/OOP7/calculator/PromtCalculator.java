package ru.sssii.java.api.OOP7.calculator;

public class PromtCalculator extends Calculator implements  Calculable {

    public PromtCalculator(int primaryArg) {
        super(primaryArg);
    }

    @Override
    public Calculable sumPromt(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public Calculable multiPromt(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}


