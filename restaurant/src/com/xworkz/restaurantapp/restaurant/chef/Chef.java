package com.xworkz.restaurantapp.restaurant.chef;

import com.xworkz.restaurantapp.restaurant.Restaurant;

public class Chef extends Restaurant {

    @Override
    public void openRestaurant() {
        System.out.println("Chef Opening Restaurant");
    }

    @Override
    public void takeOrder() {
        System.out.println("Chef Taking Order");
    }

    @Override
    public void prepareFood() {
        System.out.println("Chef Preparing Food");
    }

    @Override
    public void serveFood() {
        System.out.println("Chef Serving Food");
    }

    @Override
    public void generateBill() {
        System.out.println("Chef Generating Bill");
    }

    @Override
    public void acceptPayment() {
        System.out.println("Chef Accepting Payment");
    }

    @Override
    public void cleanTable() {
        System.out.println("Chef Cleaning Table");
    }

    @Override
    public void reserveTable() {
        System.out.println("Chef Reserving Table");
    }

    @Override
    public void closeRestaurant() {
        System.out.println("Chef Closing Restaurant");
    }
}