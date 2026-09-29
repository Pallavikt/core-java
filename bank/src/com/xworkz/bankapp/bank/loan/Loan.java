package com.xworkz.bankapp.bank.loan;

import com.xworkz.bankapp.bank.Bank;

public class Loan extends Bank {

    @Override
    public void openAccount() {
        System.out.println("Loan Opening Account");
    }

    @Override
    public void depositMoney() {
        System.out.println("Loan Depositing Money");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Loan Withdrawing Money");
    }

    @Override
    public void checkBalance() {
        System.out.println("Loan Checking Balance");
    }

    @Override
    public void transferMoney() {
        System.out.println("Loan Transferring Money");
    }

    @Override
    public void updateDetails() {
        System.out.println("Loan Updating Details");
    }

    @Override
    public void checkStatement() {
        System.out.println("Loan Checking Statement");
    }

    @Override
    public void closeAccount() {
        System.out.println("Loan Closing Account");
    }

    @Override
    public void customerSupport() {
        System.out.println("Loan Providing Customer Support");
    }
}