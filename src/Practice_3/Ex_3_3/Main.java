package Practice_3.Ex_3_3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 3.3\n");

        // создание массива сотрудников
        Employee[] employees = {
                new Employee("Александр", 50000.0006),
                new Employee("Полина", 30000.0006),
                new Employee("Кирилл", 1000.0006),
                new Employee("Илья", 10000.0006),
                new Employee("Владислав", 25000.0006)
        };

        // репорт
        Report.generateReport(employees);
    }
}
