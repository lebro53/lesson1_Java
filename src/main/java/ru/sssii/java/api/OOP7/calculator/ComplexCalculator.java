package ru.sssii.java.api.OOP7.calculator;

public class ComplexCalculator extends Calculator implements CalculableComplex {

    public ComplexCalculator(int realArg, int imaginaryArg) {
        super(realArg, imaginaryArg);
    }


    @Override
    public void sumComplex(int arg1, int arg2) {
        realArg += arg1;
        imaginaryArg += arg2;
        System.out.println("Результат: " + realArg + " + " + imaginaryArg + "i");
    }


    @Override
    public void multiComplex(int arg1, int arg2) {
        int res1 = realArg * arg1 - imaginaryArg * arg2;
        int res2 = imaginaryArg*arg1 + realArg*arg2;
        realArg = res1;
        imaginaryArg = res2;
        System.out.println("Результат: " + realArg + " + " + imaginaryArg + "i");
    }


}
