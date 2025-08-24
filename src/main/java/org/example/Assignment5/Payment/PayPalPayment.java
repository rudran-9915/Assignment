package org.example.Assignment5.Payment;

public class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(String paymentId, String customerName, String email) {
        super(paymentId, customerName);
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment Processing");
        displayPayment();
        System.out.println("PayPal Email: " + email);
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("PayPal Payment of $" + amount + " processed successfully!");
    }
}
