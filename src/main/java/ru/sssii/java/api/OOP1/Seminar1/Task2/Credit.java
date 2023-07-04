package ru.sssii.java.api.OOP1.Seminar1.Task2;

public class Credit extends Account {
    private Double percent;

    public Credit(Integer numberAccount, String name, Double balance, Double percent) {
        super(numberAccount, name, balance);
        this.percent = percent;
    }

    public Credit() {
    }


    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public void calculateInterest(){
        Double res = getBalance() * percent / 100;
        super.withDraw(res);
    }
}
