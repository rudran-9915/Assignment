package org.example.Assignment8.StudentResultManagement;

import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        StudentManagement mgr = new StudentManagement();

        // Add students
        mgr.addStudent(new Student(101, "Alice", 85.5));
        mgr.addStudent(new Student(104, "bob", 72.0));
        mgr.addStudent(new Student(103, "Charlie", 91.0));
        mgr.addStudent(new Student(102, "David", 66.5));
        mgr.addStudent(new Student(105, "Eve", 91.0)); // same marks as Charlie

        mgr.display("Original list (insertion order)");

        // Search
        int searchRoll = 103;
        Student found = mgr.searchStudent(searchRoll);
        System.out.println("\nSearch rollNo " + searchRoll + ": " + (found == null ? "Not found" : found));

        // Update marks
        mgr.updateMarks(104, 78.5);
        System.out.println("\nAfter updating marks for rollNo 104:");
        mgr.display("After update");

        // Delete a student
        mgr.deleteStudent(102);
        System.out.println("\nAfter deleting rollNo 102:");
        mgr.display("After deletion");

        // Sorting examples:
        // 1) Sort by marks (descending)
        Collections.sort(mgr.students);
        mgr.display("Sorted by marks (descending) - Comparable");

        // 2) Sort by name (alphabetical)
        Collections.sort(mgr.students, new NameComparator());
        mgr.display("Sorted by name (alphabetical)");

        // 3) Sort by rollNo (ascending)
        Collections.sort(mgr.students, new RollNoComparator());
        mgr.display("Sorted by rollNo (ascending)");
    }
}
