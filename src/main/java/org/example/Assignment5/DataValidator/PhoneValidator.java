package org.example.Assignment5.DataValidator;

public class PhoneValidator implements DataValidatorInterface{
    @Override
    public boolean isValid(String input) {
        if (!DataValidatorInterface.isNotEmpty(input)) return false;
        String cleaned = input.replaceAll("[\\s()\\-\\.]", "");
        if (cleaned.startsWith("+")) cleaned = cleaned.substring(1);
        return cleaned.matches("\\d{7,15}");
    }
}
