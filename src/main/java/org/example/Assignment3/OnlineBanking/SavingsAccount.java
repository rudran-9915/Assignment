package org.example.Assignment3.OnlineBanking;

public class SavingsAccount extends BankAccount {
    private double interestRate;


    public SavingsAccount(int accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Interest Rate: " + interest);
        deposit(interest);
    }



}
