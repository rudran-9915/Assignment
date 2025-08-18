package org.example.Assignment4.PaymentGatewayIntegration;

public class Paypal extends PaymentGateway implements PaymentProcessor, RefundProcessor {
    public Paypal(String gatewayName, String apiKey) {
        super("Paypal", apiKey);
    }

    @Override
    public void connect() {
        System.out.println("Connected to Paypal..."+apiKey);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("processing payment of $"+amount+"via"+gatewayName);
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("processing refund of $"+amount+"via"+gatewayName);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Paypal...");
    }
}
