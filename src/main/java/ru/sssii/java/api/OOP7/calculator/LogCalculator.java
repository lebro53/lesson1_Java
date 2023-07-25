package ru.sssii.java.api.OOP7.calculator;

public class LogCalculator implements Calculable, CalculableComplex {
    private CalculableComplex decrated2;
    private Calculable decorated;
    private Logable logable;

    public LogCalculator(Calculable decorated, Logable logable) {
        this.decorated = decorated;
        this.logable = logable;
    }

    public LogCalculator(CalculableComplex decrated2, Logable logable) {
        this.decrated2 = decrated2;
        this.logable = logable;
    }

    @Override
    public Calculable sumPromt(int arg) {
        logable.log("вызвался метод суммы с параметром : " + arg);
        return decorated.sumPromt(arg);
    }

    @Override
    public Calculable multiPromt(int arg) {
        logable.log("вызвался метод умножения с параметром : " + arg);
        return decorated.multiPromt(arg);
    }



    @Override
    public int getResult() {
        logable.log("пользователь запросил результат!");
        return decorated.getResult();
    }

    @Override
    public void sumComplex(int arg1, int arg2) {
        logable.log("вызвался метод суммы с параметром : " + arg1 + ", " + arg2);
        decrated2.sumComplex(arg1,arg2);
    }

    @Override
    public void multiComplex(int arg1, int arg2) {
        logable.log("вызвался метод умножения с параметром : " + arg1 + ", " + arg2);
        decrated2.multiComplex(arg1,arg2);
    }
}
