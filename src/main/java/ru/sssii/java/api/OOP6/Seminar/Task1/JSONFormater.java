package ru.sssii.java.api.OOP6.Seminar.Task1;

import java.util.List;

public class JSONFormater implements Formatter{

    @Override
    public void getFOrmatter(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book + " была переведена в формат " + FormatBook.JSON);
        }
    }
}
