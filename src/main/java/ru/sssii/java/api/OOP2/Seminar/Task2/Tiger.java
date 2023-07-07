package ru.sssii.java.api.OOP2.Seminar.Task2;

public class Tiger extends Cat {
    private static int cnt;


    public Tiger() {
    }

    public Tiger(String name, String type) {
        super(name, type);
        cnt++;
    }


    public static int getCnt() {
        return cnt;
    }
}
