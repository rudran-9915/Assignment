package org.example.Assignment5.BankingSystem;

public interface SecurityCheck {
    static void logAttempt(String user) { System.out.println("[LOG] Attempt by " + user); }
    default void showSecurityStatus() { System.out.println("Secure connection established"); }
    boolean verifyUser(String username, String password);
}
