package ru.sssii.java.api.HomeWork4.Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("myList = " + myList);
//        res1(myList);
//        System.out.println("myList = " + myList);
//        System.out.println("res2(myList) = " + res2(myList));
//        System.out.println("res3(myList) = " + res3(myList));
        System.out.println("res4(myList) = " + res4(myList));
        System.out.println("res5(myList) = " + res5(myList));
        res6(myList);

    }

    /**
     *
     * @param myList Список, который необходимо перевернуть
     */
    private static void res6(LinkedList<Integer> myList) {
        for (int i = myList.size(); i > 0 ; i--) {
            int n = (myList.pop());
            System.out.print(n+ " ");
        }
    }

    /**
     *
     * @param myList Список, который необходимо перевернуть
     * @return Возвращает стэк
     */
    private static Stack<Integer> res5(LinkedList<Integer> myList) {
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < myList.size(); i++) {
            myStack.add(myList.get(i));
        }
        return myStack;
    }

    /**
     *
     * @param myList Список, который необходимо перевернуть
     * @return Возвращает перевернутый список
     */
    private static LinkedList<Integer> res4(LinkedList<Integer> myList) {
        for (int i = 0; i < myList.size() / 2; i++) {
            Integer temp = myList.get(i);
            myList.set(i, myList.get(myList.size() - i - 1));
            myList.set(myList.size() - i - 1, temp);
        }
        return myList;
    }

    /**
     *
     * @param myList Список, который необходимо перевернуть
     * @return Возвращает перевернутый список
     */
    private static LinkedList<Integer> res3(LinkedList<Integer> myList) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = myList.size() - 1; i >= 0; i--) {
            newList.add(myList.get(i));
        }
        return newList;
    }

    /**
     *
     * @param myList Список, который необходимо перевернуть
     * @return Возвращает перевернутый список
     */
    private static LinkedList<Integer> res2(LinkedList<Integer> myList) {
        LinkedList<Integer> newList = new LinkedList<>();
        for (int i = 0; i < myList.size(); i++) {
            newList.addFirst(myList.get(i));
        }
        return newList;
    }

    /**
     *
     * @param myList Список, который необходимо перевернуть
     * Возвращает перевернутый список
     */
    private static void res1(LinkedList<Integer> myList) {
        Collections.reverse(myList);
    }
}
