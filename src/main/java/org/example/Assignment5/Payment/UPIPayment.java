package org.example.Assignment5.Payment;

public class UPIPayment extends Payment {
    private String upiId;
    private String phoneNumber;

    public UPIPayment(String paymentId, String customerName, String upiId, String phoneNumber) {
        super(paymentId, customerName);
        this.upiId = upiId;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment Processing");
        displayPayment();
        System.out.println("UPI ID: " + upiId);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Processing UPI payment of $" + amount);
        System.out.println("UPI Payment of $" + amount + " processed successfully!");
    }
}
