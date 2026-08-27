class MplRunner{
	
	public static void main(String[] args){
		
		Mpl mpl = new Mpl();
		
		Table1 table = new Table1();
		
		
		//SEASON 2026
		
		Seasons season2026 = new Seasons();
		season2026.year = 2026;
		
		Teams1 rcb2026 = new Teams1();
		rcb2026.name = "RCB";
		rcb2026.noOfMatches = 14;
		rcb2026.won = 6;
		rcb2026.lost = 8;
		rcb2026.nrr = "+0.356";
		rcb2026.points = 24;
		int last[] = {1,0,1,1,0};
		rcb2026.last5 = last;
		
		season2026.teams = new Teams1[]{rcb2026};
		
		//SEASON 2025
		Seasons season2025 = new Seasons();
		season2025.year = 2025;
		
		Teams1 rcb2025 = new Teams1();
		rcb2025.name = "RCB";
		rcb2025.noOfMatches = 14;
		rcb2025.won = 7;
		rcb2025.lost = 7;
		rcb2025.points = 13;
		rcb2025.nrr = "+0.253";
		int rcb2025lost[] = {1,1,1,0,0};
		rcb2025.last5 = rcb2025lost;
		
		season2025.teams = new Teams1[]{rcb2025};
		
		table.seasons = new Seasons[]{season2026,season2025};
		mpl.table = table;
		
		mpl.getMplInfo();
	}
}