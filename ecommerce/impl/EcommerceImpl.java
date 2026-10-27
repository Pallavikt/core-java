package com.xworkz.ecommerce.impl;

import com.xworkz.ecommerce.Ecommerce;
import com.xworkz.ecommerce.product.Product;

import java.util.Arrays;

public class EcommerceImpl implements Ecommerce {

    private Product[] products;
    private int index;

    public EcommerceImpl(int size){
        this.products = new Product[size];
    }

    @Override
    public boolean addProduct(Product product){
        boolean isAdded = false;
        boolean isIdValid = false;
        boolean isProductNameValid = false;
        boolean isPriceValid = false;
        boolean isMfgDateValid = false;

        int id = product.id;
        if(id >0 ){
            isIdValid = true;
        }else System.out.println("ID is Invalid..");

        String productName = product.productName;
        if (productName != null && !productName.isEmpty()){
            isProductNameValid = true;
        }else System.out.println("Name is Invalid..");

        int price = product.price;
        if(price >0 ){
            isPriceValid = true;
        }else System.out.println("Price is Invalid..");

        String mfgDate = product.mfgDate;
        if (mfgDate != null && !mfgDate.isEmpty()){
            isMfgDateValid = true;
        }else System.out.println("Manufacturing Date is Invalid..");

        if(isIdValid&&isProductNameValid&&isPriceValid&&isMfgDateValid){
            if (index < products.length) {
                products[index++] = product;
                isAdded = true;
            }else System.out.println("Product Array is Full!");
        }
        return isAdded;
    }

    @Override
    public void getAllProducts(){
        for (Product product : products){
            if (product != null){
                System.out.println(product);
            }
        }
    }

    @Override
    public Product getProductById(int id){
        Product product = null;
        for (Product product1 : products){
            if (id == product1.id){
                product = product1;
            }
        }
      return product;
    }

    @Override
    public boolean updatePriceByName(int newPrice, String name){
        boolean isUpdated = false;
        for (Product product: products){
            if (name.equals(product.productName)){
                product.setPrice(newPrice);
                isUpdated = true;
            }
        }
        return isUpdated;
    }
}
