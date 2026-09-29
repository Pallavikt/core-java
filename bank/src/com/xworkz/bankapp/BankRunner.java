package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.Bank;
import com.xworkz.bankapp.bank.loan.Loan;

public class BankRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        Bank bank = new Bank();

        bank.openAccount();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.checkBalance();
        bank.transferMoney();


        Bank bank1 = new Loan();

        bank1.openAccount();
        bank1.depositMoney();
        bank1.withdrawMoney();
        bank1.checkBalance();
        bank1.transferMoney();


        Loan loan = new Loan();

        loan.openAccount();
        loan.depositMoney();
        loan.withdrawMoney();
        loan.checkBalance();
        loan.transferMoney();

        System.out.println("Main Ended");
    }
}