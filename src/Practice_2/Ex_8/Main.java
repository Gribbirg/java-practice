package Practice_2.Ex_8;

import java.util.Scanner;

// 8ое задание
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 8\n");

        Scanner scanner = new Scanner(System.in);

        // ввод данных
        System.out.print("Введите кол-во элементов: ");
        int size = scanner.nextInt();
        System.out.println();

        String[] mass = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент: ");
            mass[i] = scanner.next();
        }

        // вывод массива до
        System.out.println("\nМассив до замены мест:");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }

        // переворот массива
        String el;
        for (int i = 0; i < size / 2; i++) {
            el = mass[i];
            mass[i] = mass[size - i - 1];
            mass[size - i - 1] = el;
        }

        // вывод массива после
        System.out.println("\nМассив после замены мест:");
        for (int i = 0; i < size; i++) {
            System.out.print(mass[i] + " ");
        }
    }
}
