class DispatchVehicle{
	
	public static void outOfDelivery(){
		
		System.out.println("outOfDelivery Started");
		DeliveryAgent.reachDoorStep();
		System.out.println("outOfDelivery Ended");
		
	}
	
}