package Practice_6.Ex_3;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("3");

        // создание объектов и вывод их имён
        Animal animal = new Animal("Cat");
        System.out.println(animal.getName());

        Car car = new Car("Lada");
        System.out.println(car.getName());

        Planet planet = new Planet("Earth");
        System.out.println(planet.getName());
    }
}
