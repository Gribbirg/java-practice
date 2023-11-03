package Practice_4.Ex_3;

import ForAll.Messages;
import Practice_4.Ex_3.Authentication.Authentication;
import Practice_4.Ex_3.Catalog.Catalog;
import Practice_4.Ex_3.Catalog.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class Magazine {
    public static void main(String[] args) {

        Messages.printExNum("4.3");

        Scanner scanner = new Scanner(System.in);
        boolean auth;

        auth = auth(scanner);
        while (!auth) {
            System.out.println("Ошибка. Проверьте данные!");
            System.out.println();
            auth = auth(scanner);
        }
        System.out.println("Успешный вход!");
        System.out.println();

        int num;
        double price;
        Product[] products;
        ArrayList<Product> basket = new ArrayList<>();
        while (true) {
            System.out.println("Выберите категорию: ");
            System.out.println("0 - выход из программы");
            for (int i = 0; i < Catalog.values().length; i++) {
                System.out.println((i + 1) + " - " + Catalog.values()[i].name);
            }
            System.out.print("Выбранная категория: ");
            num = scanner.nextInt();
            System.out.println();

            if (num == 0) break;

            products = Catalog.values()[num - 1].getProducts();
            num = printProducts(scanner, products);
            System.out.println();
            if (num == 0) continue;
            basket.add(products[num - 1]);

            System.out.println("Текущая корзина:");
            for (Product product : basket) System.out.println(product);
            System.out.println();

            System.out.println("Выберите действие: ");
            System.out.println("0 - выход из программы");
            System.out.println("1 - очистить корзину");
            System.out.println("2 - купить корзину");
            System.out.println("3 - продолжить покупки");
            System.out.print("Выбранное действие: ");
            num = scanner.nextInt();
            System.out.println();

            switch (num) {
                case 0 -> {
                    System.out.println("Выход");
                    return;
                }
                case 1 -> {
                    basket.clear();
                    System.out.println("Корзина пуста");
                    System.out.println();
                }
                case 2 -> {
                    price = 0;
                    for (Product product : basket) price += product.price;
                    System.out.println("Вы уверены, что хотите купить товары за " + Messages.getPriceRubles(price) + '?');
                    System.out.print("1 - да, 0 - нет: ");
                    num = scanner.nextInt();
                    System.out.println();
                    if (num == 1) {
                        System.out.println("Вы успешно купили " + basket.size() + " товаров за " + Messages.getPriceRubles(price));
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("Выход");
    }

    private static boolean auth(Scanner scanner) {
        System.out.println("Войдите в учётную запись:");
        System.out.print("Введите логин: ");
        String login = scanner.next();
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        System.out.println();
        return Authentication.check(login, password);
    }

    private static int printProducts(Scanner scanner, Product[] products) {
        System.out.println("Список товаров:");
        System.out.println("0 - возврат");
        for (int i = 0; i < products.length; i++) System.out.println((i + 1) + ": " + products[i]);
        System.out.print("Введите номер товара или выход: ");
        return scanner.nextInt();
    }
}
