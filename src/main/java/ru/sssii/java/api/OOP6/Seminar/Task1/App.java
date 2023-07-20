package ru.sssii.java.api.OOP6.Seminar.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Book book = new Book("name", "asd", 12, new BookGener("zxc"));
        Book book2 = new Book("name1", "asd", 123, new BookGener("zxc"));
        Book book3 = new Book("name2", "asdf", 123, new BookGener("zxcv"));
        List<Book> bookList = new ArrayList<>(Arrays.asList(book, book2, book3));
        Library library = new Library(bookList);
        System.out.println("library.searchAuthorBook(\"zxc\") = " + library.searchAuthorBook("asd"));

        Formatter formatter = new JSONFormater();
        formatter.getFOrmatter(library.getBookList());
    }
}
