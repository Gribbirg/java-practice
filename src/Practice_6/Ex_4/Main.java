package Practice_6.Ex_4;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("4");

        // создание объектов и вывод их цены
        Computer computer = new Computer(100000);
        System.out.println(Messages.getPriceRubles(computer.getPrice()));

        Mouse mouse = new Mouse(3500);
        System.out.println(Messages.getPriceRubles(mouse.getPrice()));

        Table table = new Table(5000);
        System.out.println(Messages.getPriceRubles(table.getPrice()));
    }
}
