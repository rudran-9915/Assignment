package org.example.Assignment4.BankingSystem;

public class Driver {
    public static void main(String[] args) {
        HomeLoan homeLoan = new HomeLoan();
        double homeEMI = Math.round(homeLoan.calculateEMI(50000,7.71,48));
        System.out.println("Home Loan EMI for $50000 is $"+homeEMI+"/month");
        homeLoan.approveLoan();

        CarLoan carLoan = new CarLoan();
        double carEMI = Math.round(carLoan.calculateEMI(20000,12.40,60));
        System.out.println("Car Loan EMI for $20000 is $"+carEMI+"/month");
        carLoan.approveLoan();
    }
}
