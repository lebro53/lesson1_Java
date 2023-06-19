package ru.sssii.java.api.Seminar4.Task1;

import java.util.LinkedList;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        Random random = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            myList.add(random.nextInt(10));
        }
        System.out.println("myList = " + myList);
        int sumPositive = getSumPositive(myList);
        System.out.println("sumPositive = " + sumPositive);
    }

    private static int getSumPositive(LinkedList<Integer> myList) {
        int sumPositive = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                sumPositive += myList.get(i);
            }
        }
        return sumPositive;
    }
}
//Построить однонаправленный список целых чисел. Найти сумму четных элементов списка.



