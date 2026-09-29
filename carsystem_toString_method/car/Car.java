package com.xworkz.carsystem_toString_method.car;

public class Car {

    public int carId;
    public String brand;
    public int price;
    public String color;
    public String model;


    // Overrides Object.toString()
    // Returns String representation of the Car object
    @Override
    public String toString() {

        // this → current Car object
        // Returns the values/state of the current object
        return "Car-(carId = " + this.carId + " , brand = " + this.brand +
                " , price = " + this.price + " , color = " + this.color +
                " , model = " + this.model + ")";
    }
}