package org.example.Assignment5.BankingSystem;

public class Driver {
    public static void main(String[] args) {
        SecurityCheck.logAttempt("bob");


        SecurityCheck sec = new SimpleSecurity();
        sec.showSecurityStatus();                 // default method
        System.out.println("Verified: " + sec.verifyUser("bob", "1234"));
        System.out.println();


        BankAccount a1 = new SavingsAccount(1, 500.0);
        BankAccount a2 = new CurrentAccount(2, 50.0);


        TransactionProcessor tp = new TransactionProcessor();
        tp.process(1, 100.0);        // deposit to account 1
        tp.process(1, 2, 30.0);      // transfer from 1 to 2
        System.out.println();


        BankAccount[] accounts = { a1, a2 };
        for (BankAccount a : accounts) {
            System.out.printf("Account %d before: $%.2f%n", a.getAccountNumber(), a.getBalance());
            a.calculateInterest();
            System.out.printf("Account %d after:  $%.2f%n%n", a.getAccountNumber(), a.getBalance());
        }

    }
}
