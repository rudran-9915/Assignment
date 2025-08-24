package org.example.Assignment6.ECommerce;


import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckOut checkout = new CheckOut();

        System.out.print("Enter price: ");
        String priceInput = scanner.nextLine();

        System.out.print("Enter quantity: ");
        String quantityInput = scanner.nextLine();

        try {
            // May throw NumberFormatException
            double price = Double.parseDouble(priceInput);
            int quantity = Integer.parseInt(quantityInput);

            // May throw IllegalArgumentException or ArithmeticException (overflow simulation)
            double total = checkout.calculateTotal(price, quantity);
            System.out.printf("Total price: $%.2f%n", total);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values for price and quantity.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid values: price and quantity must be greater than zero.");
        } catch (ArithmeticException e) {
            System.out.println("Calculation overflow occurred. Please use smaller values.");
        } finally {
            System.out.println("Checkout process complete");
            scanner.close();
        }
    }
}
