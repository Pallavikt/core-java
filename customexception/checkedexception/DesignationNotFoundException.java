package com.xworkz.customexception.checkedexception;

public class DesignationNotFoundException extends Exception{

    public DesignationNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
