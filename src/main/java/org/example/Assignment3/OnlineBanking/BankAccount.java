package org.example.Assignment3.OnlineBanking;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited " + amount + " to " + ownerName);

        }else{
            System.out.println("Cannot deposit , Please try again");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn " + amount + " to " + ownerName);
        }else{
            System.out.println("Cannot withdraw , Please try again");
        }
    }
}
