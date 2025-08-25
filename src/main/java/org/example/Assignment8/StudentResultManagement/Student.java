package org.example.Assignment8.StudentResultManagement;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int rollNo;
    private String name;
    private double marks;


    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    //constructor used when searching by rollNo (name/marks not required)
    public Student(int rollNo) {
        this(rollNo, "", 0.0);
    }


    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public double getMarks() { return marks; }
    public void setName(String name) { this.name = name; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.marks, this.marks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
