class Day{

	Event events[];
	String name;
	
	public void getDayInfo(){
		
		System.out.println(" ");
		System.out.println(".......EVENT INFO.......");
		System.out.println("Day: "+name);
		for(Event event : events){
			
			event.getEventInfo();
		}
	}
}