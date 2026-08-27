class Meeting{
	
	String title;
	String date;
	String duration;
	String startTime;
	String endTime;
	boolean isAllDayEvent;
	Invitee invitee;
	
	public void printMeetingDetails(){
	
		System.out.println("Title: "+title);
		System.out.println("Date: "+date);
		System.out.println("Duration: "+duration);
		System.out.println("Start Timing: "+startTime);
		System.out.println("End Timing: "+endTime);
		System.out.println("Event is all time: "+isAllDayEvent);
		invitee.printInviteeDetails();
	}

}