package com.xworkz.abstraction.rbiapp.bank;

import com.xworkz.abstraction.rbiapp.rbi.Rbi;

public class CanaraBank implements Rbi {

        @Override
        public boolean kyc() {
            System.out.println("KYC completed in Canara Bank");
            return true;
        }

        @Override
        public long openAccount() {
            System.out.println("Account opened in Canara Bank");
            return 12345678901L;
        }

        @Override
        public boolean closeAccount() {
            System.out.println("Account closed in Canara Bank");
            return true;
        }

        @Override
        public double deposit() {
            System.out.println("Amount deposited in Canara Bank");
            return 50000.0;
        }

        @Override
        public double withdraw() {
            System.out.println("Amount withdrawn from Canara Bank");
            return 10000.0;
        }

        @Override
        public boolean transferMoney() {
            System.out.println("Money transferred from Canara Bank");
            return true;
        }

        @Override
        public double checkBalance() {
            System.out.println("Balance checked in Canara Bank");
            return 40000.0;
        }

        @Override
        public boolean applyLoan() {
            System.out.println("Loan applied in Canara Bank");
            return true;
        }

        @Override
        public double payLoan() {
            System.out.println("Loan amount paid in Canara Bank");
            return 15000.0;
        }

        @Override
        public String issueDebitCard() {
            System.out.println("Debit card issued by Canara Bank");
            return "Visa Debit Card";
        }

        @Override
        public String issueCreditCard() {
            System.out.println("Credit card issued by Canara Bank");
            return "Canara Credit Card";
        }

        @Override
        public boolean blockCard() {
            System.out.println("Card blocked by Canara Bank");
            return true;
        }

        @Override
        public boolean unblockCard() {
            System.out.println("Card unblocked by Canara Bank");
            return true;
        }

        @Override
        public int generatePin() {
            System.out.println("PIN generated in Canara Bank");
            return 4587;
        }

        @Override
        public boolean changePin() {
            System.out.println("PIN changed in Canara Bank");
            return true;
        }

        @Override
        public boolean netBanking() {
            System.out.println("Net banking activated in Canara Bank");
            return true;
        }

        @Override
        public boolean mobileBanking() {
            System.out.println("Mobile banking activated in Canara Bank");
            return true;
        }

        @Override
        public String upiService() {
            System.out.println("UPI service activated in Canara Bank");
            return "canara@upi";
        }

        @Override
        public boolean chequeBook() {
            System.out.println("Cheque book issued by Canara Bank");
            return true;
        }

        @Override
        public boolean stopCheque() {
            System.out.println("Cheque stopped by Canara Bank");
            return true;
        }

        @Override
        public boolean updateMobileNumber() {
            System.out.println("Mobile number updated in Canara Bank");
            return true;
        }

        @Override
        public boolean updateAddress() {
            System.out.println("Address updated in Canara Bank");
            return true;
        }

        @Override
        public boolean nomineeService() {
            System.out.println("Nominee added in Canara Bank");
            return true;
        }

        @Override
        public double fixedDeposit() {
            System.out.println("Fixed deposit created in Canara Bank");
            return 100000.0;
        }

        @Override
        public String customerSupport() {
            System.out.println("Customer support provided by Canara Bank");
            return "Issue Resolved";
        }

}
