package org.example.Assignment7.ATMPinValidation;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("Enter the pin: ");
        String pin = sc.nextLine();

        try {
            atm.validatePin(pin);
            System.out.println("Access Granted. Welcome!");
        } catch (InvalidPinException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}
