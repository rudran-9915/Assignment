package org.example.Assignment4.OnlineLearningPlatform;

public abstract class Course {
    String courseName;
    double duration;

    public abstract void enrollStudent(String studentName,String courseName);
    public abstract void startCourse(String courseName);
}
