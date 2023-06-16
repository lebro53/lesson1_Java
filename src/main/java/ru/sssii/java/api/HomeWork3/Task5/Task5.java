package ru.sssii.java.api.HomeWork3.Task5;

import java.util.ArrayList;

public class Task5 {
    //при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
    //Пример входных данных:
    //[1,2,3]
    //Пример выходных данных:
    //[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        shake(a, b);
    }

    public static void shake(ArrayList<Integer> prefix, ArrayList<Integer> value) {
        if (value.size() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < value.size(); i++) {
                ArrayList<Integer> a = new ArrayList<>();
                a.addAll(prefix);
                a.add(value.get(i));

                ArrayList<Integer> b = new ArrayList<>();

                b.addAll(value.subList(0, i));
                b.addAll(value.subList(i + 1, value.size()));

                shake(a, b);
            }
        }
    }
}
