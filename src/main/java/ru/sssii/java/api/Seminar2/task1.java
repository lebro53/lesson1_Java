package ru.sssii.java.api.Seminar2;

import java.util.Scanner;

public class task1 {
    /**
     * Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity numbers: ");
        int quantityNumber = sc.nextInt();
        int sumNumbers = 0;
        int res = sumNumbers(sumNumbers, quantityNumber, sc);
        System.out.println(res);
    }

    private static int sumNumbers(int sumNumbers, int quantityNumber, Scanner sc) {
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        for (int i = 1; i < quantityNumber; i++) {
            System.out.println("Enter next number: ");
            int secondNumber = sc.nextInt();
            if (firstNumber % 2 == 0 && (secondNumber % 5 == 0 && secondNumber % 10 != 0)) {
                sumNumbers += secondNumber;
            }
            firstNumber = secondNumber;

        }
        return sumNumbers;
    }
}
