package ForAll;

import java.text.NumberFormat;
import java.util.Scanner;

// класс для сообщений для всех работ
public abstract class Messages {
    // сообщение об ожидании нажатия Enter
    public static void waitMessage() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nНажмите Enter для продолжения");
        scanner.nextLine();

    }

    // сообщение с номером упражнения
    public static void printExNum(String numEx) {
        System.out.println("Задание " + numEx + '\n');
    }

    // перевод цены в рубли
    public static String getPriceRubles(double x) { return NumberFormat.getCurrencyInstance().format(x); }
}
