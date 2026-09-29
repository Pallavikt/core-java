package com.xworkz.abstraction.rbiapp.rbi;

public interface Rbi {

    boolean kyc();

    long openAccount();

    boolean closeAccount();

    double deposit();

    double withdraw();

    boolean transferMoney();

    double checkBalance();

    boolean applyLoan();

    double payLoan();

    String issueDebitCard();

    String issueCreditCard();

    boolean blockCard();

    boolean unblockCard();

    int generatePin();

    boolean changePin();

    boolean netBanking();

    boolean mobileBanking();

    String upiService();

    boolean chequeBook();

    boolean stopCheque();

    boolean updateMobileNumber();

    boolean updateAddress();

    boolean nomineeService();

    double fixedDeposit();

    String customerSupport();

}