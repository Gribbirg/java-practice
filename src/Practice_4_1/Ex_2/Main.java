package Practice_4_1.Ex_2;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("2");

        // создание телефонов
        Phone apple = new Phone("8(977)654-32-11", "Apple iPhone 14 Pro", 206);
        Phone xiaomi = new Phone("8(800)555-35-35", "Xiaomi Redmi Note 12 Pro+", 208);
        Phone samsung = new Phone("8(606)787-94-22", "Samsung Galaxy S23 Ultra", 233);

        // вывод информации
        System.out.println("Телефоны:");
        System.out.println(apple);
        System.out.println(xiaomi);
        System.out.println(samsung);
        System.out.println();

        // звонки
        apple.receiveCall("Alexander");
        xiaomi.receiveCall("Ilya");
        samsung.receiveCall("Vlad");
        System.out.println();

        // номера
        System.out.println("Номера: " + apple.getNumber() + ", " + xiaomi.getNumber() + ", " + samsung.getNumber());
        System.out.println();

        // звонок
        apple.receiveCall("Polina", xiaomi.getNumber());
        System.out.println();

        // отправка сообщения номерам
        apple.sendMessage(xiaomi.getNumber(), samsung.getNumber());
    }
}
