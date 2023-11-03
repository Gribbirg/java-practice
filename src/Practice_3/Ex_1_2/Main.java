package Practice_3.Ex_1_2;

// тестирование
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.2\n");

        Tester tester = new Tester();

        System.out.println("Тестер:");
        System.out.println(tester);

        System.out.println("Наименьшая окружность:");
        System.out.println(tester.getSmallestCircle());

        System.out.println("Наибольшая окружность:");
        System.out.println(tester.getBiggestCircle());

        tester.sortCircles();
        System.out.println("Тестер после сортировки:");
        System.out.println(tester);
    }
}
