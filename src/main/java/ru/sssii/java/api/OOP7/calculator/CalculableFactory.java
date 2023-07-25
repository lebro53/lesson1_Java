package ru.sssii.java.api.OOP7.calculator;

public class CalculableFactory implements ICalculableFactory {
    public Calculable createPromt(int primaryArg) {
        return new PromtCalculator(primaryArg);
    }

    public CalculableComplex createComplex(int realArg, int imaginaryArg) {
        return new ComplexCalculator(realArg, imaginaryArg);
    }
}
