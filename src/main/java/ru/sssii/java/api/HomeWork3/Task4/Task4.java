package ru.sssii.java.api.HomeWork3.Task4;

import java.util.*;

import static java.lang.Math.abs;
import static java.util.Collections.max;
import static java.util.Collections.min;

public class Task4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        List<Integer> arrayList = generateRandomArrayList(sizeArray);
        System.out.println("arrayList = " + arrayList);
        Collections.sort(arrayList);
        System.out.println("arrayList = " + arrayList);
        int maxNumber = max(arrayList);
        int minNumber = min(arrayList);
        int avgNumber = averageNumber(arrayList, maxNumber, minNumber);
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("minNumber = " + minNumber);
        System.out.println("avgNumber = " + avgNumber);


    }

    /**
     * @param arrayList Коллекция целых чисел
     * @param maxN      Максимальное число коллекции
     * @param minN      Минимальное число колекции
     * @return Среднее число коллекции
     */
    private static int averageNumber(List<Integer> arrayList, int maxN, int minN) {
        int medianaMX = (maxN + minN) / 2;
        int indexAverageNumber = 0;
        List<Integer> mediana = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            mediana.add(abs(medianaMX - arrayList.get(i)));
        }
        int minMediana = min(mediana);
        for (int i = 0; i < mediana.size(); i++) {
            if (minMediana == abs(arrayList.get(i) - medianaMX)) {
                indexAverageNumber = i;
            }
        }
        return arrayList.get(indexAverageNumber);
    }

    /**
     * @param size Длина создаваемой коллекции
     * @return Коллекцию чисел
     */
    private static List<Integer> generateRandomArrayList(int size) {
        List<Integer> arratList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arratList.add(random.nextInt(100));
        }
        return arratList;
    }
}
