package com.xworkz.bakeryapp.bakery;

import com.xworkz.bakeryapp.condiment.Condiment;

public class Bakery {

    private Condiment[] condiments = new Condiment[17];
    int index;

    public boolean addCondiment(Condiment condiment) {

        boolean isAdded = false;
        boolean isCondimentIdValid = false;
        boolean isCondimentNameValid = false;
        boolean isPriceValid = false;
        boolean isBrandValid = false;

        int condimentId = condiment.getCondimentId();

        if (condimentId > 0) {
            isCondimentIdValid = true;
        } else {
            System.out.println("Condiment Id is Invalid");
        }

        String condimentName = condiment.getCondimentName();

        if (condimentName != null && !condimentName.isEmpty()) {
            isCondimentNameValid = true;
        } else {
            System.out.println("Condiment Name is Invalid");
        }

        int price = condiment.getPrice();

        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        String brand = condiment.getBrand();

        if (brand != null && !brand.isEmpty()) {
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (isCondimentIdValid && isCondimentNameValid &&
                isPriceValid && isBrandValid) {

            condiments[index++] = condiment;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllCondiments() {

        for (Condiment condiment : condiments) {
            System.out.println(condiment);
        }
    }
}