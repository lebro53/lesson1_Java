package ru.sssii.java.api.OOP1.HomeWork1;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Food");
        category1.addProductCategory(new Product("Bread", 15, 5));
        category1.addProductCategory(new Product("Salt", 5, 5));
        category1.addProductCategory(new Product("Banana", 23, 4));
        Category category2 = new Category("Cloth");
        category2.addProductCategory(new Product("Shirt", 150, 3));
        category2.addProductCategory(new Product("Shorts", 115, 4));
        category2.addProductCategory(new Product("Sandals", 98, 5));
        Shop shop = new Shop();
        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.printCatalog();
        User user1 = new User("Artem", "123");
        User user2 = new User("Katya", "321");
        user1.getBasket().addProductBasket(category1.getCategory().get(0));


        user2.getBasket().addProductBasket(category1.getCategory().get(1));
        user2.getBasket().addProductBasket(category2.getCategory().get(2));

        category1.getCategory().remove(0);
        category2.getCategory().remove(2);
        category2.getCategory().remove(1);

        System.out.println();
        user1.printBasket();
        System.out.println();
        user2.printBasket();
        System.out.println();
        shop.printCatalog();



    }
}
