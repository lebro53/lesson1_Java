package ru.sssii.java.api.OOP4.Seminar.Task3;

import java.util.List;

public class Calculator<T> {
    public Double sum(List<? extends Number> doubleList) {
        double resulte = 0.0;
        for (Number number : doubleList) {
            resulte += number.doubleValue();
        }
        return resulte;
    }

    public Double mult(List<? extends Number> doubleList) {
        double resulte = 1.0;
        for (Number number : doubleList) {
            resulte *= number.doubleValue();
        }
        return resulte;
    }

    public Double div(List<? extends Number> doubleList) {
        double resulte = 1.0;
        for (Number number : doubleList) {
            resulte /= number.doubleValue();
        }
        return resulte;
    }


    public Integer binary(T number) {
        String num = String.valueOf(number).replace(".0","");
        Integer quotient = Integer.valueOf(num);
        StringBuilder result = new StringBuilder();
        while (quotient > 0) {
            Integer remainder = quotient % 2;
            result.append(remainder);
            quotient /= 2;
        }
        result = result.reverse();
        return Integer.valueOf(result.toString());
    }
}
