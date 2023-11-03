package Practice_4_1.Ex_10;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("10");

        // массив тс
        Vehicle[] vehicles = {
                new Car(),
                new Train(),
                new Plane(),
                new Ship()
        };

        // вывод инфы о тс
        System.out.println("Информация о тс:");
        for (Vehicle vehicle : vehicles) System.out.println(vehicle);
    }
}
