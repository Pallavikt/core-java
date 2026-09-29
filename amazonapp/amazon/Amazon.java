package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.product.Product;

public class Amazon {

    private Product[] products = new Product[25];
    int index;

    public boolean addProduct(Product product){

        boolean isAdded = false;
     boolean isProductIdValid = false;
     boolean isProductNameValid = false;
     boolean isPriceValid = false;
     boolean isBrandValid = false;

     int productId = product.getProductId();
        if(productId>0){
            isProductIdValid = true;
        }else System.out.println("Product Id in Invalid");

        String productName = product.getProductName();
        if(productName!= null && !productName.isEmpty()){
            isProductNameValid = true;
        }else System.out.println("Product name is Invalid");

        int price = product.getPrice();
        if(price > 0){
            isPriceValid = true;
        }else System.out.println("Price is Invalid");

        String brand = product.getBrand();
        if(brand!= null && !brand.isEmpty()){
            isBrandValid = true;
        }else System.out.println("Brand Name is Invalid");

        if(isProductIdValid && isProductNameValid && isPriceValid && isBrandValid ){
            products[index++] = product;
            isAdded = true;
        }

        return isAdded;
    }

    public void getAllProducts(){
        for(Product product:products){
            System.out.println(product);

        }
    }
}
