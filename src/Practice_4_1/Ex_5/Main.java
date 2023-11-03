package Practice_4_1.Ex_5;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("5");

        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();

        // ввод имени читателя
        System.out.print("Имя читателя: ");
        reader.fullName = scanner.next();

        // создание книг
        Book book = new Book("Первая книга", "Умный");
        Book book1 = new Book("Вторая книга", "Умный");
        Book book2 = new Book("Третья книга", "Умный");

        // проверка методов и их перегрузок
        reader.takeBook(3);
        reader.takeBook("Первая книга", "Вторая книга", "Третья книга");
        reader.takeBook(book, book1, book2);
        System.out.println();

        reader.returnBook(3);
        reader.returnBook("Первая книга", "Вторая книга", "Третья книга");
        reader.returnBook(book, book1, book2);

    }
}
