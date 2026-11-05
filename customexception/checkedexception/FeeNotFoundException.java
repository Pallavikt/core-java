package com.xworkz.customexception.checkedexception;

public class FeeNotFoundException extends Throwable{

    public FeeNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
