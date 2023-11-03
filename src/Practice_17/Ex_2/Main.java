package Practice_17.Ex_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Alex");
        employee.setIncome(80000.902);

        EmployeeController controller = new EmployeeController(employee, new EmployeeView());

        controller.updateView();
        System.out.println();

        controller.setCalculateIncome(1000000.80, 12);

        controller.updateView();
    }
}
