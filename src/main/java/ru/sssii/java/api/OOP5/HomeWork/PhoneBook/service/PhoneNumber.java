package ru.sssii.java.api.OOP5.HomeWork.PhoneBook.service;

import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.PhoneBook;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.TypePB;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber implements PhoneNumberModificate {
    List<PhoneBook> phoneBookList = new ArrayList<>();

    @Override
    public void create(String name, String surname, Integer phoneNumber, String comment) {
        Integer number = getNumberContact();
        phoneBookList.add(new PhoneBook(name, surname, phoneNumber, number, comment, TypePB.TXT));
    }


    private int getNumberContact() {
        int cnt = 0;
        for (PhoneBook phoneBook : phoneBookList) {
            cnt++;
        }
        return ++cnt;
    }


    public List<PhoneBook> getPhoneBookList() {
        return phoneBookList;
    }
}
