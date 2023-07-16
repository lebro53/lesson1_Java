package ru.sssii.java.api.OOP5.HomeWork.PhoneBook.Model;

public class PhoneBook {
    Integer numberContact;
    String name;
    String surname;
    Integer phoneNumber;
    String comment;
    TypePB typePB;

    public PhoneBook(String name, String surname, Integer phoneNumber, Integer numberContact, String comment, TypePB typePB) {
        this.numberContact = numberContact;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.typePB = typePB;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getNumberContact() {
        return numberContact;
    }

    public void setNumberContact(Integer numberContact) {
        this.numberContact = numberContact;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TypePB getTypePB() {
        return typePB;
    }

    public void setTypePB(TypePB typePB) {
        this.typePB = typePB;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "numberContact=" + numberContact +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", comment='" + comment + '\'' +
                '}';
    }
}
