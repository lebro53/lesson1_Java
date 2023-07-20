package ru.sssii.java.api.OOP6.Seminar.Task1;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {
    List<Book> library;

    public Library(List<Book> library) {
        this.library = library;
    }

    public Library() {
    }

    @Override
    public List<Book> searchAuthorBook(String authorName) {
        List<Book> bookList = new ArrayList<>();
        for (Book book : library) {
            if(book.getAuthorBook().equals(authorName)) bookList.add(book);
        }
        return bookList;
    }

    public List<Book> getBookList() {
        return library;
    }

    public void setBookList(List<Book> library) {
        this.library = library;
    }
}
