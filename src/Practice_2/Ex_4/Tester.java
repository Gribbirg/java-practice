package Practice_2.Ex_4;

import ForAll.Messages;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.println("Задание 4\n");

        Scanner scanner = new Scanner(System.in);

        Shop shop = new Shop();
        int command;
        boolean work = true;
        String name;
        int coast;
        Computer computer;

        while (work) {

            System.out.println("Выберите номер операции:\n" +
                    "0 - выход\n" +
                    "1 - показать список компьютеров\n" +
                    "2 - добавить компьютер\n" +
                    "3 - удалить компьютер\n" +
                    "4 - найти компьютер");
            command = scanner.nextInt();

            switch (command) {
                case 0 -> {
                    System.out.println("Выход из программы.");
                    work = false;
                }
                case 1 -> {
                    System.out.println("Список компьютеров:");
                    for (Computer comp : shop.computerList) {
                        System.out.println("Название: " + comp.name + ", цена: " + comp.coast);
                    }
                    Messages.waitMessage();
                }
                case 2 -> {
                    System.out.print("Введите название компьютера: ");
                    name = scanner.next();
                    System.out.print("Введите цену компьютера: ");
                    coast = scanner.nextInt();
                    shop.addComputer(new Computer(name, coast));
                    System.out.println("Компьютер добавлен");
                    Messages.waitMessage();
                }
                case 3 -> {
                    System.out.print("Введите название компьютера: ");
                    name = scanner.next();
                    computer = shop.findComputer(name);
                    if (computer != null) {
                        shop.deleteComputer(computer);
                        System.out.println("Компьютер удалён");
                    } else System.out.println("Компьютер не найден");
                    Messages.waitMessage();
                }
                case 4 -> {
                    System.out.print("Введите название компьютера: ");
                    name = scanner.next();
                    computer = shop.findComputer(name);
                    if (computer != null)
                        System.out.println("Название: " + computer.name + ", цена: " + computer.coast);
                    else
                        System.out.println("Компьютер не найден");
                    Messages.waitMessage();
                }
            }

        }
    }
}
