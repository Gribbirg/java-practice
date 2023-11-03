package Practice_3.Ex_3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 3.1\n");

        Scanner scanner = new Scanner(System.in);

        // получение входных данных
        System.out.print("Введите стартовую валюту (Ruble, Dollar, Euro): ");
        String startCurrency = scanner.next();

        System.out.print("Введите конечную валюту (Ruble, Dollar, Euro): ");
        String finishCurrency = scanner.next();

        System.out.print("Введите кол-во денег: ");
        Double money = scanner.nextDouble();

        System.out.println();

        // перевод по курсу
        money = CurrencyConverter.convert(startCurrency, money, finishCurrency);

        // вывод результата
        if (money == null) {
            System.out.println("Произошла ошибка. Проверьте правильность введения названий валют!");
        } else {
            System.out.println("Результат: " + CurrencyConverter.getMoneyString(money, finishCurrency));
        }
    }
}
