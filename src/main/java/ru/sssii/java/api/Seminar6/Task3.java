package ru.sssii.java.api.Seminar6;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> set1 = new ArrayList<>(Arrays.asList("qwe","asd","qwe","x"));
        ArrayList<String> set2 = new ArrayList<>(Arrays.asList("qwe","v", "x"));
        ArrayList<String> allSet = new ArrayList<>(set1);
        allSet.addAll(set2);
        Set<String> set3 = new HashSet<>(set1);
        set3.retainAll(set2);
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);
        for (String s : set3) {
            System.out.println(s + " = " + Collections.frequency(allSet, s));
        }

    }
}
