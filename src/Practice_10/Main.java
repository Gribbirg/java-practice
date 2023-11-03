package Practice_10;

import ForAll.Messages;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("с 1 по 2");

        // до сортировок
        System.out.println("До:");
        List<Student> students = setArray();
        outArray(students);
        System.out.println();

        // сортировка по GPA
        System.out.println("По GPA:");
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        outArray(students);
        System.out.println();

        // сортировка по ID
        System.out.println("По ID:");
        students = setArray();
        Comparator<Student> sortingStudentsById = new SortingStudentsByID();
        students.sort(sortingStudentsById);
        outArray(students);
    }

    // создание массива
    static private List<Student> setArray() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(66, "Alex", "Grib", 2, "ИКБО-16-22", 100));
        students.add(new Student(77, "A", "G", 2, "И", 1));
        students.add(new Student(64, "Ilya", "Podokolozin", 1, "ИКБО-03-22", 99));
        students.add(new Student(61, "NoName", "NoSurName", 4, "ИКБО-NO-20", 10));
        students.add(new Student(1, "Vlad", "Baby", 2, "ИКБО-16-22", 88));
        return students;
    }

    // вывод массива
    static private void outArray(List<Student> students) {
        for (Student student : students) System.out.println(student);
    }
}
