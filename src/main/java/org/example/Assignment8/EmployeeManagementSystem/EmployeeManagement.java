package org.example.Assignment8.EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create (Add)
        addEmployee(employees, new Employee(1, "John Doe", "IT", 75000));
        addEmployee(employees, new Employee(2, "Alice Smith", "HR", 68000));
        addEmployee(employees, new Employee(3, "Bob Johnson", "Finance", 72000));

        System.out.println("\nAll employees after creation:");
        displayAll(employees);

        // Update (by id)
        System.out.println("\nUpdating employee with id=2 (new salary=90000, new dept=R&D)...");
        boolean updated = updateEmployee(employees, 2, 90000, "R&D");
        System.out.println(updated ? "Update successful." : "Employee not found.");

        System.out.println("\nAll employees after update:");
        displayAll(employees);

        // Delete (by id)
        System.out.println("\nDeleting employee with id=3...");
        boolean deleted = deleteEmployee(employees, 3);
        System.out.println(deleted ? "Delete successful." : "Employee not found.");

        System.out.println("\nAll employees after deletion:");
        displayAll(employees);

        // Search using contains() and indexOf() (relies on equals which compares id)
        int searchId = 2;
        Employee probe = new Employee(searchId, "", "", 0); // only id matters for equality
        System.out.printf("%nSearching for employee with id=%d using contains()/indexOf():%n", searchId);
        if (employees.contains(probe)) {
            int idx = employees.indexOf(probe);
            System.out.printf("Found at index %d: %s%n", idx, employees.get(idx));
        } else {
            System.out.println("Employee not found.");
        }

        // Search for non-existing
        int missingId = 99;
        Employee probe2 = new Employee(missingId, "", "", 0);
        System.out.printf("%nSearching for employee with id=%d:%n", missingId);
        System.out.println(employees.contains(probe2) ? "Found." : "Not found.");
    }

    // Add helper
    private static void addEmployee(List<Employee> list, Employee e) {
        if (list.contains(e)) {
            System.out.println("Cannot add. Employee with id " + e.getId() + " already exists.");
        } else {
            list.add(e);
            System.out.println("Added: " + e);
        }
    }

    // Update helper (returns true if updated)
    private static boolean updateEmployee(List<Employee> list, int id, double newSalary, String newDepartment) {
        for (Employee e : list) {
            if (e.getId() == id) {
                e.setSalary(newSalary);
                e.setDepartment(newDepartment);
                return true;
            }
        }
        return false;
    }

    // Delete helper (returns true if deleted)
    private static boolean deleteEmployee(List<Employee> list, int id) {
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    // Display all
    private static void displayAll(List<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
