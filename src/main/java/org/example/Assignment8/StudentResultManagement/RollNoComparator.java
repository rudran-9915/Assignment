package org.example.Assignment8.StudentResultManagement;

import java.util.Comparator;

// Comparator: by rollNo
public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}
