package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.product.Product;

public class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        Product product = new Product();
        product.setProductId(1);
        product.setProductName("Samsung Galaxy S25 Ultra");
        product.setPrice(129999);
        product.setBrand("Samsung");
        amazon.addProduct(product);


        Product product1 = new Product();
        product1.setProductId(2);
        product1.setProductName("Apple iPhone 16 Pro");
        product1.setPrice(119900);
        product1.setBrand("Apple");
        amazon.addProduct(product1);


        Product product2 = new Product();
        product2.setProductId(3);
        product2.setProductName("Sony WH-1000XM5 Headphones");
        product2.setPrice(29990);
        product2.setBrand("Sony");
        amazon.addProduct(product2);


        Product product3 = new Product();
        product3.setProductId(4);
        product3.setProductName("Dell Inspiron Laptop");
        product3.setPrice(58990);
        product3.setBrand("Dell");
        amazon.addProduct(product3);


        Product product4 = new Product();
        product4.setProductId(5);
        product4.setProductName("HP Pavilion Laptop");
        product4.setPrice(67999);
        product4.setBrand("HP");
        amazon.addProduct(product4);


        Product product5 = new Product();
        product5.setProductId(6);
        product5.setProductName("Logitech Wireless Mouse");
        product5.setPrice(1499);
        product5.setBrand("Logitech");
        amazon.addProduct(product5);


        Product product6 = new Product();
        product6.setProductId(7);
        product6.setProductName("JBL Bluetooth Speaker");
        product6.setPrice(3999);
        product6.setBrand("JBL");
        amazon.addProduct(product6);


        Product product7 = new Product();
        product7.setProductId(8);
        product7.setProductName("OnePlus Buds Pro");
        product7.setPrice(9999);
        product7.setBrand("OnePlus");
        amazon.addProduct(product7);


        Product product8 = new Product();
        product8.setProductId(9);
        product8.setProductName("Canon EOS Camera");
        product8.setPrice(74999);
        product8.setBrand("Canon");
        amazon.addProduct(product8);


        Product product9 = new Product();
        product9.setProductId(10);
        product9.setProductName("Lenovo IdeaPad Slim");
        product9.setPrice(54990);
        product9.setBrand("Lenovo");
        amazon.addProduct(product9);


        Product product10 = new Product();
        product10.setProductId(11);
        product10.setProductName("Boat Smart Watch");
        product10.setPrice(2999);
        product10.setBrand("Boat");
        amazon.addProduct(product10);


        Product product11 = new Product();
        product11.setProductId(12);
        product11.setProductName("Philips Hair Dryer");
        product11.setPrice(1899);
        product11.setBrand("Philips");
        amazon.addProduct(product11);


        Product product12 = new Product();
        product12.setProductId(13);
        product12.setProductName("Prestige Induction Cooktop");
        product12.setPrice(3499);
        product12.setBrand("Prestige");
        amazon.addProduct(product12);


        Product product13 = new Product();
        product13.setProductId(14);
        product13.setProductName("Nike Running Shoes");
        product13.setPrice(5995);
        product13.setBrand("Nike");
        amazon.addProduct(product13);


        Product product14 = new Product();
        product14.setProductId(15);
        product14.setProductName("Adidas Sports Backpack");
        product14.setPrice(2499);
        product14.setBrand("Adidas");
        amazon.addProduct(product14);


        Product product15 = new Product();
        product15.setProductId(16);
        product15.setProductName("Fastrack Analog Watch");
        product15.setPrice(2795);
        product15.setBrand("Fastrack");
        amazon.addProduct(product15);


        Product product16 = new Product();
        product16.setProductId(17);
        product16.setProductName("Wildcraft Travel Bag");
        product16.setPrice(3299);
        product16.setBrand("Wildcraft");
        amazon.addProduct(product16);


        Product product17 = new Product();
        product17.setProductId(18);
        product17.setProductName("Puma Casual Shoes");
        product17.setPrice(4499);
        product17.setBrand("Puma");
        amazon.addProduct(product17);


        Product product18 = new Product();
        product18.setProductId(19);
        product18.setProductName("Milton Thermosteel Bottle");
        product18.setPrice(1299);
        product18.setBrand("Milton");
        amazon.addProduct(product18);


        Product product19 = new Product();
        product19.setProductId(20);
        product19.setProductName("American Tourister Suitcase");
        product19.setPrice(5499);
        product19.setBrand("American Tourister");
        amazon.addProduct(product19);

        amazon.getAllProducts();
    }
}
