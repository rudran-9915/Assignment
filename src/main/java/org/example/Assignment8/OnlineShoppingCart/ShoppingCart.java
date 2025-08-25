package org.example.Assignment8.OnlineShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
    private final ArrayList<CartItem> items = new ArrayList<CartItem>();

    public void addItem(CartItem item) {
        int index = items.indexOf(item);
        if (index >= 0) {
            CartItem existingItem = items.get(index);
            existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
        } else {
            items.add(item);
        }
    }

    public boolean removeItem(int itemId) {
        return items.removeIf((ci) -> ci.getItemId() == itemId);
    }

    public boolean updateQuantity(int itemId, int newQuantity) {
        if (newQuantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        for (Iterator<CartItem> it = items.iterator(); it.hasNext(); ) {
            CartItem item = it.next();
            if (item.getItemId() == itemId) {
                if (newQuantity == 0) {
                    it.remove();
                } else {
                    item.setQuantity(newQuantity);
                }
                return true;
            }
        }
        return false;
    }

    public CartItem searchItem(int itemId) {
        for (CartItem ci : items) {
            if (ci.getItemId() == itemId) return ci;
        }
        return null;
    }

    public double getTotalBill() {
        double total = 0.0;
        for (CartItem ci : items) {
            total += ci.getQuantity() * ci.getPricePerUnit();
        }
        return total;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Cart contents:");
        for (CartItem ci : items) System.out.println(ci);
        System.out.printf("Total: $%.2f%n", getTotalBill());
    }

}

