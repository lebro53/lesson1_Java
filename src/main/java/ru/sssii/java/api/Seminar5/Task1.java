package ru.sssii.java.api.Seminar5;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "aaabccccdeefgggg ";
        HashMap<Character, Integer> cntString = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            cntString.putIfAbsent(text.charAt(i), 0);
            cntString.put(text.charAt(i), cntString.get(text.charAt(i))+1);
//            if (!cntString.containsKey(text.charAt(i))){
//                cntString.put(text.charAt(i), 1);
//            } else{
//                Integer cnt = cntString.get(text.charAt(i)) +1;
//                cntString.put(text.charAt(i), cnt);
//            }
        }
        for (Map.Entry<Character, Integer> value : cntString.entrySet()) {
            System.out.println(value.getKey()+ "=" + value.getValue());
        }
    }
}
