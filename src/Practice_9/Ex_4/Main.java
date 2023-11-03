package Practice_9.Ex_4;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("4");

        // создание студентов
        Student student = new Student(22, "Alex", 100);
        Student student1 = new Student(22, "Ilya", 90);

        // сравнение двух студентов
        if (student.compareTo(student1) > 0)
            System.out.println(student + " is better");
        else if (student.compareTo(student1) < 0)
            System.out.println(student1 + " is better");
        else
            System.out.println(student + " = " + student1);

    }
}
