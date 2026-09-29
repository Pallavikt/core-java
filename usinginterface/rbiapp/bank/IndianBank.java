package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class IndianBank implements Rbi {

    @Override
    public boolean kyc() {
        System.out.println("KYC completed in Indian Bank");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in Indian Bank");
        return 91234567890L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in Indian Bank");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in Indian Bank");
        return 110000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from Indian Bank");
        return 40000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from Indian Bank");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in Indian Bank");
        return 70000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in Indian Bank");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in Indian Bank");
        return 40000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by Indian Bank");
        return "Indian Bank Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by Indian Bank");
        return "Indian Bank Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by Indian Bank");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by Indian Bank");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in Indian Bank");
        return 4567;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in Indian Bank");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in Indian Bank");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in Indian Bank");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in Indian Bank");
        return "indianbank@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by Indian Bank");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by Indian Bank");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in Indian Bank");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in Indian Bank");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in Indian Bank");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in Indian Bank");
        return 550000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by Indian Bank");
        return "Issue Resolved";
    }
}
