class TeamRunner{

	public static void main(String[] args){
	
		Team team = new Team();
		team.teamId = 1;
		team.teamName = "T1";
		
		Calendar calendar = new Calendar();
		
		Meeting meeting = new Meeting();
		meeting.title = "Regional Team Performance Review";
		meeting.date = "19/08/2026";
		meeting.duration = "30 minutes";
		meeting.startTime = "10 AM";
		meeting.endTime = "10:30 AM";
		meeting.isAllDayEvent = false;
		
		Invitee invitee = new Invitee();
		invitee.name = "Sahana";
		invitee.email = "sahana@gmail.com";
		invitee.phoneNo = 12574868698L;
		
		team.calendar = calendar;
		calendar.meeting = meeting;
		meeting.invitee = invitee;
		
		team.printTeamDetails();
		
	}
	
}