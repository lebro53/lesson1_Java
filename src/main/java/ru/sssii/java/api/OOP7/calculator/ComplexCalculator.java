package ru.sssii.java.api.OOP7.calculator;

public class ComplexCalculator extends Calculator implements CalculableComplex {

    public ComplexCalculator(int realArg, int imaginaryArg) {
        super(realArg, imaginaryArg);

    }
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if(a.length != b.length){
            int[] c = new int[1];
            return c;
        } else{
            int [] c = new int[a.length];
            for(int i=0; i<c.length; i++){
                c[i] = a[i]-b[i];
            }
            return c;
        }


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
