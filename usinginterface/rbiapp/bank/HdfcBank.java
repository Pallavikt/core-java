package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class HdfcBank implements Rbi {

    @Override
    public boolean kyc() {
        System.out.println("KYC completed in HDFC Bank");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in HDFC Bank");
        return 34567890123L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in HDFC Bank");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in HDFC Bank");
        return 75000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from HDFC Bank");
        return 15000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from HDFC Bank");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in HDFC Bank");
        return 60000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in HDFC Bank");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in HDFC Bank");
        return 20000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by HDFC Bank");
        return "HDFC Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by HDFC Bank");
        return "HDFC Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by HDFC Bank");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by HDFC Bank");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in HDFC Bank");
        return 6789;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in HDFC Bank");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in HDFC Bank");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in HDFC Bank");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in HDFC Bank");
        return "hdfc@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by HDFC Bank");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by HDFC Bank");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in HDFC Bank");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in HDFC Bank");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in HDFC Bank");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in HDFC Bank");
        return 200000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by HDFC Bank");
        return "Issue Resolved";
    }
}
