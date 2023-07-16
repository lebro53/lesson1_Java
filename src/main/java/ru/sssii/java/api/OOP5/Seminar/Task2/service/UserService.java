package ru.sssii.java.api.OOP5.Seminar.Task2.service;

import ru.sssii.java.api.OOP5.Seminar.Task2.model.Student;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.Teacher;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.Type;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{
    private List<User> userList = new ArrayList<>();

    @Override
    public void create(String name, String surname, String patronymic, Type type) {
        int id = getFreeId(type);
        if(Type.STUDENT == type){
            Student student = new Student(name, surname, patronymic, id);
            userList.add(student);
        }
        if(Type.TEACHER == type){
            Teacher teacher = new Teacher(name, surname, patronymic, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if(user instanceof Teacher && !isStudent){
                lastId++;
            }
            if(user instanceof Student && isStudent){
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public List<User> readStudent() {
        List<User> studentsList = new ArrayList<>();
        for (User user : userList) {
            if(user instanceof Student){
                studentsList.add(user);
            }
        }
        return studentsList;
    }
}
