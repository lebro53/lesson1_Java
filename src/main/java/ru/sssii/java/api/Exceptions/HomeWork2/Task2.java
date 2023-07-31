package ru.sssii.java.api.Exceptions.HomeWork2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = getArray();
        double catchedRes1 = (double) intArray[8] / getDivider();
        System.out.println("catchedRes1 = " + catchedRes1);
    }

    private static int getDivider() {
        for (; ; ) {
            System.out.println("Enter divider: ");
            Scanner scanner1 = new Scanner(System.in);
            try {
                int d = scanner1.nextInt();
                if (d == 0) {
                    System.out.println("Division by zero. Enter new number: ");
                } else {
                    scanner1.close();
                    return d;
                }
            } catch (InputMismatchException e) {
                System.out.println("Catching exception: " + e);
            }
        }
    }

    private static int[] getArray() {
        Random random = new Random();
        for (; ; ) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter array size");
                int sizeArray = scanner.nextInt();
                if (sizeArray < 9) {
                    System.out.println("Please enter a number greater than or equal to 9");
                } else {
                    int[] intArray = new int[sizeArray];
                    for (int i = 0; i < intArray.length; i++) {
                        intArray[i] = random.nextInt(1, 50);
                    }
                    return intArray;
                }
            } catch (InputMismatchException e) {
                System.out.println("Catching exception: " + e);
            }
        }
    }
}
