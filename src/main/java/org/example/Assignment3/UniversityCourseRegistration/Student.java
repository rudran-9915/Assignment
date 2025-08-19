package org.example.Assignment3.UniversityCourseRegistration;

public class Student extends Person {
    private String studentId;
    private String[] courseList;

    public Student(String name, String email, int age, String studentId) {
        super(name, email, age);
        this.studentId = studentId;
        this.courseList = new String[0];
    }

    public String getStudentId() {
        return studentId;
    }

    public void registerCourse(String course) {
        String[] newCourseList = new String[courseList.length + 1];
        System.arraycopy(courseList, 0, newCourseList, 0, courseList.length);
        newCourseList[courseList.length] = course;
        courseList = newCourseList;
    }

    public void listCourses() {
        System.out.println("Registered courses for " + super.getName());
        for (String course : courseList) {
            System.out.println(course);
        }
    }
}
