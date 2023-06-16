package ru.sssii.java.api.HomeWork3.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    /**
     * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     *
     * @param args
     */
    public static void main(String[] args) {
        Product product = new Product("Мука высший", 143, "1-й сорт");
        Product product1 = new Product("Греча высший", 190, "2-й сорт");
        Product product2 = new Product("Мука", 100, "3-й сорт");
        Product product3 = new Product("Рис высший", 151, "3-й сорт");
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        System.out.println("searchMaxPrice(productList) = " + searchMaxPrice(productList));


    }

    /**
     *
     * @param list Коллекция товаров со значениями( имя, цена, сорт).
     * @return Возвращает наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     */
    private static int searchMaxPrice(List<Product> list) {
        int price = list.get(0).getPrice();
        int maxPrice = price;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().endsWith("высший") &&
                    (list.get(i).getVariety().startsWith("1") ||
                            list.get(i).getVariety().startsWith("2"))) {
                if (price < list.get(i).getPrice()) {
                    maxPrice = list.get(i).getPrice();
                }
            }
        }
        return maxPrice;
    }
}
