package ru.sssii.java.api.OOP3.Seminar.Task3;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Answer imputValue(String value);

    GameStatus getGameStatus();

}
