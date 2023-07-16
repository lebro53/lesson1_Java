package ru.sssii.java.api.OOP5.Seminar.Task2.service;

import ru.sssii.java.api.OOP5.Seminar.Task2.model.Type;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patronymic, Type type);
    List<User> read();

    List<User> readStudent();
}
