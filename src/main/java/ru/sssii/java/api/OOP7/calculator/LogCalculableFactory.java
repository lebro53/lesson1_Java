package ru.sssii.java.api.OOP7.calculator;

public class LogCalculableFactory implements ICalculableFactory {

    private Logable logger;

    public LogCalculableFactory(Logable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable createPromt(int primaryArg) {
        return new LogCalculator(new PromtCalculator(primaryArg),logger);
    }

    @Override
    public CalculableComplex createComplex(int realArg, int imaginaryArg) {
        return new LogCalculator(new ComplexCalculator(realArg,imaginaryArg), logger);
    }
}
