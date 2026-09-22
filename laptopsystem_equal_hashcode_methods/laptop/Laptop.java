package com.xworkz.laptopsystem_equal_hashcode_methods.laptop;

import java.util.Objects;

public class Laptop {

    public int laptopId;
    public String brand;
    public int price;
    public String processor;
    public int ram;

    // Every Java class directly or indirectly extends Object.
    // Object already contains:
    //
    // public boolean equals(Object obj)
    //
    // Therefore Laptop is overriding Object's equals() method.
    @Override
    public boolean equals(Object object) { // The parameter type is Object because Object is the
        // root parent class of all Java classes.
        // Therefore equals() can receive an object of any class.
        // Example:laptop.equals(laptop1);
        // laptop1 is automatically treated as an Object reference
        // because Laptop IS-A Object.
        // This is UPCASTING: Laptop -> Object
        // Object object = laptop1;

        Laptop laptop;
        laptop = (Laptop) object; // DOWNCASTING.

        // 'object' is an Object reference, but we know that the object
        // passed to equals() is expected to be a Laptop. So we convert:
        // Object reference -> Laptop reference. This is called DOWNCASTING.
        // Without downcasting, we cannot directly access:
        // object.laptopId
        // object.brand
        // object.price
        // etc.

        if (this.laptopId == laptop.laptopId &&
                this.brand.equals(laptop.brand) &&
                this.price == laptop.price &&
                this.processor.equals(laptop.processor) &&
                this.ram == laptop.ram) {// Downcasting → Object reference converted to Laptop
            // this → current object
            // == → compares primitive values
            // String.equals() → compares String contents
            // && → all conditions must be true

            return true;
        }

        return false;
    }

    @Override // Overrides Object.hashCode()
    // Equal objects must have the same hash code
    public int hashCode() {
        return Objects.hash(laptopId, brand, price, processor, ram);// Generates hash using the same fields as equals()
    }
}