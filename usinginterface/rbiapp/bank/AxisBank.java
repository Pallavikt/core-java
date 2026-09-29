package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class AxisBank implements Rbi {
    @Override
    public boolean kyc() {
        System.out.println("KYC completed in Axis Bank");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in Axis Bank");
        return 56789012345L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in Axis Bank");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in Axis Bank");
        return 90000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from Axis Bank");
        return 25000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from Axis Bank");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in Axis Bank");
        return 65000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in Axis Bank");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in Axis Bank");
        return 30000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by Axis Bank");
        return "Axis Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by Axis Bank");
        return "Axis Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by Axis Bank");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by Axis Bank");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in Axis Bank");
        return 8901;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in Axis Bank");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in Axis Bank");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in Axis Bank");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in Axis Bank");
        return "axis@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by Axis Bank");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by Axis Bank");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in Axis Bank");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in Axis Bank");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in Axis Bank");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in Axis Bank");
        return 300000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by Axis Bank");
        return "Issue Resolved";
    }
}
