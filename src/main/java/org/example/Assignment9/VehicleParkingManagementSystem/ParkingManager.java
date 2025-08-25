package org.example.Assignment9.VehicleParkingManagementSystem;
import java.util.*;
import java.util.stream.Collectors;

public class ParkingManager {
    public final Set<Vehicle> parkedVehicles = new HashSet<>();
    public final Map<ParkingSlot, Vehicle> parkingMap = new HashMap<>();

    // ---------------- CRUD ----------------


    public boolean parkVehicle(ParkingSlot slot, Vehicle vehicle) {
        if (slot == null || vehicle == null) throw new IllegalArgumentException("Slot and vehicle cannot be null");

        if (parkedVehicles.contains(vehicle)) {
            return false;
        }
        if (parkingMap.containsKey(slot)) {
            return false;
        }

        // add to both structures
        parkedVehicles.add(vehicle);
        parkingMap.put(slot, vehicle);
        return true;
    }

    public boolean removeVehicle(String plateNumber) {
        Vehicle v = findVehicleByPlate(plateNumber);
        if (v == null) return false;
        ParkingSlot slot = findSlotByVehicle(v);
        if (slot != null) parkingMap.remove(slot);
        parkedVehicles.remove(v);
        return true;
    }

    public boolean updateVehicleDetails(String plateNumber, String newOwnerName, String newType) {
        Vehicle v = findVehicleByPlate(plateNumber);
        if (v == null) return false;
        if (newOwnerName != null) v.setOwnerName(newOwnerName);
        if (newType != null) v.setType(newType);
        return true;
    }

    public List<Map.Entry<ParkingSlot, Vehicle>> viewAllOccupiedSlots() {
        return new ArrayList<>(parkingMap.entrySet());
    }

    // ---------------- Searching ----------------

    public ParkingSlot findSlotForVehicle(String plateNumber) {
        Vehicle v = findVehicleByPlate(plateNumber);
        if (v == null) return null;
        return findSlotByVehicle(v);
    }

    public List<Vehicle> findVehiclesByType(String type) {
        if (type == null) return Collections.emptyList();
        String t = type.trim().toLowerCase();
        return parkedVehicles.stream()
                .filter(v -> v.getType() != null && v.getType().toLowerCase().equals(t))
                .collect(Collectors.toList());
    }

    // ---------------- Sorting / Display ----------------

    public List<Vehicle> getVehiclesSortedByOwnerName() {
        return parkedVehicles.stream()
                .sorted(Comparator.comparing(v -> v.getOwnerName() == null ? "" : v.getOwnerName(), String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<ParkingSlot> getSlotsSortedBySlotId() {
        return parkingMap.keySet().stream()
                .sorted(Comparator.comparingInt(ParkingSlot::getSlotId))
                .collect(Collectors.toList());
    }

    // Helper Func
    public Vehicle findVehicleByPlate(String plateNumber) {
        if (plateNumber == null) return null;
        for (Vehicle v : parkedVehicles) {
            if (plateNumber.equals(v.getPlateNumber())) return v;
        }
        return null;
    }

    public ParkingSlot findSlotByVehicle(Vehicle vehicle) {
        for (Map.Entry<ParkingSlot, Vehicle> e : parkingMap.entrySet()) {
            if (e.getValue().equals(vehicle)) return e.getKey();
        }
        return null;
    }
}
