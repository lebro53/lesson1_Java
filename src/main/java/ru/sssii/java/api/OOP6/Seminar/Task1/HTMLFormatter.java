package ru.sssii.java.api.OOP6.Seminar.Task1;

import java.util.List;

public class HTMLFormatter implements Formatter{
    @Override
    public void getFOrmatter(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book + " была переведена в формат " + FormatBook.HTML);
        }
    }
}
