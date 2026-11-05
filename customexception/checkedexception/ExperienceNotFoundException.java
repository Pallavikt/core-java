package com.xworkz.customexception.checkedexception;

public class ExperienceNotFoundException extends Exception{
    public ExperienceNotFoundException(String errorMessage){
        super(errorMessage);
    }
}
