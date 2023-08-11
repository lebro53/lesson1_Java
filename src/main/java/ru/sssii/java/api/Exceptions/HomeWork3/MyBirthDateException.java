package ru.sssii.java.api.Exceptions.HomeWork3;

public class MyBirthDateException extends IllegalArgumentException{
    public MyBirthDateException(String dateBirt) {
        super("Ошибка! Не правильно указана дата рождения: " + dateBirt);
    }
}