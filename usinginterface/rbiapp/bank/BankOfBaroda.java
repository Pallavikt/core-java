package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class BankOfBaroda implements Rbi {
    @Override
    public boolean kyc() {
        System.out.println("KYC completed in Bank of Baroda");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in Bank of Baroda");
        return 67890123456L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in Bank of Baroda");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in Bank of Baroda");
        return 70000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from Bank of Baroda");
        return 20000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from Bank of Baroda");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in Bank of Baroda");
        return 50000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in Bank of Baroda");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in Bank of Baroda");
        return 22000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by Bank of Baroda");
        return "BOB Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by Bank of Baroda");
        return "BOB Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by Bank of Baroda");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by Bank of Baroda");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in Bank of Baroda");
        return 9012;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in Bank of Baroda");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in Bank of Baroda");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in Bank of Baroda");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in Bank of Baroda");
        return "bob@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by Bank of Baroda");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by Bank of Baroda");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in Bank of Baroda");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in Bank of Baroda");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in Bank of Baroda");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in Bank of Baroda");
        return 350000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by Bank of Baroda");
        return "Issue Resolved";
    }
}
