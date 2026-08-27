class Team{
	
	int teamId;
	String teamName;
	Calendar calendar;


	public void printTeamDetails(){
		
		System.out.println("Team Id: "+teamId);
		System.out.println("Team Name: "+teamName);
		calendar.printCalendarDetails();
	}
}