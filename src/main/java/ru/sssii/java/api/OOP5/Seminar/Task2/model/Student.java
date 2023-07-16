package ru.sssii.java.api.OOP5.Seminar.Task2.model;

public class Student extends User{
    Integer studentID;

    public Student(String name, String surname, String patronymic, Integer studentId) {
        super(name, surname, patronymic);
        this.studentID = studentId;
    }

    public Student() {
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
