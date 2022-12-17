
package org.example;

import java.util.*;

//2. Сведения о товаре состоят из наименования, страны-производителя,
// веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой.
public class MainTask2 {

    public static void main(String[] args) {
        Task2();

    }

    public static void Task2() {
        GoodsTask2 goods1 = new GoodsTask2("мука", "Россия", 125.00, 3.50, "second");
        GoodsTask2 goods2 = new GoodsTask2("рис", "Китай", 1250.00, 50.50, "second");
        GoodsTask2 goods3 = new GoodsTask2("спички", "Беларусь", 100.00, 11.50, "second");
        GoodsTask2 goods4 = new GoodsTask2("вино", "Молдова", 1250.00, 5000.50, "first");
        GoodsTask2 goods5 = new GoodsTask2("авто", "Германия", 125000.00, 400.50, "first");
        GoodsTask2 goods6 = new GoodsTask2("смартфоны", "США", 3000.00, 2.50, "first");

        List<GoodsTask2> listGoods = new ArrayList<>();

        listGoods.add(goods1);
        listGoods.add(goods2);
        listGoods.add(goods3);
        listGoods.add(goods4);
        listGoods.add(goods5);
        listGoods.add(goods6);

        String search = "second";

        double min = goods5.getPrices();
        String productName = null;
        String varietiesName = null;
        for (GoodsTask2 goods : listGoods) {
            if (goods.getPrices() < min && goods.getVarieties().equals(search)) {
                min = goods.getPrices();
            }
            for (double i = 0.0; i <= goods.getPrices(); i++)
                if (goods.getPrices() == min && goods.getVarieties().equals(search)) {
                    productName = goods.getProduct_name();
                    varietiesName = goods.getVarieties();
                }
        }
        System.out.println(" Цена товара |" + productName + "| заданного сорта |" + varietiesName +
                "|\n  является самой наименьшей = " + min);
    }
}
