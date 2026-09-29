package com.xworkz.bakeryapp.condiment;

public class Condiment {

    private int condimentId;
    private String condimentName;
    private int price;
    private String brand;

    public int getCondimentId() {
        return condimentId;
    }

    public void setCondimentId(int condimentId) {
        this.condimentId = condimentId;
    }

    public String getCondimentName() {
        return condimentName;
    }

    public void setCondimentName(String condimentName) {
        this.condimentName = condimentName;
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
        return "Condiment(condimentId = " + this.condimentId + ", condimentName = " + this.condimentName +
                ", price = " + this.price + ", brand = " + this.brand + ")";
    }
}