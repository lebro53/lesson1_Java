package ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Controller;

import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.PhoneBook;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.TypePB;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.service.PhoneBookService;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.service.PhoneNumber;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.view.PBView;

import java.util.ArrayList;
import java.util.List;

public class ControllerPB {
    private final PhoneBookService phoneBookService = new PhoneBookService();
    private final PBView pbView = new PBView();
    private final PhoneNumber phoneNumberCreate = new PhoneNumber();
    public void addPhoneContact(String name, String surname, Integer phoneNumber, String comment){
        phoneNumberCreate.create(name, surname, phoneNumber, comment);
    }
    public void getAllContacts(){
        List<PhoneBook> phoneBookList = phoneBookService.readPB();
        for (PhoneBook phoneBook : phoneBookList) {
            pbView.printConsolePB(phoneBook);
        }

    }

    public void changePBFormat(TypePB typePB){
        phoneBookService.changeFormat(typePB);
    }


    public void getPBFormat(){
        System.out.println("phoneBookService.getFormat() = " + phoneBookService.getFormat());
    }
}
