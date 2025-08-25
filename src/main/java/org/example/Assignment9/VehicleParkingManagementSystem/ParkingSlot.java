package org.example.Assignment9.VehicleParkingManagementSystem;

import java.util.Objects;

public class ParkingSlot {
    private final int slotId;    // unique identifier for the slot
    private String location;     // optional descriptive location (e.g., "Level 1 - A3")

    public ParkingSlot(int slotId, String location) {
        this.slotId = slotId;
        this.location = location;
    }

    public int getSlotId() { return slotId; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingSlot)) return false;
        ParkingSlot other = (ParkingSlot) o;
        return slotId == other.slotId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(slotId);
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "slotId=" + slotId +
                ", location='" + location + '\'' +
                '}';
    }
}
