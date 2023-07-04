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
        Prod prod = new Prod("Мука высший", 143, "1-й сорт");
        Prod prod1 = new Prod("Греча высший", 190, "2-й сорт");
        Prod prod2 = new Prod("Мука", 100, "3-й сорт");
        Prod prod3 = new Prod("Рис высший", 151, "3-й сорт");
        List<Prod> prodList = new ArrayList<>();
        prodList.add(prod);
        prodList.add(prod1);
        prodList.add(prod2);
        prodList.add(prod3);
        System.out.println("searchMaxPrice(productList) = " + searchMaxPrice(prodList));


    }

    /**
     * @param list Коллекция товаров со значениями( имя, цена, сорт).
     * @return Возвращает наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
     */
    private static int searchMaxPrice(List<Prod> list) {
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
