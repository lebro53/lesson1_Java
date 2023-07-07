package ru.sssii.java.api.OOP2.Seminar.Task2;

public class Cat extends Animal {
    protected static int cnt;


    public Cat() {
    }

    public Cat(String name, String type) {
        super(name, "Кот");
        cnt++;
    }


    public static int getCnt() {
        return cnt;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котики не умеют плавать");
    }


}
