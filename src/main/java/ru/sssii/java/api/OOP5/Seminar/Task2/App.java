package ru.sssii.java.api.OOP5.Seminar.Task2;

import ru.sssii.java.api.OOP5.Seminar.Task2.Controller.Controller;

public class App {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("qwe","ewq","qwerty");
        controller.createStudent("qwe","ewq","qwerty");
        controller.createStudent("qwe","ewq","qwerty");
        controller.createStudent("qwe","ewq","qwerty");
        controller.getAllStudents();
    }
}
