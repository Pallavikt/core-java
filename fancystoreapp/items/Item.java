package com.xworkz.fancystoreapp.items;

public class Item {

    private int itemId;
    private String itemName;
    private int price;
    private String brand;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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
        return "Item(itemId = " + this.itemId + ", itemName = " + this.itemName +
                ", price = " + this.price + ", brand = " + this.brand + ")";
    }
}