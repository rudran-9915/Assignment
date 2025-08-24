package org.example.Assignment5.Payment;

public class Driver {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("cc001","Kaliraj A","1234567890123456","22-07-2050");
        Payment payPalPayment = new PayPalPayment("pp01","Karan","karan348@gmail.com");
        Payment upiPayment = new UPIPayment("upi001","Shakthi","shakti@paytm","9876543210");

        creditCardPayment.processPayment(1000.0);
        payPalPayment.processPayment(15000.0);
        upiPayment.processPayment(200.20);

    }
}
