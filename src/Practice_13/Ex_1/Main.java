package Practice_13.Ex_1;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("1");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");

        stringWork(scanner.nextLine());

    }

    private static void stringWork(String string) {
        System.out.println();
        System.out.println("Работаем со строкой: " + string);
        System.out.println("Последний символ: " + string.charAt(string.length() - 1));
        System.out.println("Проверка на окончание на !!!: " + string.endsWith("!!!"));
        System.out.println("Проверка на старт с I like: " + string.startsWith("I like"));
        System.out.println("Проверка на наличие Java: " + string.contains("Java"));
        if (string.contains("Java")) {
            System.out.println("Координаты Java: " + string.indexOf("Java"));
            System.out.println("Вырезание Java: " + string.substring(string.indexOf("Java"), string.indexOf("Java") + 4));
        }
        System.out.println("Замена а на о: " + string.replaceAll("a", "o"));
        System.out.println("Верхний регистр: " + string.toUpperCase());
        System.out.println("Нижний регистр: " + string.toLowerCase());
    }
}
