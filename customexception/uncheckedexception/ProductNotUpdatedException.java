package com.xworkz.customexception.uncheckedexception;

public class ProductNotUpdatedException extends RuntimeException{

    public ProductNotUpdatedException(String errorMessage){
        super(errorMessage);
    }
}
