package org.example.Assignment7.OnlineMovieTicketBooking;

public class Driver {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        // within limit
        try {
            booking.bookTickets("Avengers", 4);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(); // blank line for readability

        // exceeds limit
        try {
            booking.bookTickets("Oppenheimer", 7);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
