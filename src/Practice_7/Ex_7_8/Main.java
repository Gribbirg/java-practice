package Practice_7.Ex_7_8;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("7");

        // массив
        Printable[] printables = {
            new Book("a"),
            new Book("b"),
            new Magazine("c"),
            new Book("d"),
            new Book("e"),
            new Magazine("f"),
            new Magazine("g"),
            new Magazine("h"),
            new Book("i"),
        };

        // вывод массива - книг и журналов поотдельности
        Printable.printMagazines(printables);
        System.out.println();
        Printable.printBooks(printables);
    }
}
