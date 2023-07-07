package ru.sssii.java.api.OOP2.Seminar.Task3;

public class Car implements Transport{
    @Override
    public void start() {
        System.out.println("Машина едет");
    }

    @Override
    public void stop() {
        System.out.println("Машина стоит");

    }
}
