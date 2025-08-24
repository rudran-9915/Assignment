package org.example.Assignment5.DataValidator;

import java.util.regex.Pattern;

public class EmailValidator implements DataValidatorInterface{
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    @Override
    public boolean isValid(String input) {
        if (!DataValidatorInterface.isNotEmpty(input)) return false;
        return EMAIL_PATTERN.matcher(input).matches();
    }
}
