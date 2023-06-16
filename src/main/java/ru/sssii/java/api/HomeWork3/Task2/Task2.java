package ru.sssii.java.api.HomeWork3.Task2;

import ru.sssii.java.api.Seminar3.Task1.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    /**
     * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a quantity positions: ");
        int pos = sc.nextInt();
        List<Product> productList = createArray(pos, sc);
        System.out.println("Enter search variety: ");
        String searchVariety = sc.next();
        System.out.println("productList = " + productList);
        System.out.println("searchProduct(productList, searchVariety) = " + searchProduct(productList, searchVariety));
    }

    private static List<String> searchProduct(List<Product> prodList, String srchVariety) {
        List<String> searchList = new ArrayList<>();

        int minPrice = prodList.get(0).getPrice();;
        for (int i = 0; i < prodList.size(); i++) {
            if(minPrice>=prodList.get(i).getPrice()){
                minPrice = prodList.get(i).getPrice();
            }
        }
        for (int i = 0; i < prodList.size(); i++) {
            if(prodList.get(i).getVariety().equals(srchVariety) && prodList.get(i).getPrice()==minPrice){
                searchList.add(prodList.get(i).getName());
            }
        }
        return searchList;
    }

    private static List<Product> createArray(int pos, Scanner cs) {
        List<Product> positionlist = new ArrayList<>();
        for (int i = 0; i < pos; i++) {
            System.out.println("Enter name product: ");
            String name = cs.next();
            System.out.println("Enter product country: ");
            String country = cs.next();
            System.out.println("Enter weight product: ");
            Integer weight = cs.nextInt();
            System.out.println("Enter price product: ");
            Integer price = cs.nextInt();
            System.out.println("Enter variety product: ");
            String variety = cs.next();
            Product product = new Product(name, country, weight, price, variety);
            positionlist.add(product);
        }
        return positionlist;


    }
}
