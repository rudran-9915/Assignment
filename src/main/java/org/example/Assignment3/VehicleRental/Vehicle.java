package org.example.Assignment3.VehicleRental;

public class Vehicle {
    private String brand;
    private String registrationNumber;
    private double rentalRate;

    public Vehicle(String brand, String registrationNumber, double rentalRate) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
        this.rentalRate = rentalRate;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public double calculateRental(int days){
        return rentalRate * days;
    }
}
