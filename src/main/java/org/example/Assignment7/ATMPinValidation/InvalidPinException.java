package org.example.Assignment7.ATMPinValidation;

public class InvalidPinException extends Exception{
    public InvalidPinException(String message){
        super(message);
    }
}
