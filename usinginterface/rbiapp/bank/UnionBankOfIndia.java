package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class UnionBankOfIndia implements Rbi {
    @Override
    public boolean kyc() {
        System.out.println("KYC completed in Union Bank of India");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in Union Bank of India");
        return 89012345678L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in Union Bank of India");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in Union Bank of India");
        return 95000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from Union Bank of India");
        return 30000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from Union Bank of India");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in Union Bank of India");
        return 65000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in Union Bank of India");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in Union Bank of India");
        return 32000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by Union Bank of India");
        return "Union Bank Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by Union Bank of India");
        return "Union Bank Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by Union Bank of India");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by Union Bank of India");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in Union Bank of India");
        return 2345;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in Union Bank of India");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in Union Bank of India");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in Union Bank of India");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in Union Bank of India");
        return "unionbank@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by Union Bank of India");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by Union Bank of India");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in Union Bank of India");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in Union Bank of India");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in Union Bank of India");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in Union Bank of India");
        return 450000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by Union Bank of India");
        return "Issue Resolved";
    }
}
