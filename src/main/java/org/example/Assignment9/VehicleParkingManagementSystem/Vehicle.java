package org.example.Assignment9.VehicleParkingManagementSystem;

import java.util.Objects;

public class Vehicle {
    private final String plateNumber; // unique id used for equality
    private String ownerName;
    private String type; // e.g., "SUV", "Car", "Bike", etc.

    public Vehicle(String plateNumber, String ownerName, String type) {
        if (plateNumber == null) throw new IllegalArgumentException("plateNumber cannot be null");
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        this.type = type;
    }

    public String getPlateNumber() { return plateNumber; }
    public String getOwnerName() { return ownerName; }
    public String getType() { return type; }

    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setType(String type) { this.type = type; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) o;
        return plateNumber.equals(v.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
