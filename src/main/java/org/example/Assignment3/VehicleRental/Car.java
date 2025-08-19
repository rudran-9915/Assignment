package org.example.Assignment3.VehicleRental;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String brand, String registrationNumber, double rentalRate, int seatingCapacity) {
        super(brand, registrationNumber, rentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
