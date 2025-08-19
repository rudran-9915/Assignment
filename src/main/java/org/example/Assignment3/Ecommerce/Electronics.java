package org.example.Assignment3.Ecommerce;

public class Electronics extends Product{
    private String warranty;

    public Electronics(int productID, String productName, double price, String description, String warranty) {
        super(productID, productName, price, description);
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Product ID: " + getProductID());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + String.format("%.2f", getPrice()));
        System.out.println("Description: " + getDescription());
        System.out.println("Warranty Period: " + warranty);
    }
}
