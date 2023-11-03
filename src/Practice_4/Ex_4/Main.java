package Practice_4.Ex_4;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("4.4");

        Computer[] computers = {
                new Computer(
                        ComputerBrand.ARDOR,
                        new Processor(10, 16, 2.5),
                        new Memory(1000, 3350, 2800),
                        new VideoCard(1920, 12, 504)
                ),
                new Computer(
                        ComputerBrand.MSI,
                        new Processor(6, 12, 2.5),
                        new Memory(500, 3600, 2300),
                        new VideoCard(1552, 8, 224)
                ),
                new Computer(
                        ComputerBrand.DEXP,
                        new Processor(4, 8, 3.7),
                        new Memory(500, 3500, 2100),
                        new VideoCard(1485, 4, 192)
                )
        };

        // печать всех компьютеров
        System.out.println("Компьютеры:");
        for (Computer computer : computers) System.out.println(computer.toString() + '\n');
    }
}
