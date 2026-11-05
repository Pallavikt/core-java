package com.xworkz.customexception.checkedexception;

public class StationsNotFoundException extends Exception {
    public StationsNotFoundException(String message) {
        super(message);
    }
}
