package ru.sssii.java.api.HomeWork5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
//        LinkedList<String> listOfEmployees = new LinkedList<>();
        String listOfEmployees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] employees = listOfEmployees.split(" ");

        HashMap<String, Integer> cnt = countName(employees);

        LinkedHashMap<String, Integer> sortedMap = getSortedMap(cnt);

        for (Map.Entry<String, Integer> print : sortedMap.entrySet()) {
            System.out.println("Имя "+ print.getKey() + " встречается: " + print.getValue()+ " раз(а).");
        }

    }

    /**
     *
     * @param cnt Хэш-карта количества имен сотрудников
     * @return Отсортированная хэш-карта
     */
    private static LinkedHashMap<String, Integer> getSortedMap(HashMap<String, Integer> cnt) {
        ArrayList<Integer> sortedValue = new ArrayList<>();
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> item : cnt.entrySet()) {
            sortedValue.add(item.getValue());
        }
        Collections.sort(sortedValue, Collections.reverseOrder());
        for (int num: sortedValue) {
            for (Map.Entry<String, Integer> empty : cnt.entrySet()) {
                if(empty.getValue().equals(num)){
                    sortedMap.put(empty.getKey(), empty.getValue());
                }
            }
        }
        return sortedMap;
    }

    /**
     *
     * @param employees Масссив сотрудников предприятия
     * @return Хэш-карта количества имен сотрудников
     */
    private static HashMap<String, Integer> countName(String[] employees) {
        HashMap<String, Integer> cnt = new HashMap<>();
        for (int i = 0; i < employees.length; i+=2) {
            cnt.putIfAbsent(employees[i], 0);
            cnt.put(employees[i], cnt.get(employees[i])+1);
        }
        return cnt;
    }
}
