package Practice_17.Ex_1;

import ForAll.Messages;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Messages.printExNum("1");

        StudentController controller = new StudentController(retriveStudentFromDatabase(), new StudentView());

        controller.updateView();
        System.out.println();

        controller.setStudentName("Ilya");
        controller.setStudentRollNo("JNMHKVBUK555");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setRollNo("HBUJL67");
        student.setName("Alex");
        return student;
    }
}
