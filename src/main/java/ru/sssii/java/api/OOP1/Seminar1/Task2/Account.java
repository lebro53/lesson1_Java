package ru.sssii.java.api.OOP1.Seminar1.Task2;

public class Account {
    protected Integer numberAccount;
    protected String owner;
    protected Double balance;

    public Account(Integer numberAccount, String name, Double balance) {
        this.numberAccount = numberAccount;
        this.owner = name;
        this.balance = balance;
    }

    public Account() {
    }

    public Integer getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(Integer numberAccount) {
        this.numberAccount = numberAccount;
    }



    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount=" + numberAccount +
                ", name='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }

    protected void deposit(Double amount) {
        balance += amount;
    }

    protected void withDraw(Double amount){
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств. Остаток на балансе: " + balance);
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
