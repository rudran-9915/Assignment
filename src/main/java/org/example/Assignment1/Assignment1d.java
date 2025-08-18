package org.example.Assignment1;

import java.util.*;

public class Assignment1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monthlySalary = sc.nextLine();
        double mSalary = Double.parseDouble(monthlySalary);
        double aSalary = mSalary * 12;
        double tax = 0;

        if (aSalary <= 600000) {
            tax = 0;
        } else if (aSalary <= 1200000) {
            tax += (aSalary - 600000) * 0.10;
        } else if (aSalary <= 2400000) {
            tax += (1200000 - 600000) * 0.10;
            tax += (aSalary - 1200000) * 0.20;
        } else {
            tax += (1200000 - 600000) * 0.10;
            tax += (2400000 - 1200000) * 0.20;
            tax += (aSalary - 2400000) * 0.30;
        }

        double netSalary = aSalary - tax;
        System.out.println("annual salary: " + aSalary);
        System.out.println("net salary: " + netSalary);
        System.out.println("tax: " + tax);


    }
}
