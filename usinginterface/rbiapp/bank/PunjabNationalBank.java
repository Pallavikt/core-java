package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class PunjabNationalBank implements Rbi {

    @Override
    public boolean kyc() {
        System.out.println("KYC completed in Punjab National Bank");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in Punjab National Bank");
        return 78901234567L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in Punjab National Bank");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in Punjab National Bank");
        return 85000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from Punjab National Bank");
        return 25000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from Punjab National Bank");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in Punjab National Bank");
        return 60000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in Punjab National Bank");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in Punjab National Bank");
        return 28000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by Punjab National Bank");
        return "PNB Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by Punjab National Bank");
        return "PNB Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by Punjab National Bank");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by Punjab National Bank");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in Punjab National Bank");
        return 1234;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in Punjab National Bank");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in Punjab National Bank");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in Punjab National Bank");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in Punjab National Bank");
        return "pnb@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by Punjab National Bank");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by Punjab National Bank");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in Punjab National Bank");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in Punjab National Bank");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in Punjab National Bank");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in Punjab National Bank");
        return 400000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by Punjab National Bank");
        return "Issue Resolved";
    }
}
