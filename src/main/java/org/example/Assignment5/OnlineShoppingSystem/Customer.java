package org.example.Assignment5.OnlineShoppingSystem;

public class Customer {
    public double calculateDiscount(double purchaseAmount) {
        return 0.0;
    }

    public double calculateDiscount(double purchaseAmount, int loyaltyPoints) {

        double baseDiscount = calculateDiscount(purchaseAmount);
        double loyaltyRate = Math.min((loyaltyPoints / 10) * 0.001, 0.05);
        double loyaltyDiscount = purchaseAmount * loyaltyRate;
        return baseDiscount + loyaltyDiscount;
    }
}
