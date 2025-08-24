package org.example.Assignment5.OnlineShoppingSystem;

public class RegularCustomer extends Customer{
    @Override
    public double calculateDiscount(double purchaseAmount){
        double rate = (purchaseAmount > 100.0) ? 0.05 : 0.02;
        return purchaseAmount * rate;
    }
}
