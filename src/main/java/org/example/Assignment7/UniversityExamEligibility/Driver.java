package org.example.Assignment7.UniversityExamEligibility;

public class Driver {
    public static void main(String[] args) {
        ExamEligibility eligibility = new ExamEligibility();

        // Student 1: Alice (80%)
        String name1 = "Alice";
        double attendance1 = 80.0;
        System.out.printf("Checking eligibility for %s (Attendance: %.0f%%)...%n", name1, attendance1);
        try {
            eligibility.checkEligibility(name1, attendance1);
            System.out.println("Eligible for exam.");
        } catch (LowAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Student 2: Bob (65%)
        String name2 = "Bob";
        double attendance2 = 65.0;
        System.out.printf("Checking eligibility for %s (Attendance: %.0f%%)...%n", name2, attendance2);
        try {
            eligibility.checkEligibility(name2, attendance2);
            System.out.println("Eligible for exam.");
        } catch (LowAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
