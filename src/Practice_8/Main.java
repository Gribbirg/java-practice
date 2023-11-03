package Practice_8;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a, b;

        // вывод чисел от A до B
        Messages.printExNum("3");
        System.out.print("От числа: ");
        a = scanner.nextInt();
        System.out.print("До числа: ");
        b = scanner.nextInt();
        printNumbers(a, b);
        Messages.waitMessage();

        // поиск чисел с нужной суммой цифр
        Messages.printExNum("4");
        System.out.print("Кол-во цифр: ");
        a = scanner.nextInt();
        System.out.print("Искомая сумма: ");
        b = scanner.nextInt();
        System.out.println(howMuchNumber((int) Math.pow(10, a - 1), b, a) + " чисел");
        Messages.waitMessage();

        // поиск суммы цифр
        Messages.printExNum("5");
        System.out.print("Число: ");
        a = scanner.nextInt();
        System.out.println("Сумма цифр: " + numsSum(a));
        Messages.waitMessage();

        // проверка на простоту
        Messages.printExNum("6");
        System.out.print("Число: ");
        a = scanner.nextInt();
        if (isEasy(a, a - 1)) System.out.println("Оно простое!");
        else System.out.println("Не простое...");

    }

    // задание 3
    private static void printNumbers(int a, int b) {
        System.out.println(a);
        if (a < b)
            printNumbers(a + 1, b);
        else if (a > b)
            printNumbers(a - 1, b);
    }

    // задание 4
    private static int howMuchNumber(int k, int d, int size) {
        if (k == Math.pow(10, size)) return 0;
        if (numsSum(k) == d) return 1 + howMuchNumber(k + 1, d, size);
        return howMuchNumber(k + 1, d, size);
    }

    // задание 5 (учавствует в 4)
    private static int numsSum(int x) {
        if (x == 0) return 0;
        return x % 10 + numsSum(x / 10);
    }

    // задание 6
    private static boolean isEasy(int x, int del) {
        if (del <= 1) return true;
        else if (x % del == 0) return false;
        return isEasy(x, del - 1);
    }
}

