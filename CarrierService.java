class CarrierService{
	
	public static void pickUpPackage(){
		
		System.out.println("pickUpPackage Started");
		HubRouter.sortToZipCode();
		System.out.println("pickUpPackage Ended");
		
	}
	
}