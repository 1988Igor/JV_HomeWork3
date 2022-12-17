
package org.example;


import java.util.*;

//Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
// название которых содержит «высший».
public class MainTask1 {

    public static void main(String[] args) {
        Task1();

    }

    public static void Task1() {
        Goods goods1 = new Goods("мука", 10.0, "первый");
        Goods goods2 = new Goods("высшый сорт", 8.50, "второй");
        Goods goods3 = new Goods("высшый материал", 11.50, "первый");
        Goods goods4 = new Goods("мед", 9.50, "второй");
        Goods goods5 = new Goods("спички", 10.50, "первый");
        Goods goods6 = new Goods("очки", 18.50, "first");


        List<Goods> listGoods = new ArrayList<>();

        listGoods.add(goods1);
        listGoods.add(goods2);
        listGoods.add(goods3);
        listGoods.add(goods4);
        listGoods.add(goods5);
        listGoods.add(goods6);


        String search = "высшый";
        String search1 = "первый";
        String search2 = "второй";


        double max = 0.00;
        for (Goods goods : listGoods) {
            if ((goods.getName().contains("высшый")) && goods.getVariety().equals(search1) || goods.getVariety().equals(search2))


                for (double i = 0; i < goods.getPrice(); i++) {

                    if (goods.getPrice() > max)
                        max = goods.getPrice();
                }

        }
        System.out.println("Максимальная цена товаров 1го или 2го сорта среди товаров,\n" +
                "название которых содержит «высший», состовляет: " + max);

    }
}