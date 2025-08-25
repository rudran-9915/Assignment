package org.example.Assignment9.ProductPriceCatalog;

import java.util.*;
import java.util.stream.Collectors;

public class ProductCatalog {
    public final Map<Integer, Product> catalog = new HashMap<>();

    // Add a new product.

    public boolean addProduct(Product p) {
        if (p == null) throw new IllegalArgumentException("Product cannot be null");
        return catalog.putIfAbsent(p.getProductId(), p) == null;
    }

    // Remove a product by productId.
    public Product removeProduct(int productId) {
        return catalog.remove(productId);
    }

    // Update the price of a product
    public boolean updatePrice(int productId, double newPrice) {
        if (newPrice < 0) throw new IllegalArgumentException("Price cannot be negative");
        Product p = catalog.get(productId);
        if (p == null) return false;
        p.setPrice(newPrice);
        return true;
    }
    //View all products as an unsorted list

    public List<Product> viewAllProducts() {
        return new ArrayList<>(catalog.values());
    }

    // Searching
    // Find a product by its ID

    public Product findProductById(int productId) {
        return catalog.get(productId);
    }

    //Find all products cheaper than a given price (strictly less than).
    public List<Product> findProductsCheaperThan(double price) {
        if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
        return catalog.values().stream()
                .filter(p -> p.getPrice() < price)
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

    //  Sorting
    // Display products sorted by product name

    public List<Product> getProductsSortedByName() {
        return catalog.values().stream()
                .sorted(Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }


    // Display products sorted by price.

    public List<Product> getProductsSortedByPrice(boolean ascending) {
        Comparator<Product> cmp = Comparator.comparingDouble(Product::getPrice);
        if (!ascending) cmp = cmp.reversed();
        return catalog.values().stream()
                .sorted(cmp)
                .collect(Collectors.toList());
    }
}
