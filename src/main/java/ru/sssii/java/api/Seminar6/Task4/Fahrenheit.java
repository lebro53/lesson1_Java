package ru.sssii.java.api.Seminar6.Task4;

public class Fahrenheit implements Convertor{
    @Override
    public double convertorValue(double baseValue) {
        return 9/5*baseValue+32;
    }
}
