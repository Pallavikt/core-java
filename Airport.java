class Airport{

	int id;
	String name;
	String location;
	String city;
	Terminal terminal;
	
	public void printAirportDetails(){
		System.out.println("Id: "+id);
		System.out.println("Airport Name: "+name);
		System.out.println("Location: "+location);
		System.out.println("City: "+city);
		
		terminal.printTerminalDetails();
		System.out.println("________________________");
	}
}