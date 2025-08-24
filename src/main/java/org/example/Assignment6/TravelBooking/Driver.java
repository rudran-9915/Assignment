package org.example.Assignment6.TravelBooking;


import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seats available: 1 to " + booking.totalSeats());
        System.out.print("Enter seat number to book: ");
        String input = scanner.nextLine();

        try {
            // May throw NumberFormatException
            int seatNumber = Integer.parseInt(input);

            // bookSeat will throw ArrayIndexOutOfBoundsException or IllegalStateException as required
            booking.bookSeat(seatNumber);
            System.out.println("Seat " + seatNumber + " successfully booked.");

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat number. Please choose a number between 1 and " + booking.totalSeats() + ".");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // message will indicate seat is already booked
        } finally {
            System.out.println("\nCurrent seat status:");
            booking.printSeatStatus();
            scanner.close();
        }
    }
}
