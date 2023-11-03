package Practice_9.Ex_1;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        // создание масива
        Messages.printExNum("1");
        Student[] students = {
                new Student(234, "Alex", 100),
                new Student(2, "Ilya", 99),
                new Student(100, "Vlad", 55),
                new Student(24, "Denis", 40),
                new Student(25, "NoName", 1)
        };

        sort(students);
        printStudents(students);
    }

    // сортировка массива
    private static void sort(Student[] students) {
        Student value;
        for (int left = 0; left < students.length; left++) {
            value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.id < students[i].id) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
    }

    // вывод массива
    private static void printStudents(Student[] students) {
        for (Student student : students) System.out.println(student);
    }
}
