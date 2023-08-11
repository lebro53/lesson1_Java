package ru.sssii.java.api.Exceptions.HomeWork3;

public class MyNumberException extends IllegalArgumentException  {
    public MyNumberException(String numberPhone) {
        super("Ошибка! Не правильно указан номер телефона: " + numberPhone);
    }
}
