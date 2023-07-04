package ru.sssii.java.api.OOP1.Seminar1.Task2;

public class Saving extends Account {
    public Double percent;

    public Saving(Integer numberAccount, String name, Double balance, Double percent) {
        super(numberAccount, name, balance);
        this.percent = percent;
    }

    public Saving() {
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public void addInterest() {
        Double res = getBalance() * percent / 100;
        super.deposit(res);
    }

}
