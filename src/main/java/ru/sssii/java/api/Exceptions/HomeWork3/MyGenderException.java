package ru.sssii.java.api.Exceptions.HomeWork3;

public class MyGenderException extends IllegalArgumentException{
    public MyGenderException(String maleOrFamale) {
        super("Ошибка! Не правильно указан пол: " + maleOrFamale);
    }
}
