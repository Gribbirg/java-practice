package Practice_13.Ex_2;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("2");

        Student student = new Student("Grib", "Alex", "Mushroom");
        Student student1 = new Student("Grib");

        System.out.println(student);
        System.out.println(student1);
    }
}
