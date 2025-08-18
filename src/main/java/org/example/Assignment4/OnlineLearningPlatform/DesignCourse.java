package org.example.Assignment4.OnlineLearningPlatform;

public class DesignCourse extends Course implements CertificateProvider{
    @Override
    public void enrollStudent(String studentName, String courseName) {
        System.out.println("Enrolling "+studentName+" "+courseName+" in Design Course");
    }

    @Override
    public void startCourse(String courseName) {
        System.out.println("Starting "+courseName+" Design Course");
    }

    @Override
    public void generateCertificate(String studentName,String courseName) {
        System.out.println("Certificate generated for "+studentName+" in "+courseName+" Design Course");
    }
}
