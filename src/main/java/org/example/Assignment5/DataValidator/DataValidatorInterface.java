package org.example.Assignment5.DataValidator;

public interface DataValidatorInterface {
    static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
    boolean isValid(String input);
}
