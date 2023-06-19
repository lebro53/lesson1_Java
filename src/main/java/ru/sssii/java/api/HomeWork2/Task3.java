package ru.sssii.java.api.HomeWork2;

import static java.lang.Math.abs;

public class Task3 {
    /**
     * Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * 0  1  2  3  4  5  6  7
     * 1,-2,22,-3,33,-4,44,-5
     */
    public static void main(String[] args) {
        int[] arr = {1, -2, 22, -3, 33, -4, 44, -5, 10, -22};
        int[] swapElemArray = swapNegativeElem(arr, sumIndexTwoDigitsElem(arr));
        for (int n : swapElemArray
        ) {
            System.out.print(n + " ");
        }

    }

    private static int[] swapNegativeElem(int[] array, int sumIndexTwoDigitsArray) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                array[j] = sumIndexTwoDigitsArray;
            }
        }
        return array;
    }

    private static int sumIndexTwoDigitsElem(int[] array) {
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 100 && abs(array[i] / 10) > 0) {
                sumIndex += i;
            }
        }
        return sumIndex;
    }
}
