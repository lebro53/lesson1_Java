package ru.sssii.java.api.HomeWork2;

import java.util.Scanner;

public class Task2 {
    /**
     * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity numbers: ");
        int quantityNumber = sc.nextInt();
        if (ascendingCheck(quantityNumber, sc)) {
            System.out.println("Последовательность является возрастающей!");
        } else {
            System.out.println("Последовательность не является возрастающей!");
        }

    }

    private static boolean ascendingCheck(int quantity, Scanner cs) {
        boolean[] checkFlag = new boolean[quantity-1];
        System.out.println("Enter a number");
        int firstNumber = cs.nextInt();
        for (int i = 0; i < quantity-1; i++) {
            System.out.println("Enter a number");
            int number = cs.nextInt();
            if (number >= firstNumber) {
                checkFlag[i] = true;
            } else {
                checkFlag[i] = false;
            }
            firstNumber = number;
        }
        for (int i = 0; i < checkFlag.length; i++) {
            if(checkFlag[i] == false){
                return false;
            }
        }
        return true;

    }
}