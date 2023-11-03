package Practice_3.Ex_3_3;

public abstract class Report {
    public static void generateReport(Employee[] employees) {

        System.out.println("Список сотрудников:");

        // вывод информации о сотрудниках
        for (Employee employee : employees) {
            System.out.printf("%-20s", employee.fullName);
            System.out.printf("%10.2f\n", employee.salary);
        }

    }
}
