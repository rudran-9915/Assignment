package org.example.Assignment5.Payment;

public abstract class Payment {
    private String paymentId;
    private String customerName;

    public Payment(String paymentId, String customerName) {
        this.paymentId = paymentId;
        this.customerName = customerName;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public abstract  void processPayment(double amount);

    public void displayPayment() {
        System.out.println("paymentId :"+paymentId);
        System.out.println("customerName :"+customerName);
    }
}
