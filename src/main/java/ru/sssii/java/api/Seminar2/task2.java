package ru.sssii.java.api.Seminar2;

public class task2 {
    /**
     * 1)	Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {12, 6, 3, 5, 18, 9, 3, 10, 5};
        int res = countElem(arr);
        System.out.println(res);
    }

    /**
     *
     * @param array массив целых чисел
     * @return количество пар соседних элементов, где первый элемент больше второго в два раза
     */
    private static int countElem(int[] array) {
        int cnt = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] * 2 == array[i - 1]) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
