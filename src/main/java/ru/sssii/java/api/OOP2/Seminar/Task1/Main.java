package ru.sssii.java.api.OOP2.Seminar.Task1;

public class Main {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Miya", "silver", 3);
////        Cat cat2 = new Cat("Maily", "white", 2);
//        System.out.println(cat2);
//        cat1.animalInfo();
//        cat1.jump();
//        cat1.voice();
        Animal dog = new Dog("Rollo", "Black", 3);
        dog.animalInfo();
//        cat1.klubok();
        Animal cat3 = new Cat("Kot", "White", 21);
        ((Cat) cat3).klubok();
        Animal[] catAndDog = {
                new Cat("CAt", "Black", 11),
                new Dog("Dog", "Scalp", 12)
        };
        for (Animal o : catAndDog) {
            o.voice();
        }
    }
}
