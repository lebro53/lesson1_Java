package ru.sssii.java.api.OOP1.Seminar1.Task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Miya", "silver", 3);
        Cat cat2 = new Cat("Maily", "white", 2);
        System.out.println(cat2);
        cat1.animalInfo();
        cat1.jump();
        cat1.voice();
    }
}
