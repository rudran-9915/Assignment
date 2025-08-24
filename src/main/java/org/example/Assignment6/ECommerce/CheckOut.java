package org.example.Assignment6.ECommerce;

public class CheckOut {
    public double calculateTotal(double price, int quantity) {
        if (price <= 0.0 || quantity <= 0) {
            throw new IllegalArgumentException("Price and quantity must be positive.");
        }

        // Simulate overflow: check before multiplying
        // If price > Double.MAX_VALUE / quantity then price*quantity would exceed Double.MAX_VALUE
        if (price > Double.MAX_VALUE / quantity) {
            throw new ArithmeticException("Overflow detected.");
        }

        double total = price * quantity;

        if (Double.isInfinite(total) || Double.isNaN(total)) {
            throw new ArithmeticException("Overflow detected.");
        }

        return total;
    }
}
