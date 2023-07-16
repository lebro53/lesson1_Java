package ru.sssii.java.api.OOP5.HomeWork.PhoneBook.service;

import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.PhoneBook;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.TypePB;

import java.util.List;

public interface DataService {
    void create(String name, String surname, Integer phoneNumber, String comment);
    List<PhoneBook> readPB();
    TypePB getFormat();
    void changeFormat(TypePB typePB);
}
