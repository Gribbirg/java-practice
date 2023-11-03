package Practice_2.Ex_7;

import ForAll.Messages;
import Practice_2.Ex_1.Author;

import java.util.Scanner;

// тестирование классов
public class BookTest {
    public static void main(String[] args) {
        System.out.println("Задание 7");

        Scanner scanner = new Scanner(System.in);
        String name;
        String author;
        int year;
        int size;

        Book book = enterBook(scanner);

        printBookInfo(book);

        System.out.print("Введите новое название: ");
        name = scanner.next();
        book.setName(name);
        System.out.println("Новое название: " + book.getName() + '\n');

        System.out.print("Введите нового автора: ");
        author = scanner.next();
        book.setAuthor(author);
        System.out.println("Новый автор: " + book.getAuthor() + '\n');

        System.out.print("Введите новый год написания: ");
        year = scanner.nextInt();
        book.setYear(year);
        System.out.println("Новый год написания: " + book.getYear() + '\n');

        System.out.print("Введите новое кол-во страниц: ");
        size = scanner.nextInt();
        book.setSize(size);
        System.out.println("Новое кол-во страниц: " + book.getSize() + '\n');


        System.out.println("\nВведите данные о книжной полке: ");

        System.out.print("Введите кол-во книг: ");
        size = scanner.nextInt();

        Book[] books = new Book[size];

        for (int i = 0; i < size; i++) books[i] = enterBook(scanner);
        Bookshelf bookshelf = new Bookshelf(books, size);

        System.out.println("\nСамая молодая книга: ");
        printBookInfo(bookshelf.getEarliestBook());
        Messages.waitMessage();

        System.out.println("Самая старая книга: ");
        printBookInfo(bookshelf.getLatestBook());
        Messages.waitMessage();

        bookshelf.sortBooks();
        System.out.println("Книги, отсортированные по возрасту: ");
        for (Book book1 : bookshelf.books) printBookInfo(book1);
    }

    // ввод книжки
    private static Book enterBook(Scanner scanner) {
        System.out.println("\nВведите информацию о книге: ");

        System.out.print("Введите название: ");
        String name = scanner.next();

        System.out.print("Введите имя автора: ");
        String author = scanner.next();

        System.out.print("Введите год написания: ");
        int year = scanner.nextInt();

        System.out.print("Введите кол-во страниц: ");
        int size = scanner.nextInt();

        return new Book(author, name, year, size);
    }

    // вывод информации о книге
    private static void printBookInfo(Book book) {
        System.out.println("\nКнига:\n" +
                "Название: " + book.getName() + '\n' +
                "Автор: " + book.getAuthor() + '\n' +
                "Год написания: " + book.getYear() + '\n' +
                "Кол-во страниц: " + book.getSize() + '\n');
    }
}
