package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class BankOfIndia implements Rbi {

    @Override
    public boolean kyc() {
        System.out.println("KYC completed in Bank of India");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in Bank of India");
        return 90123456789L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in Bank of India");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in Bank of India");
        return 100000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from Bank of India");
        return 35000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from Bank of India");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in Bank of India");
        return 65000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in Bank of India");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in Bank of India");
        return 35000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by Bank of India");
        return "BOI Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by Bank of India");
        return "BOI Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by Bank of India");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by Bank of India");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in Bank of India");
        return 3456;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in Bank of India");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in Bank of India");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in Bank of India");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in Bank of India");
        return "boi@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by Bank of India");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by Bank of India");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in Bank of India");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in Bank of India");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in Bank of India");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in Bank of India");
        return 500000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by Bank of India");
        return "Issue Resolved";
    }
}
