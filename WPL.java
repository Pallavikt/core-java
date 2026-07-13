class WPL{

       public static void main(String men[]){
	   
	    String topTenCricketers[] = {"Hayley Matthews", "Ashleigh Gardner", "Annabel Sutherland", 
		"Marizanne Kapp", "Amelia Kerr", "Deepti Sharma", "Alana King", "Nat Sciver-Brunt", 
		"Chamari Athapaththu", "Orla Prendergast" };
		
		String bowlers[] = {"N. Sree Charani", "Charlie Dean", "Linsey Smith", "Sophie Ecclestone",
		"Alana King", "Ashleigh Gardner", "Megan Schutt", "Kim Garth", "Nahida Akter", "Ayabonga Khaka" };
		
		String batters[] = {"Georgia Voll", "Smriti Mandhana", "Laura Wolvaardt", "Beth Mooney", 
		"Phoebe Litchfield", "Shafali Verma", "Nat Sciver-Brunt", "Maddy Green", "Chamari Athapaththu",
		"Harmanpreet Kaur" };
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
		
		
		for(String womenBowlers:bowlers){
			System.out.println(womenBowlers);
		}
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("BATTERS:");
		System.out.println(" ");

		
		for(String womenBatters:batters){
			System.out.println(womenBatters);
		}
		
	}
	
}