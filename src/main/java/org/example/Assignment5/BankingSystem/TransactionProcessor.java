package org.example.Assignment5.BankingSystem;

public class TransactionProcessor {
    private final java.util.Map<Integer, BankAccount> store = new java.util.HashMap<>();

    public TransactionProcessor() {
        // no-op; accounts are added externally in this small demo via BankAccount.register
    }

    // Overload #1: deposit (positive amount) or withdraw (negative amount)
    public void process(int accountNumber, double amount) {
        BankAccount acct = BankAccount.get(accountNumber);
        if (acct == null) { System.out.println("Account not found: " + accountNumber); return; }
        if (amount >= 0) { acct.deposit(amount); System.out.println("Deposited $" + amount + " to " + accountNumber); }
        else { boolean ok = acct.withdraw(-amount); System.out.println((ok ? "Withdrew $" + (-amount) : "Withdraw failed") + " from " + accountNumber); }
    }

    // Overload #2: transfer between accounts
    public void process(int fromAccount, int toAccount, double amount) {
        BankAccount src = BankAccount.get(fromAccount);
        BankAccount dst = BankAccount.get(toAccount);
        if (src == null || dst == null) { System.out.println("Transfer failed: account missing"); return; }
        if (src.withdraw(amount)) { dst.deposit(amount); System.out.println("Transferred $" + amount + " from " + fromAccount + " to " + toAccount); }
        else System.out.println("Transfer failed: insufficient funds");
    }
}
