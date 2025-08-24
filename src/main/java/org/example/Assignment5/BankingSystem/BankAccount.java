package org.example.Assignment5.BankingSystem;

public abstract class BankAccount {
    private static final java.util.Map<Integer, BankAccount> registry = new java.util.HashMap<>();
    private final int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double starting) {
        this.accountNumber = accountNumber;
        this.balance = starting;
        registry.put(accountNumber, this);
    }

    public static BankAccount get(int acc) { return registry.get(acc); }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }

    public void deposit(double amt) { if (amt > 0) balance += amt; }
    public boolean withdraw(double amt) { if (amt > 0 && amt <= balance) { balance -= amt; return true; } return false; }


    public void calculateInterest() {
        System.out.println("Base account: no interest applied.");
    }
}
