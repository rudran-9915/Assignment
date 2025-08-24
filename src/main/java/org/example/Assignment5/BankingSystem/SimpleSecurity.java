package org.example.Assignment5.BankingSystem;

public class SimpleSecurity implements SecurityCheck{

    @Override
    public boolean verifyUser(String username, String password) {
        boolean ok = "bob".equals(username) && "1234".equals(password);
        System.out.println("SimpleSecurity: " + (ok ? "OK" : "NOT OK"));
        return ok;
    }
}
