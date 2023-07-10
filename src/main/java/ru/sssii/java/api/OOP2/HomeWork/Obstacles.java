package ru.sssii.java.api.OOP2.HomeWork;

public class Obstacles {
    private final Wall height;
    private final Treadmill length;


    public Obstacles(Treadmill length, Wall height) {
        this.length = length;
        this.height = height;
    }

    public Wall getHeight() {
        return height;
    }

    public Treadmill getLength() {
        return length;
    }
}
