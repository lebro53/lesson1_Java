package ru.sssii.java.api.OOP5.Seminar.Task2.Controller;

import ru.sssii.java.api.OOP5.Seminar.Task2.View.StudentView;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.Student;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.Type;
import ru.sssii.java.api.OOP5.Seminar.Task2.model.User;
import ru.sssii.java.api.OOP5.Seminar.Task2.service.UserService;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String name, String surname, String patronymic){
        userService.create(name, surname, patronymic, Type.STUDENT);
    }

    public void getAllStudents(){
        List<User> studentList = userService.readStudent();
        for (User user : studentList) {
            Student student = ((Student) user);
            studentView.printConsoleStudent(student);
        }
    }
}
