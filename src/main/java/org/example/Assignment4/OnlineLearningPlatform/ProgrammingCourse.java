package org.example.Assignment4.OnlineLearningPlatform;

public class ProgrammingCourse extends Course implements CertificateProvider{
    @Override
    public void enrollStudent(String studentName,String courseName) {
        System.out.println("Enrolling "+studentName+" "+courseName+" in Programming Course");
    }

    @Override
    public void startCourse(String courseName) {
        System.out.println("Starting "+courseName+" Programming Course");
    }

    @Override
    public void generateCertificate(String studentName,String courseName) {
        System.out.println("Certificate generated for "+studentName+" in "+courseName+" Programming Course");
    }
}
