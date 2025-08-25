package org.example.Assignment9.ProductPriceCatalog;

public class Driver {
    public static void main(String[] args) {
        ProductCatalog pc = new ProductCatalog();

        // Add products
        System.out.println("Add products:");
        System.out.println("Added 1001: " + pc.addProduct(new Product(1001, "Wireless Mouse", 25.50)));
        System.out.println("Added 1002: " + pc.addProduct(new Product(1002, "Mechanical Keyboard", 89.99)));
        System.out.println("Added 1003: " + pc.addProduct(new Product(1003, "USB-C Cable", 9.99)));
        System.out.println("Added 1004: " + pc.addProduct(new Product(1004, "27\" Monitor", 199.95)));
        System.out.println("Attempt add duplicate 1002: " + pc.addProduct(new Product(1002, "Keyboard - Duplicate", 59.99)));

        // View all
        System.out.println("\nAll products:");
        pc.viewAllProducts().forEach(System.out::println);

        // Search by ID
        System.out.println("\nFind product ID 1003: " + pc.findProductById(1003));
        System.out.println("Find product ID 9999: " + pc.findProductById(9999));

        // Find cheaper than
        System.out.println("\nProducts cheaper than $50:");
        pc.findProductsCheaperThan(50.0).forEach(System.out::println);

        // Update price
        System.out.println("\nUpdate price of 1001 to $22.00: " + pc.updatePrice(1001, 22.00));
        System.out.println("After update 1001: " + pc.findProductById(1001));

        // Remove product
        System.out.println("\nRemove product 1004: " + (pc.removeProduct(1004) != null));
        System.out.println("After removal, all products:");
        pc.viewAllProducts().forEach(System.out::println);

        // Sorted by name
        System.out.println("\nProducts sorted by name:");
        pc.getProductsSortedByName().forEach(System.out::println);

        // Sorted by price ascending
        System.out.println("\nProducts sorted by price (ascending):");
        pc.getProductsSortedByPrice(true).forEach(System.out::println);

        // Sorted by price descending
        System.out.println("\nProducts sorted by price (descending):");
        pc.getProductsSortedByPrice(false).forEach(System.out::println);
    }
}
