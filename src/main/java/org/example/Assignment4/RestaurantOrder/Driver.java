package org.example.Assignment4.RestaurantOrder;

public class Driver {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Mergherita");
        pizza.prepare();
        pizza.deliver(5);
        System.out.println();
        Burger burger = new Burger("Veggie Burger");
        burger.prepare();
        burger.deliver(2);
    }
}
