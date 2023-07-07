package ru.sssii.java.api.OOP2.Seminar.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Dog", "dog"),
                new Cat("Cat", "Elephant"),
                new HomeCat("Mia", "elephant"),
                new Tiger("Slon", "bobik")
        };

        for (Animal animal : animals) {
            animal.run(500);
            animal.swim(20);
        }
        System.out.println(Animal.getCnt());
        System.out.println(Cat.getCnt());
        System.out.println(Tiger.getCnt());

    }

}
