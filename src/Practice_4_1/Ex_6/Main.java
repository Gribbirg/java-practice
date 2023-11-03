package Practice_4_1.Ex_6;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("6");

        // создание работника
        Employer employer1 = new Manager("Alex", "Grib", 56.77, 3);

        // создание работников
        Employer[] employers = {
                new Manager("Ilya", "Morozov", 100, 25.7),
                new Employer("Ilya", "Morovov", 21000000),
                new Employer("Ilya", "Podkolozin", 999)
        };

        // вывод их прибыли
        System.out.println("Прибыль:");
        for (Employer employer : employers)
            System.out.println(employer.firstName + " " + employer.lastName + ": " + Messages.getPriceRubles(employer.getIncome()));
    }
}
