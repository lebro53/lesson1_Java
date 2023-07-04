package ru.sssii.java.api.OOP1.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nameCategory;
    private List<Product> category;


    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
        this.category = new ArrayList<>();
    }

    public Category() {
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getCategory() {
        return category;
    }

    public void setCategory(List<Product> category) {
        this.category = category;
    }

    public void addProductCategory(Product product){
        category.add(product);
    }
}
