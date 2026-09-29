package com.xworkz.productsystem.product;

import java.util.Objects;

// Encapsulated class
public class Product {

    private int productId;
    private String productName;
    private double price;
    private String brandName;
    private String modelNumber;
    private String partNumber;

    public Product(){

    }

    public void setProductId(int productId) { // setter(mutators)
        this.productId = productId;
    }

    public int getProductId() { //getter(accessors)

        return productId;
    }

    public void setProductName(String pName){
        productName = pName;
    }

    public String getProductName(){
        return productName;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){

        return price;
    }

    public void setBrandName(String brandName){

        this.brandName = brandName;
    }

    public String getBrandName(){

        return brandName;
    }

    public void setModelNumber(String modelNumber){

        this.modelNumber = modelNumber;
    }
    public String getModelNumber(){

        return modelNumber;
    }

    public void setPartNumber(String partNumber){

        this.partNumber = partNumber;
    }
    public String getPartNumber(){

        return partNumber;
    }

    //Overriding Object class methods


    @Override
    public String toString() {
        return "Product(productId = "+this.productId+",productName = "+this.productName+"," +
                "price = "+this.price+", brandName = "+this.brandName+",modelNumber = "+this.modelNumber+
                ",partNumber = "+this.partNumber+")";
    }

    @Override
    public boolean equals(Object obj) {
        Product product;
        product = (Product) obj;//downcasting
        if(this.productId == product.productId && this.productName.equals(product.productName)&&
                this.price == product.price&&
                this.brandName.equals(product.brandName)&&
                this.modelNumber.equals(product.modelNumber)&&
                this.partNumber.equals(product.partNumber)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId,productName,price,brandName,modelNumber,partNumber);
    }
}