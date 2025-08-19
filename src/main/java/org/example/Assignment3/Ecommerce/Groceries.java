package org.example.Assignment3.Ecommerce;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Groceries extends Product{
    private String expiryDate;

    public Groceries(int productID, String productName, double price, String description, String expiryDate) {
        super(productID, productName, price, description);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Product ID: " + getProductID());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + String.format("%.2f", getPrice()));
        System.out.println("Description: " + getDescription());
        System.out.println("Expiry Date: " + expiryDate);
    }
}
