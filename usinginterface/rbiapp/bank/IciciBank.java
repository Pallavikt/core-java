package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class IciciBank implements Rbi {

    @Override
    public boolean kyc() {
        System.out.println("KYC completed in ICICI Bank");
        return true;
    }

    @Override
    public long openAccount() {
        System.out.println("Account opened in ICICI Bank");
        return 45678901234L;
    }

    @Override
    public boolean closeAccount() {
        System.out.println("Account closed in ICICI Bank");
        return true;
    }

    @Override
    public double deposit() {
        System.out.println("Amount deposited in ICICI Bank");
        return 80000.0;
    }

    @Override
    public double withdraw() {
        System.out.println("Amount withdrawn from ICICI Bank");
        return 20000.0;
    }

    @Override
    public boolean transferMoney() {
        System.out.println("Money transferred from ICICI Bank");
        return true;
    }

    @Override
    public double checkBalance() {
        System.out.println("Balance checked in ICICI Bank");
        return 60000.0;
    }

    @Override
    public boolean applyLoan() {
        System.out.println("Loan applied in ICICI Bank");
        return true;
    }

    @Override
    public double payLoan() {
        System.out.println("Loan amount paid in ICICI Bank");
        return 25000.0;
    }

    @Override
    public String issueDebitCard() {
        System.out.println("Debit card issued by ICICI Bank");
        return "ICICI Debit Card";
    }

    @Override
    public String issueCreditCard() {
        System.out.println("Credit card issued by ICICI Bank");
        return "ICICI Credit Card";
    }

    @Override
    public boolean blockCard() {
        System.out.println("Card blocked by ICICI Bank");
        return true;
    }

    @Override
    public boolean unblockCard() {
        System.out.println("Card unblocked by ICICI Bank");
        return true;
    }

    @Override
    public int generatePin() {
        System.out.println("PIN generated in ICICI Bank");
        return 7890;
    }

    @Override
    public boolean changePin() {
        System.out.println("PIN changed in ICICI Bank");
        return true;
    }

    @Override
    public boolean netBanking() {
        System.out.println("Net banking activated in ICICI Bank");
        return true;
    }

    @Override
    public boolean mobileBanking() {
        System.out.println("Mobile banking activated in ICICI Bank");
        return true;
    }

    @Override
    public String upiService() {
        System.out.println("UPI service activated in ICICI Bank");
        return "icici@upi";
    }

    @Override
    public boolean chequeBook() {
        System.out.println("Cheque book issued by ICICI Bank");
        return true;
    }

    @Override
    public boolean stopCheque() {
        System.out.println("Cheque stopped by ICICI Bank");
        return true;
    }

    @Override
    public boolean updateMobileNumber() {
        System.out.println("Mobile number updated in ICICI Bank");
        return true;
    }

    @Override
    public boolean updateAddress() {
        System.out.println("Address updated in ICICI Bank");
        return true;
    }

    @Override
    public boolean nomineeService() {
        System.out.println("Nominee added in ICICI Bank");
        return true;
    }

    @Override
    public double fixedDeposit() {
        System.out.println("Fixed deposit created in ICICI Bank");
        return 250000.0;
    }

    @Override
    public String customerSupport() {
        System.out.println("Customer support provided by ICICI Bank");
        return "Issue Resolved";
    }
}
