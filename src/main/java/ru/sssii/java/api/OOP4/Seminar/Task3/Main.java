package ru.sssii.java.api.OOP4.Seminar.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            doubleList.add((double) i);
        }
        System.out.println("calculator.sum(doubleList) = " + calculator.sum(doubleList));
        System.out.println("calculator.mult(doubleList) = " + calculator.mult(doubleList));
        System.out.println("calculator.div(doubleList) = " + calculator.div(doubleList));


        Double number = 7.00000000000000;
        Float number1 = 6.000000000000f;
        Integer number2 = 5;
        String number3 = "4";
        System.out.println("calculator.binary(number) = " + calculator.binary(number));
        System.out.println("calculator.binary(number1) = " + calculator.binary(number1));
        System.out.println("calculator.binary(number2) = " + calculator.binary(number2));
        System.out.println("calculator.binary(number3) = " + calculator.binary(number3));
    }


}
