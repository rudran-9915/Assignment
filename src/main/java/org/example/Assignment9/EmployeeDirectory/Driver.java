package org.example.Assignment9.EmployeeDirectory;

public class Driver {
    public static void main(String[] args) {
        EmployeeDir dir = new EmployeeDir();

        // Add employees
        System.out.println("Adding employees:");
        System.out.println("Added 101: " + dir.addEmployee(new Employee(101, "Alice Johnson", "Engineering")));
        System.out.println("Added 102: " + dir.addEmployee(new Employee(102, "Bob Smith", "Marketing")));
        System.out.println("Added 103: " + dir.addEmployee(new Employee(103, "Carmen Diaz", "Engineering")));
        System.out.println("Added 104: " + dir.addEmployee(new Employee(104, "David Lee", "HR")));

        // Attempt duplicate add (same id 102)
        System.out.println("Attempt add duplicate id 102: " + dir.addEmployee(new Employee(102, "Bobby", "Sales")));

        // View all
        System.out.println("\nAll employees (unsorted):");
        dir.viewAllEmployees().forEach(System.out::println);

        // Search by id
        System.out.println("\nSearch id 103: " + dir.findEmployeeById(103));
        System.out.println("Search id 999: " + dir.findEmployeeById(999));

        // Find by department
        System.out.println("\nEmployees in Engineering:");
        dir.findEmployeesByDepartment("Engineering").forEach(System.out::println);

        // Update department
        System.out.println("\nUpdate department for id 104 to 'Operations': " + dir.updateDepartment(104, "Operations"));
        System.out.println("After update:");
        dir.viewAllEmployees().forEach(System.out::println);

        // Remove employee
        System.out.println("\nRemove id 101: " + dir.removeEmployeeById(101));
        System.out.println("After removal:");
        dir.viewAllEmployees().forEach(System.out::println);

        // Sorted views
        System.out.println("\nSorted by name:");
        dir.getEmployeesSortedByName().forEach(System.out::println);

        System.out.println("\nSorted by department then id:");
        dir.getEmployeesSortedByDepartmentThenId().forEach(System.out::println);
    }
}
