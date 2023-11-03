package Practice_19.Ex_1;

import ForAll.Messages;

import java.util.Scanner;

public class Main {
    private static final String[] INN = {
            "0000 0000 0000 0000",
            "0000 0990 0060 0001",
            "0000 2000 0000 0008",
            "1111 0000 0000 0000",
            "0060 0880 8888 0020",
            "0034 0880 0660 0600"
    };

    public static void main(String[] args) throws INNNotFoundException {
        Messages.printExNum("1");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String name = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        boolean find = false;
        for (String num : INN) if (num.equals(inn)) find = true;
        if (!find) throw new INNNotFoundException("ИНН не найден!");

        System.out.println("Всё хорошо!");
    }
}
