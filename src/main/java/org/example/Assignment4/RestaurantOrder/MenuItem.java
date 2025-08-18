package org.example.Assignment4.RestaurantOrder;

public abstract class MenuItem {
    String itemName;

    public MenuItem(String itemName) {
        this.itemName = itemName;
    }

    public abstract void prepare();
}
