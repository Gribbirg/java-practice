package Practice_2.Ex_5;

import java.util.ArrayList;
import java.util.Scanner;

// приют - тестирование класса
public class DogKennel {

    static ArrayList<Dog> dogList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Задание 5\n");

        Scanner scanner = new Scanner(System.in);

        String name;
        int age, count;

        System.out.print("Введите кол-во собак: ");
        count = scanner.nextInt();
        System.out.println();

        for (int i = 0; i< count; i++) {
            System.out.print("Введите имя собаки: ");
            name = scanner.next();
            System.out.print("Введите возраст собаки: ");
            age = scanner.nextInt();
            dogList.add(new Dog(name, age));
            System.out.println();
        }

        System.out.println("Список собак: ");
        for (Dog dog : dogList) System.out.println(dog);
    }
}
