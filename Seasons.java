class Seasons{
	
	int year; 
	Teams1 teams[];
	
	public void getSeasonsInfo(){
		
		System.out.println("Season: "+year);
		
		System.out.println("Team           M       W        L       NRR         PTS        Last5");

		for(Teams1 team : teams){
			team.getTeams1Info();
		}
		System.out.println(" ");
		System.out.println("_________________________________________________________________________");
	}
}