package Practice_3.Ex_1_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.1\n");

        System.out.println("Используя метод random() класса Math:");

        // генерация размера массива
        int size = (int) (Math.random() * 10) + 1;
        System.out.println("Массив из " + size + " элементов");

        // генерация элементов массива
        double[] mass = new double[size];
        for (int i = 0; i < size; i++) mass[i] = Math.random();

        // сортировка и вывод
        sortMassWithPrint(mass, size);

        System.out.println("\nИспользуя класс Random:");

        Random random = new Random();

        // генерация размера массива
        size = (int) (random.nextDouble() * 10) + 1;
        System.out.println("Массив из " + size + " элементов");

        // генерация элементов массива
        mass = new double[size];
        for (int i = 0; i < size; i++) mass[i] = random.nextDouble();

        // сортировка и вывод
        sortMassWithPrint(mass, size);
    }

    // вывод массива
    private static void printMass(double[] mass, int size) {
        for (double el : mass) System.out.print(el + " ");
        System.out.println();
    }

    // сортировка и вывод
    private static void sortMassWithPrint(double[] mass, int size) {

        System.out.println("Массив: ");
        printMass(mass, size);

        double save;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (mass[j] > mass[j + 1]) {
                    save = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = save;
                }
            }
        }


        System.out.println("Массив после сортировки: ");
        printMass(mass, size);

    }
}
