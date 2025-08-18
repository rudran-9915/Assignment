package org.example.Assignment4.PaymentGatewayIntegration;

public abstract class PaymentGateway {
    String gatewayName;
    String apiKey;

    public PaymentGateway(String gatewayName, String apiKey) {
        this.gatewayName = gatewayName;
        this.apiKey = apiKey;
    }

    public abstract void connect();

    public abstract void disconnect();

}
