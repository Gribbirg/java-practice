package Practice_2.Ex_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        System.out.println("Задание 10\n");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        char prev = ' ';

        // получение входных данных
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();

        // посимвольный пробег и подсчёт кол-ва слов
        for (char sym : message.toCharArray()) {
            if (sym == ' ' && prev != ' ') count++;
            prev = sym;
        }

        // добавление последнего слова при необходимости
        if (prev != ' ') count++;

        // вывод
        System.out.println("\nСлов: " + count);
    }
}
