package org.example.Assignment7.EcommerceOrderProcessing;

public class Driver {
    public static void main(String[] args) {
        OrderService service = new OrderService();

        // Valid order
        try {
            service.placeOrder("Laptop", 1);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Invalid order
        try {
            service.placeOrder("Phone", 0);
        } catch (InvalidOrderQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
