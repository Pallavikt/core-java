class Teams{

	String name;
	int noOfMatches;
	int won;
	int lost;
	String nrr;
	int pts;
	boolean last5[];
	boolean gt5[];
	boolean srh5[];
	boolean rr[];
	boolean pbks[];
	
	public void getTeamsInfo(){
		System.out.print(name+"             "+noOfMatches+"    "+won+"    "+lost+"   "+nrr+"     "+pts+"     ");
		for(boolean last : last5){
			System.out.print(last+"  ");
		}
		System.out.println("");
	}
}