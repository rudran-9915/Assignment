package org.example.Assignment7.OnlineMovieTicketBooking;

public class TicketBooking {
    public void bookTickets(String movieName, int quantity) throws TicketLimitExceededException {
        System.out.printf("Booking %d tickets for %s...%n", quantity, movieName);
        if (quantity > 6) {
            throw new TicketLimitExceededException("Cannot book more than 6 tickets at once.");
        }
        System.out.println("Booking successful!");
    }
}
