package com.xworkz.productsystem;

import com.xworkz.productsystem.product.Product;

public class ProductRunner {

    public static void main(String[] args) {

        Product product = new Product();

        product.setProductId(1);
        int pId = product.getProductId();
        System.out.println(pId);

        product.setProductName("Graff Diamonds Hallucination Watch");
        String pName = product.getProductName();
        System.out.println(pName);

        product.setPrice(55000000);
        double price = product.getPrice();
        System.out.println(price);

        product.setBrandName("Graff");
        String bName = product.getBrandName();
        System.out.println(bName);

        product.setModelNumber("Hallucination");
        String mName = product.getModelNumber();
        System.out.println(mName);

        product.setPartNumber("GH-HAL-01");
        String pNumber = product.getPartNumber();
        System.out.println(pNumber);
        System.out.println("______________________");

        Product product1 = new Product();

        product1.setProductId(2);
        int pId1 = product1.getProductId();
        System.out.println(pId1);

        product1.setProductName("1962 Ferrari 250 GTO Berlinetta");
        String pName1 = product1.getProductName();
        System.out.println(pName1);

        product1.setPrice(48400000);
        double price1 = product1.getPrice();
        System.out.println(price1);

        product1.setBrandName("Ferrari");
        String bName1 = product1.getBrandName();
        System.out.println(bName1);

        product1.setModelNumber("250 GTO");
        String mName1 = product1.getModelNumber();
        System.out.println(mName1);

        product1.setPartNumber("Chassis #3413GT");
        String pNumber1 = product1.getPartNumber();
        System.out.println(pNumber1);
        System.out.println("______________________");

        Product product2 = new Product();

        product2.setProductId(3);
        int pId2 = product2.getProductId();
        System.out.println(pId2);

        product2.setProductName("Bugatti La Voiture Noire");
        String pName2 = product2.getProductName();
        System.out.println(pName2);

        product2.setPrice(18700000);
        double price2 = product2.getPrice();
        System.out.println(price2);

        product2.setBrandName("Bugatti");
        String bName2 = product2.getBrandName();
        System.out.println(bName2);

        product2.setModelNumber("La Voiture Noire");
        String mName2 = product2.getModelNumber();
        System.out.println(mName2);

        product2.setPartNumber("BG-LVN-2019");
        String pNumber2 = product2.getPartNumber();
        System.out.println(pNumber2);
        System.out.println("______________________");

        Product product3 = new Product();

        product3.setProductId(4);
        int pId3 = product3.getProductId();
        System.out.println(pId3);

        product3.setProductName("Falcon Supernova iPhone 6 Pink Diamond");
        String pName3 = product3.getProductName();
        System.out.println(pName3);

        product3.setPrice(48500000);
        double price3 = product3.getPrice();
        System.out.println(price3);

        product3.setBrandName("Falcon");
        String bName3 = product3.getBrandName();
        System.out.println(bName3);

        product3.setModelNumber("Supernova iPhone 6");
        String mName3 = product3.getModelNumber();
        System.out.println(mName3);

        product3.setPartNumber("FL-IP6-PINK");
        String pNumber3 = product3.getPartNumber();
        System.out.println(pNumber3);
        System.out.println("______________________");

        Product product4 = new Product();

        product4.setProductId(5);
        int pId4 = product4.getProductId();
        System.out.println(pId4);

        product4.setProductName("The Card Players (Painting)");
        String pName4 = product4.getProductName();
        System.out.println(pName4);

        product4.setPrice(250000000);
        double price4 = product4.getPrice();
        System.out.println(price4);

        product4.setBrandName("Paul Cézanne");
        String bName4 = product4.getBrandName();
        System.out.println(bName4);

        product4.setModelNumber("N/A");
        String mName4 = product4.getModelNumber();
        System.out.println(mName4);

        product4.setPartNumber("CP-1892-OIL");
        String pNumber4 = product4.getPartNumber();
        System.out.println(pNumber4);

        // print the outputs of overrided toString method
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        //prints the output of overrided equals method
        System.out.println(product.equals(product1));
        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));
        System.out.println(product3.equals(product4));

        //prints the output of overrided hashCode method
        System.out.println(product.hashCode());
        System.out.println(product1.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product3.hashCode());
        System.out.println(product4.hashCode());
    }
}