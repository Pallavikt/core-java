class InventoryCheck{
	
	public static void validate(){
		
		System.out.println("validate Started");
		WareHouse.fetchFromAisle();
		System.out.println("validate Ended");
	}
}