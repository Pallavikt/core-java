package com.xworkz.mobilesystem;

import com.xworkz.mobilesystem.mobile.Mobile;

public class MobileRunner {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.mobileId = 201;
        mobile.brand = "Samsung";
        mobile.price = 30000;
        mobile.model = "Galaxy A55";
        mobile.storage = 128;


        Mobile mobile1 = new Mobile();

        mobile1.mobileId = 201;
        mobile1.brand = "Samsung";
        mobile1.price = 30000;
        mobile1.model = "Galaxy A55";
        mobile1.storage = 128;


        boolean isEqual = mobile.equals(mobile1);

        System.out.println("Values in mobile and mobile1 are same: "+isEqual);
    }
}