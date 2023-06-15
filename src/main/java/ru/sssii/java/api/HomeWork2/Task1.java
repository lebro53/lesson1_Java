package ru.sssii.java.api.HomeWork2;

import java.util.Scanner;

import static java.lang.Math.sqrt;


public class Task1 {
    /**
     * Дана последовательность N целых чисел. Найти сумму простых чисел.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity numbers: ");
        int quantityNumber = sc.nextInt();
        System.out.println("sumPrimeNUmber(quantityNumber, sc) = " + sumPrimeNUmber(quantityNumber, sc));

    }

    /**
     * Суммирование простых чисел последовательности
     * @param numbers длина последовательности
     * @param cs Сканер для получения значений последовательности
     * @return Сумму простых чисел
     */
    private static int sumPrimeNUmber(int numbers, Scanner cs) {
        int sumNumbers = 0;
        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter a number: ");
            int number = cs.nextInt();
            if(primeTest(number)){
                sumNumbers += number;
            }
        }
        return sumNumbers;
    }

    /**
     * Проверка числа на простоту
     * @param number Число проверка которого покажет простое или нет
     * @return Простое число или нет
     */
    private static boolean primeTest(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= sqrt(number); i = i + 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

