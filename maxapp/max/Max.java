package com.xworkz.maxapp.max;

import com.xworkz.maxapp.cloth.Cloth;

public class Max {

    // Has-A relationship:
    // Max HAS-A collection of Cloth objects.
    // This creates an array that can store references of 24 Cloth objects.
    private Cloth[] cloths = new Cloth[24];

    // Instance variable gets default value 0.
    // Used to track the next available array position.
    int index;

    // Abstraction:
    // Caller only uses addCloth() without knowing how validation
    // and storing are performed internally.
    public boolean addCloth(Cloth cloth) {

        // Local variables used to track validation results.
        boolean isAdded = false;
        boolean isClothIdValid = false;
        boolean isClothNameValid = false;
        boolean isPriceValid = false;
        boolean isBrandValid = false;

        // Getter is used to access private data of Cloth.
        int clothId = cloth.getClothId();

        if (clothId > 0) {
            isClothIdValid = true;
        } else {
            System.out.println("Cloth Id is Invalid");
        }

        String clothName = cloth.getClothName();

        // && → both conditions must be true.
        // Short-circuit evaluation prevents isEmpty() from being
        // called when clothName is null.
        if (clothName != null && !clothName.isEmpty()) {
            isClothNameValid = true;
        } else {
            System.out.println("Cloth Name is Invalid");
        }

        int price = cloth.getPrice();

        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        String brand = cloth.getBrand();

        if (brand != null && !brand.isEmpty()) {
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        // Object is stored only when all validations are successful.
        if (isClothIdValid && isClothNameValid &&
                isPriceValid && isBrandValid) {

            // Stores Cloth reference at current index.
            // index++ → post-increment: use current value, then increment.
            cloths[index++] = cloth;
            isAdded = true;
        }

        // true → successfully added, false → validation failed.
        return isAdded;
    }

    public void getAllCloths() {

        // Enhanced for-loop / for-each loop:
        // Iterates through every Cloth reference in the array.
        for (Cloth cloth : cloths) {

            // println(object) internally calls the overridden toString().
            System.out.println(cloth);
        }
    }
}