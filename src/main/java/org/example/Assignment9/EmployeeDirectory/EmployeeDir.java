package org.example.Assignment9.EmployeeDirectory;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDir {
    public final Set<Employee> employees = new HashSet<>();

    // Add a new employee. Returns true if added, false if duplicate (same id).
    public boolean addEmployee(Employee e) {
        return employees.add(e); // HashSet.add uses equals()/hashCode()
    }

    // Remove an employee by ID. Returns true if removed.
    public boolean removeEmployeeById(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }

    // Update an employee's department by ID. Returns true if updated.
    public boolean updateDepartment(int id, String newDepartment) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setDepartment(newDepartment);
                return true;
            }
        }
        return false;
    }

    // View all employees (unsorted list copy).
    public List<Employee> viewAllEmployees() {
        return new ArrayList<>(employees);
    }

    // Find an employee by ID. Returns the Employee or null if not found.
    public Employee findEmployeeById(int id) {
        return employees.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Find all employees in a given department (case-insensitive).
    public List<Employee> findEmployeesByDepartment(String department) {
        String deptLower = department == null ? "" : department.toLowerCase();
        return employees.stream()
                .filter(emp -> {
                    String d = emp.getDepartment();
                    return d != null && d.toLowerCase().equals(deptLower);
                })
                .collect(Collectors.toList());
    }

    // employees sorted by name (case-insensitive).
    public List<Employee> getEmployeesSortedByName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    //  sorted by department (case-insensitive) then by id (ascending).
    public List<Employee> getEmployeesSortedByDepartmentThenId() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment, String.CASE_INSENSITIVE_ORDER)
                        .thenComparingInt(Employee::getId))
                .collect(Collectors.toList());
    }
}
