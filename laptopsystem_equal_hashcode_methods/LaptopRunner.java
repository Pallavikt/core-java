package com.xworkz.laptopsystem_equal_hashcode_methods;

import com.xworkz.laptopsystem_equal_hashcode_methods.laptop.Laptop;

public class LaptopRunner {

    public static void main(String[] args) {

        // Object creation → new creates object in heap
        Laptop laptop = new Laptop();

        // Assigning state to first object
        laptop.laptopId = 101;
        laptop.brand = "Dell";
        laptop.price = 55000;
        laptop.processor = "Intel i5";
        laptop.ram = 16;


        // Creates a separate Laptop object
        Laptop laptop1 = new Laptop();

        // Assigning same state to second object
        laptop1.laptopId = 101;
        laptop1.brand = "Dell";
        laptop1.price = 55000;
        laptop1.processor = "Intel i5";
        laptop1.ram = 16;


        // Calls overridden hashCode()
        int hashCode = laptop.hashCode();
        System.out.println("Hash Code of Laptop: " + hashCode);


        // Same state → should produce same hash code
        int hashCode1 = laptop1.hashCode();
        System.out.println("Hash Code of Laptop: " + hashCode1);


        // Calls overridden equals()
        // equals() compares values, not reference identity
        boolean isEqual = laptop.equals(laptop1);

        System.out.println(
                "Values in laptop and laptop1 are same: " + isEqual
        );
    }
}