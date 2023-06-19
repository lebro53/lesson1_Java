package ru.sssii.java.api.Seminar2;

public class task3 {
    public static void main(String[] args) {
        Vector vector = new Vector(1, 2, 3);
        Vector vector2 = new Vector(1, 1, 1);
        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.multiVector(vector2) = " + vector.multiVector(vector2));
        System.out.println("vector.cosVector(vector2) = " + vector.cosVector(vector2));
        System.out.println("vector.sumVector(vector2) = " + vector.sumVector(vector2));
        System.out.println("vector.diffVector(vector2) = " + vector.diffVector(vector2));
    }
}
