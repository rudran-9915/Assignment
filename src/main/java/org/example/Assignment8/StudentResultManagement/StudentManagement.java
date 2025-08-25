package org.example.Assignment8.StudentResultManagement;

import java.util.*;

public class StudentManagement {
    public final List<Student> students = new ArrayList<>();

    // Add new student
    public boolean addStudent(Student s) {
        if (students.contains(s)) {
            return false;
        }
        students.add(s);
        return true;
    }

    // Delete by roll number
    public boolean deleteStudent(int rollNo) {
        return students.removeIf(s -> s.getRollNo() == rollNo);
    }

    // Update marks by roll number
    public boolean updateMarks(int rollNo, double newMarks) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                s.setMarks(newMarks);
                return true;
            }
        }
        return false;
    }

    // Search by roll number
    public Student searchStudent(int rollNo) {
        int idx = students.indexOf(new Student(rollNo));
        if (idx >= 0) return students.get(idx);
        return null;
    }

    public void display(String heading) {
        System.out.println("\n--- " + heading + " ---");
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }
        students.forEach(System.out::println);
    }
}
