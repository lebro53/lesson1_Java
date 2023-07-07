package ru.sssii.java.api.OOP2.Seminar.Task3;

public class Bike implements Transport {
    @Override
    public void start() {
        System.out.println("Велосипед едет");

    }

    @Override
    public void stop() {
        System.out.println("Велосипед стоит");

    }
}
