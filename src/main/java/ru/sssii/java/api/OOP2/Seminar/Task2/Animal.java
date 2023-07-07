package ru.sssii.java.api.OOP2.Seminar.Task2;

public abstract class Animal {
    private String name;
    private String type;
    protected static int cnt;
    public int maxRunDistance;
    public int maxSwimDistance;


    public Animal(String name, String type) {
        cnt++;
        this.name = name;
        this.type = type;
        if(type.equals("Кот")){
            this.maxRunDistance = 200;
        }
        if(type.equals("Пес")) {
            this.maxRunDistance = 500;
            this.maxSwimDistance = 10;
        }
    }

    public Animal() {
    }


    public static int getCnt() {
        return cnt;
    }


    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Животное "+type + " по кличке "  + name + " проплыло дистанцию " + distance + " км.");
        } else {
            System.out.println("Животное "+type + " по кличке " + name + " НЕ проплыло дистанцию " + distance + " км.");
        }
    }

    ;

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Животное "+type + " по кличке "  + name + " пробежало дистанцию " + distance + " км.");
        } else {
            System.out.println("Животное "+type + " по кличке "  + name + " НЕ пробежало дистанцию " + distance + " км.");
        }
    }

    ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
