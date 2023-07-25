package ru.sssii.java.api.OOP7.calculator;

public abstract class Calculator {

    protected int primaryArg;
    protected int realArg;
    protected int imaginaryArg;

    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    public Calculator(int realArg, int imaginaryArg) {
        this.realArg = realArg;
        this.imaginaryArg = imaginaryArg;
    }

}
