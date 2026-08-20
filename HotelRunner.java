class HotelRunner {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.id = 1;
        hotel.name = "Taj";
		hotel.location = "Bangalore";
		hotel.noOfWaiters = 78;
		hotel.hasAc = true;
      
		Floor anyThing = new Floor();
        anyThing.floorId = 1;
        anyThing.floorName = "Ground Floor";
		
		// hotel has floor / has-A-relationship
		hotel.floor = anyThing;

        hotel.printHotelDetails();
        
    }
}