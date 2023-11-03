package Practice_1;

import java.util.Scanner;

public abstract class Ex7 {
    // вычисление факториала числа
    public static void factorial() {

        System.out.println("\n\nЗадание 7\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int current = 1;

        for (int i = 1; i <= number; i++) current *= i;

        System.out.println("\nФакториал: " + current + "\n");

        int checkAnswer = factorialCheck(number);
        System.out.println("Результат работы проверочного метода из учебного пособия: " + checkAnswer);

        System.out.print("Согласно проверке, метод работает ");
        if (checkAnswer == current) System.out.println("верно");
        else System.out.println("неверно");
    }

    // метод для проверки, описан в методичке
    private static int factorialCheck(int number) {

        if (number == 0) return 1;
        else return (number * factorialCheck(number - 1));

    }
}
