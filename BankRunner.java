class BankRunner{
	
	public static void main(String[] args){
		
		String canaraBankBranches[] = {"J.P Nagar","Sanjaynagar","Malleswaram"};
		String canaraBankIFSCCodes[] = {"CNRB0010484","CNRB0002699","CNRB0003669"};
		
		Bank bank = new Bank();
		bank.bankID = 1;
		bank.bankName = "Canara Bank";
		bank.branches = canaraBankBranches;
		bank.ifscCodes = canaraBankIFSCCodes;
		bank.address = "10th Main Road,3rd Block,Rajajinagar,Bengaluru-560010";
		bank.location = "Bangalore";
		
		System.out.println("Bank Name: "+bank.bankName);
		System.out.println("Bank Addresss: "+bank.address);
		System.out.println("Bank Location: "+bank.location);
		for(String canaraBankBranch:bank.branches){
			System.out.println("Canara Bank Branche: "+canaraBankBranch);
		}
		for(String canaraBankIFSCCode:bank.ifscCodes){
			System.out.println("Canara Bank IFSC Code: "+canaraBankIFSCCode);
		}
		System.out.println("----------------------");
		
		String sbiBankBranches[] = {"RajajiNagar","Sanjaynagar","Malleswaram"};
		String sbiBankIFSCCodes[] = {"SBIN0016873","SBIN0002699","SBIN0003669"};
		
		Bank bank1 = new Bank();
		bank1.bankID = 2;
		bank1.bankName = "SBI Bank";
		bank1.branches = sbiBankBranches;
		bank1.ifscCodes = sbiBankIFSCCodes;
		bank1.address = "10th Main Road,5th Block,Vijayanagar,Bengaluru-560010";
		bank1.location = "Bangalore";
		
		System.out.println("Bank Name: "+bank1.bankName);
		System.out.println("Bank Addresss: "+bank1.address);
		System.out.println("Bank Location: "+bank1.location);
		for(String sbiBankBranch:bank1.branches){
			System.out.println("SBI Bank Branche: "+sbiBankBranch);
		}
		for(String sbiBankIFSCCode:bank1.ifscCodes){
			System.out.println("SBI Bank IFSC Code: "+sbiBankIFSCCode);
		}
		System.out.println("----------------------");
		
		String axisBankBranches[] = {"RajajiNagar","Sanjaynagar","Malleswaram"};
		String axisBankIFSCCodes[] = {"UTIB0016873","UTIB0002699","UTIB0003669"};
		
		Bank bank2 = new Bank();
		bank2.bankID = 3;
		bank2.bankName = "Axis Bank";
		bank2.branches = axisBankBranches;
		bank2.ifscCodes = axisBankBranches;
		bank2.address = "12th Main Road,7th Block,Vijayanagar,Bengaluru-560010";
		bank2.location = "Bangalore"; 
		
		System.out.println("Bank Name: "+bank2.bankName);
		System.out.println("Bank Addresss: "+bank2.address);
		System.out.println("Bank Location: "+bank2.location);
		for(String axisBankBranch:bank2.branches){
			System.out.println("Axis Bank Branche: "+axisBankBranch);
		}
		for(String axisBankIFSCCode:bank2.ifscCodes){
			System.out.println("Axis Bank IFSC Code: "+axisBankIFSCCode);
		}
		
	}
	
}