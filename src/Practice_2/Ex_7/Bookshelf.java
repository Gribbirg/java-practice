package Practice_2.Ex_7;

import java.util.ArrayList;

public class Bookshelf {

    // список книг
    public Book[] books;

    // кол-во книг
    public int count;

    // конструктор
    public Bookshelf(Book[] books, int count) {
        this.books = books;
        this.count = count;
    }

    // получение самой ранней книги
    public Book getEarliestBook() {

        if (books.length == 0) return null;

        Book ans = books[0];

        for (Book book : books) {
            if (book.getYear() < ans.getYear()) ans = book;
        }

        return ans;
    }

    // получение самой поздней книги
    public Book getLatestBook() {

        if (books.length == 0) return null;

        Book ans = books[0];

        for (Book book : books) {
            if (book.getYear() > ans.getYear()) ans = book;
        }

        return ans;
    }

    // сортировка книг по году написания
    public void sortBooks() {

        Book book;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                  book = books[j];
                  books[j] = books[j + 1];
                  books[j + 1] = book;
                }
            }
        }
    }
}
