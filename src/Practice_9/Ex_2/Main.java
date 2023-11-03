package Practice_9.Ex_2;

import ForAll.Messages;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("2");

        // массив
        List<Student> students = new ArrayList<>(List.of(new Student[]{
                new Student(234, "Alex", 100),
                new Student(2, "Ilya", 99),
                new Student(100, "Vlad", 55),
                new Student(24, "Denis", 40),
                new Student(25, "NoName", 1)
        }));

        // сортировка через созданный класс
        Comparator<Student> sortingStudentsByGPA = new SortingStudentsByGPA();
        students.sort(sortingStudentsByGPA);
        for (Student student : students) System.out.println(student);
    }
}
