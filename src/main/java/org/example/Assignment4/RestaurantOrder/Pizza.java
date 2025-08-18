package org.example.Assignment4.RestaurantOrder;

public class Pizza extends MenuItem implements Deliverable{
    public Pizza(String itemName) {
        super(itemName);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza: "+itemName);
    }

    @Override
    public void deliver(int tableNumber) {
        System.out.println("Delivering pizza to table "+tableNumber);
    }
}
