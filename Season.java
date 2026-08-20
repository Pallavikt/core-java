class Season{

	int year;
	Teams teams;
	Teams teams1;
	Teams teams2;
	Teams teams3;
	Teams teams4;
	
	public void getSeasonInfo(){
		
		System.out.println("Season: "+year);
		System.out.println("Team            M    W    L    NRR       Pts    last5");
		teams.getTeamsInfo();
		teams1.getTeamsInfo();
		teams2.getTeamsInfo();
		teams3.getTeamsInfo();
		teams4.getTeamsInfo();
	}
}