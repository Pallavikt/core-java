package com.xworkz.customexception.checkedexception;

public class SpecializationNotFoundException extends Exception{

    public SpecializationNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
