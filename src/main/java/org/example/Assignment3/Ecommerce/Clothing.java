package org.example.Assignment3.Ecommerce;

public class Clothing extends Product{
    private String size;
    private String fabric;

    public Clothing(int productID, String productName, double price, String description, String size, String fabric) {
        super(productID, productName, price, description);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public String getFabric() {
        return fabric;
    }

    @Override
    public void displayProductDetails() {
        System.out.println("Product ID: " + getProductID());
        System.out.println("Product Name: " + getProductName());
        System.out.println("Price: $" + String.format("%.2f", getPrice()));
        System.out.println("Description: " + getDescription());
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}
