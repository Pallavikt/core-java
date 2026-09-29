package com.xworkz.barapp.alcohol;

public class Alcohol {

    private int alcoholId;
    private String alcoholName;
    private int price;
    private String brand;

    public int getAlcoholId() {
        return alcoholId;
    }

    public void setAlcoholId(int alcoholId) {
        this.alcoholId = alcoholId;
    }

    public String getAlcoholName() {
        return alcoholName;
    }

    public void setAlcoholName(String alcoholName) {
        this.alcoholName = alcoholName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Alcohol(alcoholId = " + this.alcoholId + ", alcoholName = " + this.alcoholName +
                ", price = " + this.price + ", brand = " + this.brand + ")";
    }
}