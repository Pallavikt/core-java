package com.xworkz.bankapp;

import com.xworkz.bankapp.account.BankAccount;
import com.xworkz.bankapp.account.savings.SavingsAccount; // Fully Qualified Class Name(FQCN) or Qualified name of class

public class BankAccountRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        BankAccount account = new SavingsAccount();// Polymorphism/ Upcasting
        account.credit(10.0);

        SavingsAccount sa = (SavingsAccount)account; //downcasting
        sa.credit();

        CurrentAccount ca = (CurrentAccount)account;
        ca.credit();

        System.out.println("Main Ended");
    }
}