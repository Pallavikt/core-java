package com.xworkz.customexception.ecommerce;

public interface Ecommerce {

    boolean addProduct(Product product);
    void getAllProducts();
    Product getProductById(int id);
    boolean updatePriceByName(int newPrice, String name);
}

