class Event{

	Atendee atendees[];
	String title;
	String startTime;
	String endTime;
	boolean isAllDayEvent;
	boolean isTeamMeeting;
	
	public void getEventInfo(){
		
		System.out.println(" ");
		System.out.println("Title                Start Timing         End Timing         All Day Event         Team Meeting");
		System.out.println(title+"          "+startTime+"             "+endTime+"               "+isAllDayEvent+"               "+isTeamMeeting);
		System.out.println(" ");
		System.out.println("......ATENDEE INFO.....");
		System.out.println("Name                    Email                   Phone No          ");
		
		for(Atendee atendee : atendees){
			
			atendee.getAtendeeInfo();
		}
		
		
		System.out.println("_______________________________________________________________________________________________");
	}
}