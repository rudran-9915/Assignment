package org.example.Assignment9.StudentCourseEnrollment;

import java.util.Arrays;
import java.util.HashSet;

public class Driver {
    public static void main(String[] args) {
        EnrollmentSystem sys = new EnrollmentSystem();

        // 1) Add courses (available catalogue)
        sys.addCourse(new Course(201, "Data Structures"));
        sys.addCourse(new Course(101, "Introduction to Programming"));
        sys.addCourse(new Course(301, "Databases"));
        sys.addCourse(new Course(401, "Operating Systems"));
        sys.addCourse(new Course(202, "Algorithms"));

        System.out.println("Available courses (unsorted):");
        sys.viewAllCourses().forEach(System.out::println);

        // 2) Add students and register them
        sys.addStudent(new Student(1, "Alice"));
        sys.addStudent(new Student(2, "Bob"));
        sys.addStudent(new Student(3, "Charlie"));

        // Register students for courses (only valid courseIds will be applied)
        sys.registerStudentForCourses(1, "Alice", new HashSet<>(Arrays.asList(101, 201, 301)));
        sys.registerStudentForCourses(2, "Bob", new HashSet<>(Arrays.asList(101, 401)));
        sys.registerStudentForCourses(3, "Charlie", new HashSet<>(Arrays.asList(202, 201)));

        System.out.println("\nCourses for student 1 (Alice): " + sys.findCoursesByStudent(1));
        System.out.println("Courses for student 2 (Bob): " + sys.findCoursesByStudent(2));
        System.out.println("Courses for student 3 (Charlie): " + sys.findCoursesByStudent(3));

        // 3) Update registration: add a course to Alice, remove one from Bob
        sys.addCourseToStudent(1, 401); // Alice adds Operating Systems
        sys.removeCourseFromStudent(2, 401); // Bob drops Operating Systems

        System.out.println("\nAfter updates:");
        System.out.println("Alice: " + sys.findCoursesByStudent(1));
        System.out.println("Bob:   " + sys.findCoursesByStudent(2));

        // 4) Find all students registered in a given course
        System.out.println("\nStudents in course 101 (Intro to Programming): " + sys.findStudentsByCourse(101));
        System.out.println("Students in course 401 (Operating Systems): " + sys.findStudentsByCourse(401));

        // 5) Update entire registration for Charlie
        sys.updateStudentRegistration(3, new HashSet<>(Arrays.asList(101, 301))); // Charlie now in 101 and 301
        System.out.println("\nCharlie after full update: " + sys.findCoursesByStudent(3));

        // 6) Remove a student
        sys.removeStudent(2); // remove Bob
        System.out.println("\nAfter removing student 2 (Bob):");
        System.out.println("All students sorted by name: " + sys.getStudentsSortedByName());
        System.out.println("Students in course 101 now: " + sys.findStudentsByCourse(101));

        // 7) Sorted course list
        System.out.println("\nCourses sorted by name:");
        sys.getCoursesSortedByName().forEach(System.out::println);

    }
}
