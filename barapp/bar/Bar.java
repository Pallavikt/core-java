package com.xworkz.barapp.bar;

import com.xworkz.barapp.alcohol.Alcohol;

public class Bar {

    private Alcohol[] alcohols = new Alcohol[18];
    int index;

    public boolean addAlcohol(Alcohol alcohol) {

        boolean isAdded = false;
        boolean isAlcoholIdValid = false;
        boolean isAlcoholNameValid = false;
        boolean isPriceValid = false;
        boolean isBrandValid = false;

        int alcoholId = alcohol.getAlcoholId();

        if (alcoholId > 0) {
            isAlcoholIdValid = true;
        } else {
            System.out.println("Alcohol Id is Invalid");
        }

        String alcoholName = alcohol.getAlcoholName();

        if (alcoholName != null && !alcoholName.isEmpty()) {
            isAlcoholNameValid = true;
        } else {
            System.out.println("Alcohol Name is Invalid");
        }

        int price = alcohol.getPrice();

        if (price > 0) {
            isPriceValid = true;
        } else {
            System.out.println("Price is Invalid");
        }

        String brand = alcohol.getBrand();

        if (brand != null && !brand.isEmpty()) {
            isBrandValid = true;
        } else {
            System.out.println("Brand is Invalid");
        }

        if (isAlcoholIdValid && isAlcoholNameValid && isPriceValid && isBrandValid) {

            alcohols[index++] = alcohol;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllAlcohols() {

        for (Alcohol alcohol : alcohols) {
            System.out.println(alcohol);
        }
    }
}