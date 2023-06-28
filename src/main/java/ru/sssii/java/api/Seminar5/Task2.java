package ru.sssii.java.api.Seminar5;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,5};
        Boolean flag = false;
        HashMap<Integer, Integer> searchDouble = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            searchDouble.putIfAbsent(arr[i], 0);
            searchDouble.put(arr[i], searchDouble.get(arr[i])+1);
            if (searchDouble.get(arr[i])>1){
                flag = true;
            }
        }
        for (Map.Entry<Integer, Integer> item : searchDouble.entrySet()) {
            System.out.println("Key = " + item.getKey() + " Value = " + item.getValue());
        }
        if (flag== false){
            System.out.println("Дубликатов не обнаружено");
        } else {
            System.out.println("Дубликаты обнаружены");

        }

    }
}
