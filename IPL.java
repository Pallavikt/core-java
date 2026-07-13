class IPL{

       public static void main(String men[]){
	   
	    String topTenCricketers[] = {"Ravindra Jadeja", "Marco Jansen", "Sikandar Raza", "Mehidy Hasan Miraz",
		"Mitchell Starc", "Ben Stokes", "Hardik Pandya", "Pat Cummins", "Gus Atkinson", "Wiaan Mulder" };
		
		String bowlers[] = {"Jasprit Bumrah", "Matt Henry", "Mitchell Starc", "Pat Cummins", "Marco Jansen",
		"Scott Boland", "Noman Ali", "Kagiso Rabada", "Josh Hazlewood", "Nathan Lyon"};
		
		String batters[] = {"Harry Brook", "Travis Head", "Joe Root", "Steven Smith", "Kamindu Mendis",
		"Kane Williamson", "Temba Bavuma", "Shubman Gill", "Yashasvi Jaiswal", "Dinesh Chandimal" };
		System.out.println(" ");
		System.out.println("TOP 10 CRICKETERS:");
		System.out.println(" ");
		
		for(String cricketers:topTenCricketers){
			System.out.println(cricketers);
		}
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("BOWLERS:");
		System.out.println(" ");
		
		
		for(String menBowlers:bowlers){
			System.out.println(menBowlers);
		}
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("BATTERS:");
		System.out.println(" ");
		
		
		for(String menBatters:batters){
			System.out.println(menBatters);
		}
		
	}
	
}