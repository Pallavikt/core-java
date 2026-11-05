package com.xworkz.customexception.uncheckedexception;

public class ProductsNotAvailableException extends RuntimeException {

    public ProductsNotAvailableException(String errorMessage){
        super(errorMessage);
    }
}
