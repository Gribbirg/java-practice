package Practice_4_1.Ex_7;

import ForAll.Messages;

public class Main {
    public static void main(String[] args) {

        Messages.printExNum("7");

        // список учащихся
        Learner[] learners = {
                new Schoolboy("Ilya"),
                new Student("Alex"),
                new Student("Sasha"),
                new Schoolboy("Denis"),
                new Schoolboy("Vlad")
        };

        // вывод информации о студентах
        System.out.println("Студенты:");
        for (Learner learner : learners) {
            try {
                System.out.println(((Student) learner));
            } catch (ClassCastException ignored) {
            }
        }
        System.out.println();

        // вывод информации о школьниках
        System.out.println("Школьники:");
        for (Learner learner : learners) {
            try {
                System.out.println(((Schoolboy) learner));
            } catch (ClassCastException ignored) {
            }
        }

    }
}
