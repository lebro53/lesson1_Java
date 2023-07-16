package ru.sssii.java.api.OOP5.HomeWork.PhoneBook;

import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Controller.ControllerPB;
import ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model.TypePB;

public class App {
    public static void main(String[] args) {
        ControllerPB controllerPB = new ControllerPB();
        controllerPB.addPhoneContact("qwe", "ewq", 987987, "test");
        controllerPB.addPhoneContact("qwe", "ewq", 987987, "test");
        controllerPB.addPhoneContact("qwe", "ewq", 987987, "test");
        controllerPB.addPhoneContact("qwe", "ewq", 987987, "test");

        controllerPB.getAllContacts();
        controllerPB.getPBFormat();
        controllerPB.changePBFormat(TypePB.JSON);
        controllerPB.getPBFormat();
    }
}

