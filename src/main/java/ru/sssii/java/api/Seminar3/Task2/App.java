package ru.sssii.java.api.Seminar3.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Определить стипендии студентов, фамилии которых заканчиваются на «ова», при четной сумме баллов.
 */
public class App {
    public static void main(String[] args) {
        Students students = new Students("Kazakov", 1032, 156000, 177);
        Students students1 = new Students("Petyhova", 1032, 10000, 180);
        Students students2 = new Students("Kazakova", 1285, 199000, 224);
        Students students3 = new Students("Kazak", 1134, 150000, 112);
        List<Students> studentsList = new ArrayList<>();
        studentsList.add(students);
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(students3);
        List<Integer> moneyStudy = new ArrayList<>();
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getSecondName().endsWith("ova")) {
                if (studentsList.get(i).getScore() % 2 == 0) {
                    moneyStudy.add(studentsList.get(i).getQuantityMoney());
                }
            }
        }
        System.out.println("moneyStudy = " + moneyStudy);
    }
}
