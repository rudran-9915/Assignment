package org.example.Assignment3.OnlineBanking;

public class Driver {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(12345,1000.0,"Kaliraj",5.0);
        System.out.println("Savings Account " + savingsAccount.getAccountNumber() + " - Owner: " + savingsAccount.getOwnerName() + ", Balance: $" + String.format("%.2f", savingsAccount.getBalance()));
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.calculateInterest();

        CurrentAccount currentAccount = new CurrentAccount(67890,500.0,"Karan",1000.0);
        System.out.println("\nCurrent Account " + currentAccount.getAccountNumber() + " - Owner: " + currentAccount.getOwnerName() + ", Balance: $" + String.format("%.2f", currentAccount.getBalance()));
        currentAccount.deposit(200.0);
        currentAccount.withdraw(800.0);
        currentAccount.withdraw(200.0);
    }
}
