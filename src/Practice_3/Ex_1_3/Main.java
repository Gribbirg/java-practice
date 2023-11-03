package Practice_3.Ex_1_3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.3\n");

        Random random = new Random();

        // заполнение случайными числами
        int[] mass = new int[4];
        for (int i = 0; i < 4; i++) {
            mass[i] = random.nextInt(10, 100);
        }

        // вывод
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(mass));

        // копирование массива
        int[] sortedMass = new int[4];
        for (int i = 0; i < 4; i++) sortedMass[i] = mass[i];
        // сортировка скопированного массива
        sortMass(sortedMass, 4);

        // сравнение сортированного и обычного массива
        for (int i = 0; i < 4; i++) {
            if (mass[i] != sortedMass[i]) {
                System.out.println("Массив не сортирован по возрастанию");
                return;
            }
        }
        System.out.println("Массив сортирован по возрастанию");
    }

    // сортировка массива
    private static void sortMass(int[] mass, int size) {
        int save;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (mass[j] > mass[j + 1]) {
                    save = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = save;
                }
            }
        }
    }
}
