package com.xworkz.ecommerce;

import com.xworkz.ecommerce.product.Product;

public interface Ecommerce {

    boolean addProduct(Product product);
    void getAllProducts();
    Product getProductById(int id);
    boolean updatePriceByName(int newPrice, String name);
}
