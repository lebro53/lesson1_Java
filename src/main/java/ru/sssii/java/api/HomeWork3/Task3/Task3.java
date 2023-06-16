package ru.sssii.java.api.HomeWork3.Task3;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 1000, 1927, 1270);
        Book book2 = new Book("Черный обелиск", "Ремарк", 500, 1983, 432);
        Book book3 = new Book("О дивный новый мир", "Хаксли", 273, 1987, 365);
        Book book4 = new Book("Как стать блогером", "Блогерова", 1999, 2017, 5);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        String letter = "а";
        Integer years = 2010;
        System.out.println("searchNameBook(bookList, letter, years) = " + searchNameBook(bookList, letter, years));

        //  Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
    }

    private static List<String> searchNameBook(List<Book> bookList, String letter, Integer years) {
        List<String> nameBookList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (primeTest(bookList.get(i).getQuantityPaper()) &&
                    bookList.get(i).getSecondName().toLowerCase().contains("а") &&
                    bookList.get(i).getBookYear() >= years){
                nameBookList.add(bookList.get(i).getNameBook());
            }

        }
        return nameBookList;
    }

    private static boolean primeTest(Integer quantityPaper) {
        if (quantityPaper <= 1) {
            return false;
        }
        if (quantityPaper == 2 || quantityPaper == 3) {
            return true;
        }
        if (quantityPaper % 2 == 0 || quantityPaper % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= sqrt(quantityPaper); i = i + 6) {
            if (quantityPaper % i == 0 || quantityPaper % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
