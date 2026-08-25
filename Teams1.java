class Teams1{
	
	String name;
	int noOfMatches;
	int won;
	int lost;
	String nrr;
	int points;
	int last5[];
	
	public void getTeams1Info(){

		System.out.print(name+"           "+noOfMatches+"       "+won+"        "+lost+"       "+nrr+"      "+points+"        ");
		
		for(int last : last5){
			System.out.print(last+" ");
		}
	}
	
}