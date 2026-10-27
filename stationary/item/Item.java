package com.xworkz.stationary.item;

public class Item {

    public int id;
    public String itemName;
    public int price;
    public String mfgDate;
    public String expiryDate;


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", mfgDate='" + mfgDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }
}
