package org.example.Assignment3.Ecommerce;

public abstract class Product {
    private int productID;
    private String productName;
    private double price;
    private String description;

    public Product(int productID, String productName, double price, String description) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract void displayProductDetails();
}
