package org.example.Assignment5.Payment;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String paymentId, String customerName, String cardNumber, String expiryDate) {
        super(paymentId, customerName);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processing");
        displayPayment();
        System.out.println("Card Number: ****-****-****-" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Processing credit card payment of $" + amount);

        System.out.println("Credit Card Payment of $" + amount + " processed successfully!");

    }
}
