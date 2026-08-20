class IplRunner{
	
	public static void main(String[] args){
	
		Ipl ipl = new Ipl();
		
		Table table = new Table();
		
		Season season = new Season();
		season.year = 2026;
		
		Teams teams = new Teams();
		teams.name = "RCB";
		teams.noOfMatches = 14;
		teams.won = 6;
		teams.lost = 2;
		teams.nrr = "+0.783";
		teams.pts = 18;
		boolean lastFive[] = {true , true , false , false, true};
		teams.last5 = lastFive;
		
		Teams teams1 = new Teams();
		teams1.name = "GT";
		teams1.noOfMatches = 14;
		teams1.won = 9;
		teams1.lost = 5;
		teams1.nrr = "+0.695";
		teams1.pts = 18;
		boolean gtFive[] = {true , true , true , false, true};
		teams1.last5 = gtFive;
		
		Teams teams2 = new Teams();
		teams2.name = "SRH";
		teams2.noOfMatches = 14;
		teams2.won = 9;
		teams2.lost = 5;
		teams2.nrr = "+0.524";
		teams2.pts = 18;
		boolean srhFive[] = {false , true , false , true, true};
		teams2.last5 = srhFive;
		
		Teams teams3 = new Teams();
		teams3.name = "RR";
		teams3.noOfMatches = 14;
		teams3.won = 8;
		teams3.lost = 6;
		teams3.nrr = "+0.189";
		teams3.pts = 16;
		boolean rrFive[] = {false , false , false , true, true};
		teams3.last5 = rrFive;
		
		Teams teams4 = new Teams();
		teams4.name = "SRH";
		teams4.noOfMatches = 14;
		teams4.won = 7;
		teams4.lost = 6;
		teams4.nrr = "+0.309";
		teams4.pts = 15;
		boolean pbksFive[] = {false , false , false , false, true};
		teams4.last5 = pbksFive;
		
		season.teams = teams;
		season.teams1 = teams1;
		season.teams2 =  teams2;
		season.teams3 = teams3;
		season.teams4 = teams4;
		table.season = season;
		ipl.table = table;
		
		ipl.getIplInfo();
		
	}
	
	
}	