package ru.sssii.java.api.Exceptions.HomeWork2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            if(string.isEmpty()) throw new RuntimeException("You cannot enter an empty string");
        }catch (RuntimeException e){
            System.out.println("Catching exception: " + e);
        }

    }
}
