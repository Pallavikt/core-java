package com.xworkz.customexception.ecommerce;

import com.xworkz.customexception.uncheckedexception.ProductNotFoundException;
import com.xworkz.customexception.uncheckedexception.ProductNotUpdatedException;
import com.xworkz.customexception.uncheckedexception.ProductsNotAvailableException;

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
    public void getAllProducts() {
        try {
            for (Product product : products) {
                if (product != null) {
                    System.out.println(product);
                }
            }

        if (products.length == 0) {

            throw new ProductsNotAvailableException("Sorry no products available..");
        }
    }catch (ProductsNotAvailableException pna){
            pna.printStackTrace();
        }
    }

    @Override
    public Product getProductById(int id){
        Product product = null;
        try {
            for (Product product1 : products) {
                if (id == product1.id) {
                    product = product1;
                }
            }
            if (product == null) {
                ProductNotFoundException exception = new ProductNotFoundException("Sorry.. Product is not Available!");
                throw exception;
            }
        }catch (ProductNotFoundException pnf){
            pnf.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean updatePriceByName(int newPrice, String name){
        boolean isUpdated = false;
        try {
            for (Product product : products) {
                if (name.equals(product.productName)) {
                    product.setPrice(newPrice);
                    isUpdated = true;
                }
            }
            if (isUpdated == false) {
                ProductNotUpdatedException exception = new ProductNotUpdatedException("Sorry.. Product is not Updated");
                throw exception;
            }
        }catch (ProductNotUpdatedException pnu){
            pnu.printStackTrace();
        }
        return isUpdated;
    }
}

