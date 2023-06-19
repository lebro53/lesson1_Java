package ru.sssii.java.api.HomeWork4.Task2;

import java.util.HashMap;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println("isValid(s) = " + isValid(s));
    }

    /**
     *
     * @param s Строка состоящая из скобочек
     * @return Тру или фолс в зависимости от порядка расположения скобочек
     */
    public static boolean isValid(String s) {
        HashMap<Character, Character> symbol = new HashMap<>();
        symbol.put(')','(');
        symbol.put(']','[');
        symbol.put('}','{');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (!symbol.containsKey(n)) {
                stack.push(n);
            } else {
                Character top = stack.isEmpty() ? '?' : stack.pop();

                if (top != symbol.get(n)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}