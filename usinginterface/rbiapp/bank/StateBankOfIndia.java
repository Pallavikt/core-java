package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class StateBankOfIndia implements Rbi {

    @Override
    public boolean kyc() {
        System.out.println("KYC completed in State Bank of India");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in State Bank of India");
        return 23456789012L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in State Bank of India");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in State Bank of India");
        return 60000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from State Bank of India");
        return 12000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from State Bank of India");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in State Bank of India");
        return 48000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in State Bank of India");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in State Bank of India");
        return 18000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by State Bank of India");
        return "SBI Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by State Bank of India");
        return "SBI Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by State Bank of India");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by State Bank of India");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in State Bank of India");
        return 5678;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in State Bank of India");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in State Bank of India");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in State Bank of India");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in State Bank of India");
        return "sbi@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by State Bank of India");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by State Bank of India");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in State Bank of India");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in State Bank of India");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in State Bank of India");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in State Bank of India");
        return 150000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by State Bank of India");
        return "Issue Resolved";
    }
}
