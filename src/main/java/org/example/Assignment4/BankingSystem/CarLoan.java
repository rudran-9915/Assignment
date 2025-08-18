package org.example.Assignment4.BankingSystem;

public class CarLoan extends Loan implements ApprovalProcess{
    @Override
    public double calculateEMI(double principal, double rate, int tenureMonths) {
        double monthlyInterestRate = rate / 12.0 / 100.0 ;
        double factor = Math.pow(1+monthlyInterestRate, tenureMonths);
        return  ((principal * monthlyInterestRate * factor)/(factor-1));
    }

    @Override
    public void approveLoan() {
        System.out.println("Car Loan Approved");
    }
}
