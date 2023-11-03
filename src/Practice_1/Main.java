package Practice_1;

import java.text.NumberFormat;
import java.util.Scanner;
import ForAll.Messages;

public class Main {
    // вызов методов с заданиями
    public static void main(String[] args) {

        System.out.println("Практика 1\n");

        ex3();
        Messages.waitMessage();

        ex4();
        Messages.waitMessage();

        ex5(args);
        Messages.waitMessage();

        ex6();
        Messages.waitMessage();

        Ex7.factorial();

    }

    // задание 3
    public static void ex3() {

        System.out.println("\n\nЗадание 3\n");

        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Введите число элементов массива: ");
        size = scanner.nextInt();

        int[] mass = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Введите число с номером " + i + ": ");
            mass[i] = scanner.nextInt();
            sum += mass[i];
        }

        System.out.println("\nСумма элементов массива: " + sum);
        System.out.println("Среднее значение: " + (float) sum / size);
    }

    // задание 4
    public static void ex4() {

        System.out.println("\n\nЗадание 4\n");

        Scanner scanner = new Scanner(System.in);
        int size, i;

        System.out.print("Введите число элементов массива: ");
        size = scanner.nextInt();

        int[] mass = new int[size];

        for (i = 0; i < size; i++) {
            System.out.print("Введите число с номером " + i + ": ");
            mass[i] = scanner.nextInt();
        }
        System.out.println();

        int sum = mass[0], min = mass[0], max = mass[0];
        i = 1;

        while (i < size) {

            sum += mass[i];

            if (mass[i] > max)
                max = mass[i];

            if (mass[i] < min)
                min = mass[i];

            i++;

        }

        System.out.println("Результаты цикла while:\n" +
                "Сумма: " + sum + '\n' +
                "Минимальное значение: " + min + '\n' +
                "Максимальное значение: " + max + '\n');

        sum = 0;
        min = mass[0];
        max = mass[0];

        i = 0;

        do {

            sum += mass[i];

            if (mass[i] > max)
                max = mass[i];

            if (mass[i] < min)
                min = mass[i];

            i++;

        } while (i < size);

        System.out.println("Результаты цикла do while:\n" +
                "Сумма: " + sum + '\n' +
                "Минимальное значение: " + min + '\n' +
                "Максимальное значение: " + max);

    }

    // задание 5
    private static void ex5(String[] args) {

        System.out.println("\n\nЗадание 5\n");

        for (String arg : args) System.out.println(arg);
    }

    // задание 6
    private static void ex6() {

        System.out.println("\n\nЗадание 6\n");

        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        float current = 0F;

        for (int i = 1; i < 11; i++) {
            current += (float) 1 / i;
            System.out.println("Число с номером " + i + ": " + numberFormat.format(current));
        }
    }
}
