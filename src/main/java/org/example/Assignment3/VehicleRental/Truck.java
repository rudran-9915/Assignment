package org.example.Assignment3.VehicleRental;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String brand, String registrationNumber, double rentalRate, double loadCapacity) {
        super(brand, registrationNumber, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }
}
