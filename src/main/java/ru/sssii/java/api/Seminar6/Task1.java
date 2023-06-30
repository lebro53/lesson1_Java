package ru.sssii.java.api.Seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,6));
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        int res = uniqueNumbers.size()*100/numbers.size();
        System.out.println("res = " + res);
    }
}
