package org.example.Assignment6.TravelBooking;

public class FlightBooking {
    private final boolean[] seats = new boolean[5];

    public void bookSeat(int seatNumber) {
        int index = seatNumber - 1; // convert to 0-based index
        if (index < 0 || index >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("Seat number out of range: " + seatNumber);
        }
        if (seats[index]) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
        }
        seats[index] = true;
    }

    public int totalSeats() {
        return seats.length;
    }

    public void printSeatStatus() {
        for (int i = 0; i < seats.length; i++) {
            String status = seats[i] ? "Booked" : "Available";
            System.out.println("Seat " + (i + 1) + ": " + status);
        }
    }
}

