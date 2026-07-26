class OrderSystem{
	
	public static void takeOrder(){
		
		System.out.println("takeOrder Started");
		
		InventoryCheck.validate();
		
		System.out.println("takeOrder Ended");
		
	}
	
}