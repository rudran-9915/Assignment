package org.example.Assignment4.VehicleService;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car("Ford","F120");
        car.service();
        car.repair();
        Bike bike = new Bike("Yamaha","FZ");
        bike.service();
        bike.repair();

    }
}
