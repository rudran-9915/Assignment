package org.example.Assignment5.DataValidator;

public class Driver {
    public static void main(String[] args) {
        String emailGood = "user@example.com";
        String emailBad = "";
        String phoneGood = "+91-9944048697";
        String phoneBad = "123";

        System.out.println("emailGood isNotEmpty: " + DataValidatorInterface.isNotEmpty(emailGood));
        System.out.println("emailBad isNotEmpty: " + DataValidatorInterface.isNotEmpty(emailBad));
        System.out.println();

        DataValidatorInterface emailValidator = new EmailValidator();
        DataValidatorInterface phoneValidator = new PhoneValidator();

        System.out.printf("%s -> email valid? %b%n", emailGood, emailValidator.isValid(emailGood));
        System.out.printf("empty string -> email valid? %b%n", emailValidator.isValid(emailBad));
        System.out.println();

        System.out.printf("%s -> phone valid? %b%n", phoneGood, phoneValidator.isValid(phoneGood));
        System.out.printf("%s -> phone valid? %b%n", phoneBad, phoneValidator.isValid(phoneBad));
    }
}
