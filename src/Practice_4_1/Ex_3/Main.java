package Practice_4_1.Ex_3;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("3");

        // создание объектов
        Person person1 = new Person();
        Person person2 = new Person("Alexander", 18);

        // задание имени
        person1.fullName = "Denis";

        // вызов методов
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
