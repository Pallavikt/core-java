class BankAccountRunner{
	
	public static void main(String[] a){
		
		BankAccount pallaviAccount = new BankAccount();
		
		double balance = pallaviAccount.getBalance();
		System.out.println("Available Balance: "+balance);
		
		pallaviAccount.credit(75000.00);
		balance = pallaviAccount.getBalance();
		System.out.println("Available Balance in Pallavi's Account: "+balance);
		
		pallaviAccount.debit(10000.00);
		balance = pallaviAccount.getBalance();
		System.out.println("Available Balance in Pallavi's Account: "+balance);
		
		
		System.out.println("");
		SavingAccount account = new SavingAccount();
		
		balance = account.getBalance();
		System.out.println("Available Balance in Savings Account: "+balance);
		
		account.credit(10000.00);
		balance = account.getBalance();
		System.out.println("Available Balance in Savings Account: "+balance);
		
		account.debit(5000.00);
		balance = account.getBalance();
		System.out.println("Available Balance in Savings Account: "+balance);
		
		SavingAccount account2 = new SavingAccount();
		balance = account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		account2.credit(1000000.0);
		balance =  account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		account2.debit(5000);
		balance = account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		System.out.println("");
		CurrentAccount currentAccount = new CurrentAccount();
		
		balance = currentAccount.getBalance();
		System.out.println("Available Balance in Current Account: "+balance);
		
		currentAccount.credit(16000);
		balance = currentAccount.getBalance();
		System.out.println("Available Balance in Current Account: "+balance);
		
		currentAccount.debit(2000);
		balance = currentAccount.getBalance();
		System.out.println("Available Balance in Current Account: "+balance);
		
		CurrentAccount currentAccount2 = new CurrentAccount();
		
		balance = currentAccount2.getBalance();
		System.out.println("Available Balance in Current Account2: "+balance);
		
		currentAccount2.credit(85000);
		balance = currentAccount2.getBalance();
		System.out.println("Available Balance in Current Account2: "+balance);
		
		currentAccount2.debit(1000);
		balance = currentAccount2.getBalance();
		System.out.println("Available Balance in Current Account2: "+balance);
		
		currentAccount.transfer(pallaviAccount,1000);
		balance = pallaviAccount.getBalance();
		System.out.println("Available Balance in Pallavi's Account: "+balance);
		
		account2.transfer(pallaviAccount, 34000);
		balance = pallaviAccount.getBalance();
		System.out.println("Available Balance in Pallavi's Account: "+balance);
		
		balance = account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		account2.transfer(account,95000);
		balance = account.getBalance();
		System.out.println("Available Balance in Savings Account: "+balance);
		
		balance = account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		account2.transfer(currentAccount,87000);
		balance = currentAccount.getBalance();
		System.out.println("Available Balance in Current Account: "+balance);
		
		balance = account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		System.out.println("  ");
		
		System.out.println("Current Balance of all Accounts........");
		
		
		balance = pallaviAccount.getBalance();
		System.out.println("Available Balance in Pallavi's Account: "+balance);
		
		balance = account.getBalance();
		System.out.println("Available Balance in Savings Account: "+balance);
		
		balance = account2.getBalance();
		System.out.println("Available Balance in Savings Account2: "+balance);
		
		balance = currentAccount.getBalance();
		System.out.println("Available Balance in Current Account: "+balance);
		
		balance = currentAccount2.getBalance();
		System.out.println("Available Balance in Current Account2: "+balance);
	}
	
}