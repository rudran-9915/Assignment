package org.example.Assignment7.ATMPinValidation;

public class ATM {
    private static final String VALID_PIN = "1234"; // change as needed


    public void validatePin(String enteredPin) throws InvalidPinException {
        if (enteredPin == null) {
            throw new InvalidPinException("PIN must be exactly 4 digits.");
        }

        String pin = enteredPin.trim();

        // Check length and digits
        if (!pin.matches("\\d{4}")) {
            throw new InvalidPinException("PIN must be exactly 4 digits.");
        }

        // Check correctness
        if (!pin.equals(VALID_PIN)) {
            throw new InvalidPinException("Incorrect PIN.");
        }

    }
}
