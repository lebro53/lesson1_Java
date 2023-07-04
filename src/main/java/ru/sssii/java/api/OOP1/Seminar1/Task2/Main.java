package ru.sssii.java.api.OOP1.Seminar1.Task2;

public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit(1, "Kozyrin", 1000.0, 90.0);
        Saving save = new Saving(1, "Kozyrin", 1000.0, 2.0);
        System.out.println(save.getBalance());
        save.addInterest();
        System.out.println(save.getBalance());
        System.out.println(credit.getBalance());
        credit.calculateInterest();
        System.out.println(credit.getBalance());
    }
}
