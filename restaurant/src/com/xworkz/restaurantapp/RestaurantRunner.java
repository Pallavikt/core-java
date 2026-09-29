package com.xworkz.restaurantapp;

import com.xworkz.restaurantapp.restaurant.Restaurant;
import com.xworkz.restaurantapp.restaurant.chef.Chef;

public class RestaurantRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Restaurant restaurant = new Restaurant();

        restaurant.openRestaurant();
        restaurant.takeOrder();
        restaurant.prepareFood();
        restaurant.serveFood();
        restaurant.generateBill();


        Restaurant restaurant1 = new Chef();

        restaurant1.openRestaurant();
        restaurant1.takeOrder();
        restaurant1.prepareFood();
        restaurant1.serveFood();
        restaurant1.generateBill();


        Chef chef = new Chef();

        chef.openRestaurant();
        chef.takeOrder();
        chef.prepareFood();
        chef.serveFood();
        chef.generateBill();

        System.out.println("Main Ended");
    }
}