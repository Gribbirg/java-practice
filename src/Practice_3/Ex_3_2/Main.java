package Practice_3.Ex_3_2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 3.2\n");

        // создание магазина
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop(new Product[]{
                new Product("Процессор", 15000, 5),
                new Product("Корпус", 1500, 100),
                new Product("Видеокарта", 30000, 3),
                new Product("Монитор", 10000, 8)
        });

        String enter;
        int count;
        double price;
        Product product;

        // выбор валюты пользователем
        System.out.print("Введите желаемую валюту (Ruble, Dollar, Euro): ");
        String currency = scanner.nextLine();

        // покупки
        while (true) {
            printCatalog(shop, currency);
            System.out.print("\nВведите название товара или \"выход\" для выхода: ");
            enter = scanner.next();

            if (enter.equals("выход")) {
                System.out.println("Выход из магазина");
                return;
            } else {
                // обработка названия товара
                product = shop.getProduct(enter);
                if (product == null) System.out.println("Неправильное название товара!");
                else {
                    // обработка кол-ва товара
                    System.out.print("Введите желаемое кол-во товара: ");
                    count = scanner.nextInt();

                    if (product.count < count) System.out.println("В наличии нету столько товара!");
                    else {
                        // подтверждение покупки
                        price = count * product.getCoast();
                        System.out.print("Вы уверены, что хотите купить товар за " +
                                CurrencyConverter.getMoneyString(CurrencyConverter.convert("Ruble", price, currency), currency) +
                                " (да/нет)? ");
                        enter = scanner.next();
                        if (enter.equals("да")) {
                            // покупка
                            shop.buyProduct(product.getName(), count);
                            System.out.println("Вы успешно купили " + count + "шт товара " + product.getName() + " за " + CurrencyConverter.getMoneyString(CurrencyConverter.convert("Ruble", price, currency), currency));
                        } else System.out.println("Отмена покупки");
                    }
                }
            }
            System.out.println();
        }
    }

    // вывод каталога товаров
    private static void printCatalog(Shop shop, String currency) {
        System.out.println("Каталог:");
        for (Product product : shop.getCatalog()) {
            System.out.printf("%-25s", "Название: " + product.getName());
            System.out.printf("%-22s", "цена: " + CurrencyConverter.getMoneyString(CurrencyConverter.convert("Ruble", product.getCoast(), currency), currency));
            System.out.println("кол-во в наличии: " + product.count);
        }
    }
}
