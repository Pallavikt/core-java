package com.xworkz.stationary;

import com.xworkz.stationary.impl.StationaryImpl;
import com.xworkz.stationary.item.Item;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Item Size:");
        int size = scanner.nextInt();

        Stationary stationary = new StationaryImpl(size);
        Item item = new Item();

        for (int i=0; i<size; i++){

            System.out.println("Enter ID:");
            int id = scanner.nextInt();
            scanner.nextLine();
            item.id = id;

            System.out.println("Enter Item Name:");
            String itemName = scanner.nextLine();
            item.itemName = itemName;

            System.out.println("Enter Price:");
            int price = scanner.nextInt();
            scanner.nextLine();
            item.price = price;

            System.out.println("Enter Manufacturing Date:");
            String mfgDate = scanner.nextLine();
            item.mfgDate = mfgDate;

            System.out.println("Enter Expiry Date:");
            String expDate = scanner.nextLine();
            item.expiryDate = expDate;

           boolean added =  stationary.addItem(item);
           if (added){
               System.out.println("Item Added Successfully.");
           }else System.out.println("Item can not be added!");
        }

        String yesOrNo;

        do{
            System.out.println("Enter 1 to fetch all the Items");
            System.out.println("Enter 2 to fetch Item based on ID");
            System.out.println("Enter 3 to update Price based on ID");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){

                case 1:
                    System.out.println("Here are the list of all Items:");
                    stationary.getAllItems();
                    break;

                case 2:
                    System.out.println("Fetching Item based on ID..");
                    System.out.println("Enter the Id from which item to be fetched:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    stationary.getItemById(id);
                    break;

                case 3:
                    System.out.println("Updating Price based on ID..");
                    System.out.println("Enter the price to be updated to:");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the ID:");
                    int productId = scanner.nextInt();
                    scanner.nextLine();
                    stationary.updatePriceById(newPrice,productId);
                    break;

                default:
                    System.out.println("Please Enter the correct option.");
            }
            System.out.println("Do you want to continue? Enter (Y or N)");
            yesOrNo = scanner.nextLine();

        }while (yesOrNo.equalsIgnoreCase("y"));
        System.out.println("---Thank You---");
    }
}
