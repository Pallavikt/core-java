package com.xworkz.maxapp.cloth;

public class Cloth {

    // Encapsulation / Data Hiding:
    // private fields cannot be accessed directly outside this class.
    private int clothId;
    private String clothName;
    private int price;
    private String brand;

    // Getter → provides controlled access to read the private field.
    public int getClothId() {
        return clothId;
    }

    // Setter → provides controlled access to set/update the private field.
    // this.clothId → instance variable, clothId → method parameter.
    public void setClothId(int clothId) {
        this.clothId = clothId;
    }

    public String getClothName() {
        return clothName;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
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

    // Every Java class directly or indirectly extends Object.
    // Here we override Object's toString() method.
    @Override
    public String toString() {
        return "Cloth(clothId = " + this.clothId + ", clothName = " + this.clothName +
                ", price = " + this.price + ", brand = " + this.brand + ")";
    }
}