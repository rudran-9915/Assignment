package org.example.Assignment5.OnlineShoppingSystem;

public class Driver {
    public static void main(String[] args) {
        Customer regularCustomer = new RegularCustomer();
        Customer premiumCustomer = new PremiumCustomer();

        double amount = 200.0;
        int loyaltyPoints = 100;

        //Overriding
        System.out.println("Regular customer :"+regularCustomer.calculateDiscount(amount));
        System.out.println("Premium customer :"+premiumCustomer.calculateDiscount(amount));

        //overloading
        System.out.println("Regular customer :"+regularCustomer.calculateDiscount(amount, loyaltyPoints));
        System.out.println("Premium customer :"+premiumCustomer.calculateDiscount(amount, loyaltyPoints));
    }
}
