package org.example.Assignment4.OnlineLearningPlatform;

public class Driver {
    public static void main(String[] args) {
        ProgrammingCourse programmingCourse = new ProgrammingCourse();
        programmingCourse.enrollStudent("John","Java");
        programmingCourse.startCourse("Java");
        programmingCourse.generateCertificate("John","Java");
        System.out.println();

        DesignCourse designCourse = new DesignCourse();
        designCourse.enrollStudent("Alice","Graphic");
        designCourse.startCourse("Graphic");
        designCourse.generateCertificate("Alice","Graphic");
        System.out.println();
    }
}
