package org.example.Assignment3.OnlineBanking;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, String ownerName, double overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= getBalance() + overdraftLimit){
            super.withdraw(amount);
        }else{
            System.out.println("Invalid withdrawal amount , please try again");
        }
    }
}
