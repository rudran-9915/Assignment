package org.example.Assignment5.BankingSystem;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(int accountNumber, double starting) {
        super(accountNumber, starting);
    }

    @Override
    public void calculateInterest() {
        if (balance > 100) {
            double interest = balance * 0.005; // 0.5% if balance > 100
            balance += interest;
            System.out.println("CurrentAccount: +0.5% interest");
        } else {
            System.out.println("CurrentAccount: no interest (balance too low)");
        }
    }
}
