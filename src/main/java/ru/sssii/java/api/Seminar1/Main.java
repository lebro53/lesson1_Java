package ru.sssii.java.api.Seminar1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
        task6();

    }


    /**
     * Задан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
     *
     * Возвращает текущую сумму nums.
     */
    private static void task6() {
        int arr[] = {1,2,3,4};
        int[] res = sumNumbers(arr);
        for (int n:res
             ) {
            System.out.print(n + ", ");
        }
    }

    private static int[] sumNumbers(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            array[i] += array[i-1];
        }
        return array;
    }

    /**
     * Дан массив целых чисел. Верно ли, что массив является симметричным.
     */
    private static void task5() {
        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println("polindrom(arr) = " + polindrom(arr));
    }

    /**
     *
     * @param arr - массив целых чисел
     * @return Симметричен или нет
     */
    private static String polindrom(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i-1]) {
                return "Не симметричен!";
            }
        }
        return "Симметричен!";
    }

    private static void task4() {
        /**
         * Даны две двоичные строки a и b, верните их сумму в виде двоичной строки.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string a = ");
        String a = scan.nextLine();
        System.out.println("Enter string b = ");
        String b = scan.nextLine();
        System.out.println(addBinary(a, b));


    }

    private static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            addBinary(b, a);
        }
        int k = 0;
        int g = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                k++;
            }
            if (g >= 0 && b.charAt(g) == '1') {
                k++;

            }
            g--;
            result = k % 2 + result;
            k /= 2;
        }
        if (k == 1) {
            result = k % 2 + result;
        }
        return result;
    }


    private static void task3() {
        /**
         * @appInfo Дана строка. Поменять местами ее половины.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String firstText = text.substring(0, text.length() / 2);
        String secondText = text.substring(text.length() / 2);
        String result = secondText + firstText;
        System.out.println(result.toLowerCase());

    }

    private static void task2() {
        /**
         * @appInfo Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
         */
        int[] arr = new int[]{1, 2, 5, -1, 0, 6, -9, 1, 1, 1, 1, 1, -1};
        int count = 0, maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count += 1;
            } else {
                if (maxCount < count) {
                    maxCount = count;

                }
                count = 0;
            }
            if (maxCount < count) {
                maxCount = count;
            }

        }
        System.out.println(maxCount);

    }

    private static void task1() {
        /*Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15*/

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter int n: ");
        int n = iScanner.nextInt();

        int multi = 1;
        int sumElem = 0;
        while (n > 0) {
            multi *= n % 10;
            sumElem += n % 10;
            n /= 10;
        }
        int result = multi - sumElem;
        System.out.println(result);
    }
}