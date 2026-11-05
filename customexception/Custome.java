package com.xworkz.customexception;

public class Custome {

    public static void main(String[] args) {
        int balance = 500;
        int withdrawalAmount = 1000;

        try {
            if (withdrawalAmount > balance) {
                CustomeException customeException = new CustomeException("Insufficient balance for this transaction!");
                throw  customeException;
            }
        } catch (CustomeException e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}
