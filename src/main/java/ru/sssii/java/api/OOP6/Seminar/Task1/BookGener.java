package ru.sssii.java.api.OOP6.Seminar.Task1;

public class BookGener implements Ganre{
    String genre;

    public BookGener(String genre) {
        this.genre = genre;
    }

    @Override
    public String getGener() {
        return genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "BookGener{" +
                "genre='" + genre + '\'' +
                '}';
    }
}
