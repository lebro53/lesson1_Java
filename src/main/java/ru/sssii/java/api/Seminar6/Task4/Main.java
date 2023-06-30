package ru.sssii.java.api.Seminar6.Task4;

public class Main {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp C = " + new Celsius().convertorValue(temp));
        System.out.println("temp F = " + new Calvin().convertorValue(temp));
        System.out.println("temp K = " + new Fahrenheit().convertorValue(temp));
    }
}
