package ru.sssii.java.api.OOP1.HomeWork1;

import ru.sssii.java.api.HomeWork3.Task1.Prod;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Category> shop;

    public Shop() {
        this.shop = new ArrayList<>();
    }

    public List<Category> getShop() {
        return shop;
    }

    public void setShop(List<Category> shop) {
        this.shop = shop;
    }


    public void addCategory(Category category){
        shop.add(category);
    }

    public void printCatalog(){
        for (Category category: shop) {
            System.out.println(category.getNameCategory());
            List<Product> products =  category.getCategory();
            for (Product product: products) {
                System.out.println("- " + product.getNameProduct() + " - " + product.getPrice() + " - " + product.getRating() + " -");
            }

        }
    }

}
