package org.example.Assignment8.OnlineShoppingCart;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem(1,"Laptop",1,120000.0));
        cart.addItem(new CartItem(2,"Keyboard",2,2500.00));

        //add another laptop
        cart.addItem(new CartItem(1,"Laptop",1,120000.0));
        cart.displayCart();

        //search
        System.out.println("Search itemid 1: "+cart.searchItem(1));

        //update
        cart.updateQuantity(2,3);
        cart.displayCart();

        //set quantity to 0
        cart.updateQuantity(1,0);
        cart.displayCart();

        boolean removed = cart.removeItem(3);
        System.out.println("removed item3? : "+removed);
    }
}
