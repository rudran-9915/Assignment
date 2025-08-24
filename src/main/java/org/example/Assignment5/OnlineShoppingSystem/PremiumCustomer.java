package org.example.Assignment5.OnlineShoppingSystem;

public class PremiumCustomer extends Customer{
    @Override
    public double calculateDiscount(double purchaseAmount) {

        double rate = 0.10;
        if (purchaseAmount > 500.0) {
            rate += 0.05; // boost for big spenders
        }
        return purchaseAmount * rate;
    }
}
