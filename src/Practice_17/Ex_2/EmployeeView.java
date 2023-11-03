package Practice_17.Ex_2;

import ForAll.Messages;

public class EmployeeView {
    public void printEmployeeDetails(String name, double income) {
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("income: " + Messages.getPriceRubles(income));
    }
}
