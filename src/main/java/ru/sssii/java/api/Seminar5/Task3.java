package ru.sssii.java.api.Seminar5;

import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<Character, Integer> converterNumbers = new HashMap<>();
        converterNumbers.put('I', 1);
        converterNumbers.put('V', 5);
        converterNumbers.put('X', 10);
        converterNumbers.put('L', 50);
        converterNumbers.put('C', 100);
        converterNumbers.put('D', 500);
        converterNumbers.put('M', 1000);
        String arabicNumber = "MDCIX";
        int res = converterNumbers.get(arabicNumber.charAt(arabicNumber.length() - 1));
        for (int i = 0; i < arabicNumber.length() - 1; i++) {
            if (converterNumbers.get(arabicNumber.charAt(i)) < converterNumbers.get(arabicNumber.charAt(i + 1))) {
                res -= converterNumbers.get(arabicNumber.charAt(i));
            } else {
                res += converterNumbers.get(arabicNumber.charAt(i));
            }
        }
        System.out.println("res = " + res);
    }
}
