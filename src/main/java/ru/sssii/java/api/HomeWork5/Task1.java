package ru.sssii.java.api.HomeWork5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String word = "россия";
        HashMap<String, Integer> cntWord = countWord(text, word);
        for (Map.Entry<String, Integer> item : cntWord.entrySet()) {
            System.out.println("Слово " + item.getKey() + " встречается : " + item.getValue() + " раз(а)");
        }

    }

    /**
     *
     * @param text Исходный текст
     * @param word Искомое слово
     * @return Хэш-карта искомого слова с его количеством
     */
    private static HashMap<String, Integer> countWord(String text, String word) {
        HashMap<String, Integer> cntWord = new HashMap<>();
        cntWord.put(word, 0);
        int cnt = 0;
        text = text.replaceAll("\\pP", "").toLowerCase();
        System.out.println("text = " + text);
        String[] newText = text.split(" ");
        for (int i = 0; i < newText.length; i++) {
            if(newText[i].equals(word)){
                cnt++;
                cntWord.put(word, cnt);
            }
        }
        return cntWord;
    }
}
