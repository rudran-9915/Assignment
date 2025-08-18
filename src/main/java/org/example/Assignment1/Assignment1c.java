package org.example.Assignment1;

public class Assignment1c {
    public static void main(String[] args) {
        int amazonPrice = 280;
        int flipcartPrice = 205;
        int myntraPrice = 190;

        int bestDeal = (amazonPrice < flipcartPrice) ? ((amazonPrice < myntraPrice ? amazonPrice : myntraPrice)) : ((flipcartPrice < myntraPrice ? flipcartPrice : myntraPrice));
        System.out.println(bestDeal);
        int highPrice = (amazonPrice > flipcartPrice) ? ((amazonPrice > myntraPrice ? amazonPrice : myntraPrice)) : ((flipcartPrice > myntraPrice ? flipcartPrice : myntraPrice));
        System.out.println(highPrice);
        int diff = highPrice - bestDeal;
        ;
        System.out.println(diff);
    }
}
