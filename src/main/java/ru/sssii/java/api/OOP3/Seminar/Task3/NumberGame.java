package ru.sssii.java.api.OOP3.Seminar.Task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }

    @Override
    void playGame(Log log) throws IOException {
        Scanner scanner = new Scanner(System.in);
        NumberGame numberGame = new NumberGame();
        System.out.println("Введите длину слова: ");
        int sizeWord = scanner.nextInt();
        System.out.println("Введите количество попыток: ");
        int maxTry = scanner.nextInt();
        scanner.nextLine();
        numberGame.start(sizeWord, maxTry);
        while (numberGame.getGameStatus().equals(GameStatus.START)) {
            System.out.println("Введите ваш вариант: ");
            String value = scanner.nextLine();
            Answer answer = numberGame.imputValue(value);
            log.addLogMove(value);
            if (answer != null) {
                System.out.println("Вы нашли: быки: " + answer.bull + " коровы: " + answer.cow + ". Количество попыток: " + answer.numTry);
            }
        }
    }
}
