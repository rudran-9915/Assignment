package org.example.Assignment7.OnlineMovieTicketBooking;

public class TicketLimitExceededException extends Exception {
    public TicketLimitExceededException(String message) {
        super(message);
    }
}
