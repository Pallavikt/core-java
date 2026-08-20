class Hotel{
	
	//instance variables
	int id;
	String name;
	String location;
	int noOfWaiters;
	boolean hasAc;
	Floor floor;//object reference type(custom)
	
	public void printHotelDetails(){
		System.out.println("Hotel Id: "+id);
		System.out.println("Hotel Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("No of Waiters: "+noOfWaiters);
		System.out.println("AC Available: "+hasAc);
		floor.printFloorDetails();
		
	}
}