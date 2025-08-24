package org.example.Assignment7.EcommerceOrderProcessing;

public class OrderService {
    public void placeOrder(String productName, int quantity) throws InvalidOrderQuantityException {
        System.out.printf("Placing order for %s (Quantity: %d)...%n", productName, quantity);
        if (quantity <= 0) {
            throw new InvalidOrderQuantityException("Order quantity must be greater than zero.");
        }
        // Simulate order placement
        System.out.println("Order placed successfully.");
    }
}
