package ru.sssii.java.api.Seminar3.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    /**
     * Найти страны, ко	торые экспортируют данный(введенный с кл-ы) товар, и общий объем его экспорта.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity countries: ");
        int n = sc.nextInt();
        List<Item> itemList = createList(n, sc);
        System.out.println("itemList = " + itemList);
        System.out.println("Enter search: ");
        String searchName = sc.next();
        int sum = sumVolume(itemList, sc, searchName);
        List<String> country = searchCountry(itemList, sc, searchName);
        System.out.println("sum = " + sum);
        System.out.println("country = " + country);

    }

    private static List<String> searchCountry(List<Item> list, Scanner sc, String search) {
        List<String> countryList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(search)) {
                countryList.add(list.get(i).getCountry());
            }
        }
        return countryList;
    }

    private static int sumVolume(List<Item> list, Scanner cs, String search) {
        Integer sumVolume = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(search)) {
                sumVolume += list.get(i).getVolume();
            }
        }
        return sumVolume;
    }

    private static List<Item> createList(int quantity, Scanner cs) {
        List<Item> resultList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.println("name:");
            String name = cs.next();
            System.out.println("volume:");
            Integer volume = cs.nextInt();
            System.out.println("country:");
            String country = cs.next();
            Item item = new Item(name, volume,country);
            resultList.add(item);
        }
        return resultList;
    }

}
