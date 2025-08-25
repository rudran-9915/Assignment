package org.example.Assignment9.VehicleParkingManagementSystem;

public class Driver {
    public static void main(String[] args) {
        ParkingManager mgr = new ParkingManager();

        ParkingSlot s1 = new ParkingSlot(1, "Level 1 - A1");
        ParkingSlot s2 = new ParkingSlot(2, "Level 1 - A2");
        ParkingSlot s3 = new ParkingSlot(3, "Level 2 - B1");

        Vehicle v1 = new Vehicle("ABC-123", "John Doe", "SUV");
        Vehicle v2 = new Vehicle("XYZ-999", "Alice Smith", "Bike");
        Vehicle v3 = new Vehicle("LMN-456", "Bob Brown", "SUV");

        System.out.println("Park v1 in s1: " + mgr.parkVehicle(s1, v1)); // true
        System.out.println("Park v2 in s2: " + mgr.parkVehicle(s2, v2)); // true
        System.out.println("Attempt park v1 in s3 (already parked): " + mgr.parkVehicle(s3, v1)); // false
        System.out.println("Attempt park v3 in s2 (slot occupied): " + mgr.parkVehicle(s2, v3)); // false
        System.out.println("Park v3 in s3: " + mgr.parkVehicle(s3, v3)); // true

        System.out.println("\nAll occupied slots:");
        mgr.viewAllOccupiedSlots().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));

        System.out.println("\nFind slot for ABC-123: " + mgr.findSlotForVehicle("ABC-123"));
        System.out.println("Find slot for UNKNOWN: " + mgr.findSlotForVehicle("UNKNOWN"));

        System.out.println("\nAll SUVs:");
        mgr.findVehiclesByType("SUV").forEach(System.out::println);

        System.out.println("\nVehicles sorted by owner name:");
        mgr.getVehiclesSortedByOwnerName().forEach(System.out::println);

        System.out.println("\nSlots sorted by slotId:");
        mgr.getSlotsSortedBySlotId().forEach(System.out::println);

        System.out.println("\nUpdate owner of ABC-123 -> 'John X': " + mgr.updateVehicleDetails("ABC-123", "John X", null));
        System.out.println("Updated vehicle: " + mgr.findVehicleByPlate("ABC-123"));

        System.out.println("\nRemove vehicle XYZ-999: " + mgr.removeVehicle("XYZ-999"));
        System.out.println("After removal, occupied slots:");
        mgr.viewAllOccupiedSlots().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
