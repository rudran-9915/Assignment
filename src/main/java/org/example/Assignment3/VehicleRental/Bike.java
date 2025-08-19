package org.example.Assignment3.VehicleRental;

public class Bike extends Vehicle {
    private int engineCapacity;

    public Bike(String brand, String registrationNumber, double rentalRate, int engineCapacity) {
        super(brand, registrationNumber, rentalRate);
        this.engineCapacity = engineCapacity;
    }
    public int getEngineCapacity() {
        return engineCapacity;
    }
}
