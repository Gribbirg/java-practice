package Practice_3.Ex_1_4and5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.4 и 1.5 (совпадают)\n");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // ввод рамеров массива с проверкой
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.print("Введите положительное число: ");
            size = scanner.nextInt();
        }

        // генерация случайного массива
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) mass[i] = random.nextInt(size + 1);

        // вывод массива
        System.out.println("Массив:");
        System.out.println(Arrays.toString(mass));

        // создание массива с четными элементами основгого
        ArrayList<Integer> evens = new ArrayList<>();
        for (int el : mass)
            if (el % 2 == 0)
                evens.add(el);

        // вывод массива с четными элементами с проверкой на пустоту
        if (evens.isEmpty()) System.out.println("Чётных чисел нет :-(");
        else {
            System.out.println("Чётные числа:");
            System.out.println(evens);
        }
    }
}
