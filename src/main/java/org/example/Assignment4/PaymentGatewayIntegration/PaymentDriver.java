package org.example.Assignment4.PaymentGatewayIntegration;

public class PaymentDriver {
    public static void main(String[] args) {
        StripeGateway stripeGateway = new StripeGateway("Stripe","Stripe API");
        stripeGateway.connect();
        stripeGateway.processPayment(500);
        stripeGateway.processRefund(100);
        stripeGateway.disconnect();
        System.out.println("++++++++++++++++");
        Paypal paypal = new Paypal("Paypal","Paypal API");
        paypal.connect();
        paypal.processPayment(250);
        paypal.processRefund(50);
        paypal.disconnect();
    }
}
