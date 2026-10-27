package com.xworkz.ecommerce;

import com.xworkz.ecommerce.impl.EcommerceImpl;
import com.xworkz.ecommerce.product.Product;
import com.xworkz.hospital.doctor.Doctor;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Size:");
        int size = scanner.nextInt();

        Ecommerce ecommerce = new EcommerceImpl(size);

        for (int i=0; i<size;i++) {
            Product product = new Product();

            System.out.println("Enter the ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            product.id = id;

            System.out.println("Enter Product Name:");
            String productName = scanner.nextLine();
            product.productName = productName;

            System.out.println("Enter Price:");
            int price = scanner.nextInt();
            scanner.nextLine();
            product.price = price;

            System.out.println("Enter Manufacturing Date:");
            String mfgDate = scanner.nextLine();
            product.mfgDate = mfgDate;

            boolean isAdded = ecommerce.addProduct(product);

            if (isAdded) {
                System.out.println("Product added successfully.");
            } else {
                System.out.println("Product could not be added.");
            }
        }

        String yesOrNo;

        do{
            System.out.println("Enter 1 to fetch all the Products");
            System.out.println("Enter 2 to fetch product by its ID");
            System.out.println("Enter 3 to update Price by Product Name");

            int options = scanner.nextInt();
            scanner.nextLine();
            switch (options){

                case 1:
                    System.out.println("Here are the list of all the Products:");
                    ecommerce.getAllProducts();
                break;

                case 2:
                    System.out.println("Enter the ID from which product to be fetched:");
                    int Productid = scanner.nextInt();
                    scanner.nextLine();
                    Product product = ecommerce.getProductById(Productid);
                    System.out.println("Fetching product by its ID..");
                    System.out.println(product);
                break;

                case 3:
                    System.out.println("Enter the new Price:");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the product name:");
                    String Name = scanner.nextLine();
                    boolean isupdated = ecommerce.updatePriceByName(newPrice,Name);
                    System.out.println(isupdated);
                    System.out.println("price Updated based on name..");
                    break;

                default:
                    System.out.println("Please Do Enter The Correct Option..!");
            }

            System.out.println("Do You Want To Continue the Operations?, Enter (Y or N) ");
            yesOrNo = scanner.nextLine();
        }
        while (yesOrNo.equalsIgnoreCase("Y"));
        System.out.println("---Thank You----");

    }
}
