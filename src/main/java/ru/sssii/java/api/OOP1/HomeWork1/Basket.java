package ru.sssii.java.api.OOP1.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> products;

    public Basket() {
        this.products = new ArrayList<>();
    }



    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProductBasket(Product product) {
        products.add(product);
    }

    public void deleteProductBasket(Product product) {
        products.remove(product);
    }
}
