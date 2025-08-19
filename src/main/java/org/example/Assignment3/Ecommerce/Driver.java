package org.example.Assignment3.Ecommerce;

public class Driver {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(1,"Smartphone",25000.00,"Advanced Features","2 years");
        System.out.println("Electronics product");
        electronics.displayProductDetails();
        System.out.println();

        Clothing clothing = new Clothing(2,"T-shirt",300.99,"Comfortable","L","Cotton");
        System.out.println("Clothing product");
        clothing.displayProductDetails();
        System.out.println();

        Groceries groceries = new Groceries(3,"Egg",6.50,"Protein rich","2025-09-25");
        System.out.println("Groceries product");
        groceries.displayProductDetails();
        System.out.println();

    }
}
