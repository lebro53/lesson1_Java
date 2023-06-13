package ru.sssii.java.api.HomeWork1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        Work1();
        Work2();
    }

    private static void Work2() {
        /**
         * Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
         * Пример ввода:
         * 1 2 1 2 -1 1 3 1 3 -1 0
         */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        while (b != 0) {
            if (a > 0 && b < 0) {
                result += a;
            }
            a = b;
            b = sc.nextInt();

        }
        System.out.println(result);
    }


    private static void Work1() {
        /**
         * https://leetcode.com/problems/reverse-words-in-a-string/
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String[] newText = text.split(" ");
        String reversText = "";
        for (int i = 0; i < newText.length; i++) {
            reversText = newText[i] + " " + reversText;
        }
        System.out.println(reversText.trim().replaceAll("\\s+", " "));

    }
}
