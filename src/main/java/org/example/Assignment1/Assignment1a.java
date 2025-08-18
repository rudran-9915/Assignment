package org.example.Assignment1;

import java.util.*;

public class Assignment1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Principal = sc.nextDouble();
        Float InterestRate = sc.nextFloat();
        Integer Tenure = sc.nextInt();
        Double EMI = (Principal * InterestRate * (Math.pow((1 + InterestRate), (double) Tenure))) / (Math.pow((1 + InterestRate), (double) Tenure) - 1);
        System.out.println("Calculated EMI : " + EMI);
        System.out.printf("Rounded EMI : %.2f", EMI);

    }
}
