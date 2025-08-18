package org.example.Assignment3.EmployeeManagement;

public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee(101,"Bob",600000.00,"ET");
        System.out.println("Employee Details");
        System.out.println("+++++++++++++++");
        System.out.println(employee.displayEmployeeDetails());
        System.out.println("___________________________________");
        Manager manager = new Manager(201,"Alice",950000.00,"MP&L",15,"ITS");
        System.out.println("Manager Details");
        System.out.println("+++++++++++++++");
        System.out.println(manager.displayManagerDetails());
    }
}
