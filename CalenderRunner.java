class CalenderRunner{
	
	public static void main(String[] team){
		
		Calender calender = new Calender();
		
		Day monday = new Day();
		monday.name = "Monday";
		
			Event mondayEvent1 = new Event();
			mondayEvent1.title = "Weekly Catch-Up";
			mondayEvent1.startTime = "10 AM";
			mondayEvent1.endTime = "10:30 AM";
			mondayEvent1.isAllDayEvent = false;
			mondayEvent1.isTeamMeeting = true;
		
			Atendee mondayAtendee1 =  new Atendee();
			mondayAtendee1.name = "pallavi";
			mondayAtendee1.email = "pallavi@gmail.com";
			mondayAtendee1.phoneNo = 3481797839L;
			
			Atendee mondayAtendee2 = new Atendee();
			mondayAtendee2.name = "Sahana";
			mondayAtendee2.email = "sahana@gmail.com";
			mondayAtendee2.phoneNo = 1326415697L;
			
		Day tuesday = new Day();
		tuesday.name = "Tuesday";
		
			Event tuesdayEvent1 = new Event();
			tuesdayEvent1.title = "Strategy Session";
			tuesdayEvent1.startTime = "10 AM";
			tuesdayEvent1.endTime = "10:30 AM";
			tuesdayEvent1.isAllDayEvent = false;
			tuesdayEvent1.isTeamMeeting = false;
			
				Atendee tuesdayAtendee1 = new Atendee();
				tuesdayAtendee1.name = "Hanvi";
				tuesdayAtendee1.email = "hanvi@gmail.com";
				tuesdayAtendee1.phoneNo = 98087198313L;
				
			Event tuesdayEvent[] = {tuesdayEvent1};
			tuesday.events = tuesdayEvent;
			
			Atendee tuesdayAtendee[] = {tuesdayAtendee1};
			tuesdayEvent1.atendees = tuesdayAtendee;
		
		Atendee mondayAtendee[] = {mondayAtendee1,mondayAtendee2};
		mondayEvent1.atendees = mondayAtendee;
		
		Event mondayEvent[] ={mondayEvent1};
		monday.events = mondayEvent;
		
		Day days[] = {monday, tuesday};

		calender.days = days;

		calender.getCalenderInfo();
	}
}