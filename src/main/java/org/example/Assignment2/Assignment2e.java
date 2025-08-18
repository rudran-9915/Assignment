package org.example.Assignment2;

public class Assignment2e {
    public static void main(String[] args) {
        int[] incomes = {200000,350000,600000,1500000,6700000};
        int tax;
        int taxPercentage;
        for(int income : incomes) {
            tax=0;
            taxPercentage=0;
            if(income <= 250000) {
                taxPercentage=0;
                tax+=0;
            } else if (income>250000 && income<=500000) {
                taxPercentage = 5;
                tax+=income*0.05;
            }else if(income>500000 && income<=1000000) {
                taxPercentage=20;
                tax+=income*0.2;
            }else if(income>1000000){
                taxPercentage=30;
                tax+=income*0.3;
            }
            System.out.println(income+" "+tax+" "+taxPercentage);
        }


    }
}
