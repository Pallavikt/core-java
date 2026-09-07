class BankAccount{
	
	public BankAccount(){
		
		System.out.println("Bank Account Cons Invoked......");
	
	}
	
	double balance;
	
	public double getBalance(){
		return balance;
	}
	
	public void credit(double amount){
		
		System.out.println("Crediting Initiated...");
		if(amount>0)
			balance = balance + amount;
		else
			System.out.println("Invalid Amount!");
		System.out.println("Credit Successful...");
	}
	
	public void debit(double amount){
		
		System.out.println("Debiting Initiated...");
		if(amount <= balance)
			balance = balance - amount;
		else 
			System.out.println("Insufficient Balance!");
		System.out.println("Debit Successful...");
	}
	
	//Polymorphism - Achieved if there is Inheritance
	// BankAccount receipientAccount = new SavingAccount
	// BankAccount receipientAccount = new CurrentAccount
	public void transfer(BankAccount receipientAccount, double amount){
		
		System.out.println(" ");
		System.out.println("Transfer initiated...");
		this.debit(amount);
		receipientAccount.credit(amount);
		System.out.println("Transfer Successful...");
	
	}
	
}