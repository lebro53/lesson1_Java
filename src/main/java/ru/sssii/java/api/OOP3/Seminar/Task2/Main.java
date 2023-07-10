package ru.sssii.java.api.OOP3.Seminar.Task2;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
        switch (fruit){
            case APPLE -> System.out.println("Яблоко");
            case PEACH -> System.out.println("Персик");
            case MELLON -> System.out.println("Дыня");
            case ORANGE -> System.out.println("Апельсин");
            default -> System.out.println("Фрукт отсутствует");
        }
    }
}
