package com.xworkz.ecommerce.product;

public class Product {

    public int id;
    public String productName;
    public int price;
    public String mfgDate;

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", mfgDate='" + mfgDate + '\'' +
                '}';
    }
}
