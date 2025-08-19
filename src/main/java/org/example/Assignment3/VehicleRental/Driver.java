package org.example.Assignment3.VehicleRental;

public class Driver {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Ford","TN-01-1234",500.0,5);
        vehicles[1] = new Bike("Honda","TN-67-9915",150.0,100);
        vehicles[2] = new Truck("Tata","TN-84-8765",250.0,10.0);

        for (Vehicle vehicle : vehicles) {
            double rental = vehicle.calculateRental(7);
            System.out.println("Rental for " + vehicle.getBrand() + " with registration number " + vehicle.getRegistrationNumber() + ": $" + rental);
        }

    }
}
