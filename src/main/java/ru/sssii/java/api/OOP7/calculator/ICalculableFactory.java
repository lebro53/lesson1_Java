package ru.sssii.java.api.OOP7.calculator;

public interface ICalculableFactory {
    Calculable createPromt(int primaryArg);
    CalculableComplex createComplex(int realArg, int imaginaryArg);
}
