package org.example.Assignment6.ATM;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ATM atm = new ATM(10000.00); // initial balance

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        String input = scanner.nextLine();

        try {
            double amount = Double.parseDouble(input);            // may throw NumberFormatException
            atm.withdraw(amount);                                 // may throw IllegalArgumentException or ArithmeticException
            System.out.printf("Withdrawal successful. Remaining balance: $%.2f%n", atm.getBalance());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount entered.");
        } catch (ArithmeticException e) {
            System.out.printf("Insufficient balance. Available: $%.2f%n", atm.getBalance());
        } finally {
            scanner.close();
        }
    }
}
