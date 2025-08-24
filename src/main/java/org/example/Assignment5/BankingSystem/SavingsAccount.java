package org.example.Assignment5.BankingSystem;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber, double starting) {
        super(accountNumber, starting);
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.01; // 1% for demo
        balance += interest;
        System.out.println("SavingsAccount: +1% interest");
    }
}
