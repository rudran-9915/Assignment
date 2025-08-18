package org.example.Assignment1;

import java.util.*;

public class Assignment1e {
    public static void main(String[] args) {

        List<String> ageStrings = List.of("3", "16", "45", "70", "12", "18", "23", "65", "55", "10");

        int childCount = 0;
        int teenCount = 0;
        int adultCount = 0;
        int seniorCount = 0;

        int totalPatients = ageStrings.size();

        for (String ageStr : ageStrings) {
            int age = Integer.parseInt(ageStr);


            if (age >= 0 && age <= 12) {
                childCount++;
            } else if (age >= 13 && age <= 19) {
                teenCount++;
            } else if (age >= 20 && age <= 59) {
                adultCount++;
            } else if (age >= 60) {
                seniorCount++;
            }
        }

        double childPercent = (childCount * 100.0) / totalPatients;
        double teenPercent = (teenCount * 100.0) / totalPatients;
        double adultPercent = (adultCount * 100.0) / totalPatients;
        double seniorPercent = (seniorCount * 100.0) / totalPatients;


        System.out.println("Patient Age Group Distribution:");
        System.out.printf("Child: %d (%.2f%%)%n", childCount, childPercent);
        System.out.printf("Teen: %d (%.2f%%)%n", teenCount, teenPercent);
        System.out.printf("Adult: %d (%.2f%%)%n", adultCount, adultPercent);
        System.out.printf("Senior: %d (%.2f%%)%n", seniorCount, seniorPercent);
    }
}

