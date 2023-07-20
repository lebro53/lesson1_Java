package ru.sssii.java.api.OOP6.Seminar.Task1;

public class ElectronBook extends Book{
    String format;
    Integer size;


    public ElectronBook(String nameBook, String authorBook, Integer age, BookGener bookGener, String format, Integer size) {
        super(nameBook, authorBook, age, bookGener);
        this.format = format;
        this.size = size;
    }
}
