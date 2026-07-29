class WaterBillRunner{
	
	public static void main(String[] args){
		
		WaterBill bill = new WaterBill();
		bill.id = 1;
        bill.subDivision = "S12";
        bill.consNo = 62260;
        bill.billNo = "S-414112010";
        bill.rdgDate = "01/01/2026";
        bill.dueDate = "16/01/2026";
        bill.presRdg = 3676000;
        bill.prevRdg = 3494000;
        bill.consumptionLtrs = 182000;
        bill.waterCharges = 8416.00;
        bill.meterCharges = 150.00;
        bill.sanitaryCharges = 3682.00;
        bill.scForBorewell = 200.00;
        bill.otherCharges = 6149.00;
        bill.arrears = 0.00;
        bill.interest = 0.00;
        bill.totalAmount = 18597.00;
        bill.advAmount = 0.00;
        bill.netAmountDue = 18597.00;
		
		int id = bill.id;
		String subDivision = bill.subDivision;
		int consNo =  bill.consNo;
		String billNo = bill.billNo;
		String rdgDate = bill.rdgDate;
		String dueDate = bill.dueDate;
		int presRdg = bill.presRdg;
		int prevRdg = bill.prevRdg;
		int consumptionLtrs = bill.consumptionLtrs;
		double waterCharges = bill.waterCharges;
		double meterCharges = bill.meterCharges;
		double sanitaryCharges = bill.sanitaryCharges;
		double scForBorewell = bill.scForBorewell;
		double otherCharges = bill.otherCharges;
		double arrears = bill.arrears;
		double interest = bill.interest;
		double totalAmount = bill.totalAmount;
		double advAmount = bill.advAmount;
		double netAmountDue = bill.netAmountDue;
		
		System.out.println("ID: " + id);
        System.out.println("Sub Division: " + subDivision);
        System.out.println("Consumer No: " + consNo);
        System.out.println("Bill No: " + billNo);
        System.out.println("Reading Date: " + rdgDate);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Present Reading: " + presRdg);
        System.out.println("Previous Reading: " + prevRdg);
        System.out.println("Consumption (Litres): " + consumptionLtrs);
        System.out.println("Water Charges: " + waterCharges);
        System.out.println("Meter Charges: " + meterCharges);
        System.out.println("Sanitary Charges: " + sanitaryCharges);
        System.out.println("SC For Borewell: " + scForBorewell);
        System.out.println("Other Charges: " + otherCharges);
        System.out.println("Arrears: " + arrears);
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Advance Amount: " +advAmount);
        System.out.println("Net Amount Due: " +netAmountDue);
    }
}
		
		
		