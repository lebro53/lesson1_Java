package ru.sssii.java.api.OOP1.HomeWork1;

import java.util.List;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
    public void printBasket(){
        System.out.println(login + " Покупки:");
        List<Product> userBasket = basket.getProducts();
        for (Product product: userBasket) {
            System.out.println("- " + product.getNameProduct() + " - " + product.getPrice() + " - " + product.getRating() + " -");
        }
    }
}
