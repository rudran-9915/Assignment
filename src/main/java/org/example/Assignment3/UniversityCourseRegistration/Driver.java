package org.example.Assignment3.UniversityCourseRegistration;

public class Driver {
    public static void main(String[] args) {
        Student student = new Student("Kaliraj","kaliraj@gmail.com",21,"21BIT0687");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Email: " + student.getEmail());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());

        Course course = new Course("CSE011","Introduction to java");
        course.displayCourseDetails();

        student.registerCourse(course.getCourseName());
        student.listCourses();

        Professor professor = new Professor("Karan","karan@gmail.com",45,"Computer Science","P123");
        System.out.println("\nProfessor Name: " + professor.getName());
        System.out.println("Professor Email: " + professor.getEmail());
        System.out.println("Professor Age: " + professor.getAge());
        System.out.println("Professor ID: " + professor.getEmployeeId());
        System.out.println("Subject Taught: " + professor.getSubjectTaught());

    }
}
