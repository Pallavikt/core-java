package com.xworkz.customexception.checkedexception;

public class DoctorNotFoundException extends Exception{
    public DoctorNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
