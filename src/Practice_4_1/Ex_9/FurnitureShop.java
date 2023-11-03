package Practice_4_1.Ex_9;

import ForAll.Messages;

import java.util.Scanner;

public class FurnitureShop {
    // каталог товаров
    private static final Furniture[] catalog = {
            new Sofa(60),
            new DoubleBeds(20),
            new ShoeMaker(1005)
    };

    public static void main(String[] args) {

        Messages.printExNum("9");

        Scanner scanner = new Scanner(System.in);
        int buy;

        // выбор товара
        System.out.println("Выберите товар:");
        for (int i = 0; i < catalog.length; i++) System.out.println(i + "-" + catalog[i]);
        buy = scanner.nextInt();

        // завершение покупки
        System.out.println("Выуспешно купили " + catalog[buy]);
    }
}
