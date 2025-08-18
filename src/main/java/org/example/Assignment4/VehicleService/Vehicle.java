package org.example.Assignment4.VehicleService;

public abstract class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void service();
}
