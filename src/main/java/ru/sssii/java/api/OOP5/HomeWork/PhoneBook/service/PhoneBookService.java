package ru.sssii.java.api.OOP5.HomeWork.PhoneBook.service;

import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.PhoneBook;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.TypePB;

import java.util.List;

public class PhoneBookService implements DataService {
    PhoneNumber phoneNumber;

    @Override
    public List<PhoneBook> readPB() {
        return phoneNumber.getPhoneBookList();
    }

    @Override
    public TypePB getFormat() {
        if (!phoneNumber.getPhoneBookList().isEmpty()) {
            return phoneNumber.getPhoneBookList().get(0).getTypePB();
        } else return TypePB.TXT;

    }

    @Override
    public void changeFormat(TypePB typePB) {
        for (PhoneBook phoneBook : phoneNumber.getPhoneBookList()) {
            phoneBook.setTypePB(typePB);
        }
    }


}
