package ru.sssii.java.api.Exceptions.HomeWork3;

import java.util.Set;

public class MyIsEmptyException extends IllegalArgumentException{
    public MyIsEmptyException(Set list) {
        super("Ошибка! Не удалось распознать данные: " + list.toString().replaceAll("^\\[|\\]$", ""));
    }
}
