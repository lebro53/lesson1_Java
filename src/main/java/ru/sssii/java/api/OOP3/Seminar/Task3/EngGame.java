package ru.sssii.java.api.OOP3.Seminar.Task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }

    @Override
    void playGame(Log log) throws IOException {
        Scanner scanner = new Scanner(System.in);
        EngGame engGame = new EngGame();
        System.out.println("Введите длину слова: ");
        int sizeWord = scanner.nextInt();
        System.out.println("Введите количество попыток: ");
        int maxTry = scanner.nextInt();
        scanner.nextLine();
        engGame.start(sizeWord, maxTry);
        while (engGame.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Введите ваш вариант: ");
            String value = scanner.nextLine().toLowerCase();
            Answer answer = engGame.imputValue(value);
            log.addLogMove(value);
            if (answer != null) {
                System.out.println("Вы нашли: быки: " + answer.bull + " коровы: " + answer.cow + ". Количество попыток: " + answer.numTry);
            }
        }
    }
}
