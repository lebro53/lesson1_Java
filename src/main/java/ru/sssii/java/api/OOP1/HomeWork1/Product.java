package ru.sssii.java.api.OOP1.HomeWork1;

import java.util.List;

public class Product {
    private String nameProduct;
    private Integer price;
    private Integer rating;


    public Product(String nameProduct, Integer price, Integer rating) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
