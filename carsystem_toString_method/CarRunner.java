package com.xworkz.carsystem_toString_method;

import com.xworkz.carsystem_toString_method.car.Car;

public class CarRunner {

    public static void main(String[] args) {

        // Object creation
        Car car = new Car();

        // Assigning state to first object
        car.carId = 301;
        car.brand = "Toyota";
        car.price = 1200000;
        car.color = "White";
        car.model = "Urban Cruiser";


        // Creating second Car object
        Car car1 = new Car();

        // Assigning state to second object
        car1.carId = 301;
        car1.brand = "Toyota";
        car1.price = 1200000;
        car1.color = "White";
        car1.model = "Urban Cruiser";


        // Calls overridden toString() automatically
        System.out.println(car);

        // Calls toString() automatically
        System.out.println(car1);
    }
}