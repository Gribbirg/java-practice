package Practice_6.Ex_6_7_8_9;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("с 6ого по 9ое");

        // создание массива
        Printable[] printables = {
                new Book(),
                new Shop(),
                new Shop(),
                new Book()
        };

        // вывод данных
        for (Printable printable : printables) printable.print();
    }
}
