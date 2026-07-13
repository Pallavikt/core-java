class Netflix{

      public static void main(String amazone[]){
	  
			String webSeries[] = {"Sacred Games", "Delhi Crime", "Kota Factory", "Mismatched", 
			"Heeramandi: The Diamond Bazaar", "Rana Naidu", "Guns & Gulaabs", "Kohrra", "CAT", 
			"Khakee: The Bihar Chapter", "The Railway Men", "Scoop", "Aranyak", "Decoupled", "She", 
			"Yeh Kaali Kaali Ankhein", "Class", "Tooth Pari: When Love Bites", "Choona", "Maamla Legal Hai", 
			"IC 814: The Kandahar Hijack", "The Indrani Mukerjea Story", "Taskaree: The Smuggler's Web", 
			"Teach You a Lesson", "I Will Find You"};
			 
			
			String movies[] = {"Bhooth Bangla", "Chatha Pacha", "Dhurandhar The Revenge (Raw & Undekha)", 
			"Maa Behen", "Kara", "Amar Singh Chamkila", "The Archies", "Jaane Jaan", "Monika, O My Darling",
			"Darlings", "Qala", "Ludo", "Minnal Murali", "Raat Akeli Hai", "Bulbbul", "AK vs AK",
			"Meenakshi Sundareshwar", "Thar", "Kathal: A Jackfruit Mystery", "Chor Nikal Ke Bhaga", 
			"Khufiya", "Fighter", "Sikandar", "Chhaava", "Mahavatar Narsimha"};
			 
			String englishSeries[] = {"Stranger Things", "Squid Game", "Bridgerton", "Money Heist",
			"The Crown", "Breaking Bad", "Peaky Blinders", "The Witcher", "You", "Black Mirror", 
			"Wednesday", "Emily in Paris", "Narcos", "Sex Education", "The Queen’s Gambit", "Dark", 
			"Lupin", "All of Us Are Dead", "The Umbrella Academy", "One Piece", "The Diplomat", "Berlin", 
			"Cobra Kai", "Griselda", "The WONDERfools"};
			 
			String HollywoodMovies[] = {"War Machine", "Red Notice", "The Gray Man", "Extraction 2", 
			"Glass Onion: A Knives Out Mystery", "The Irishman", "Roma", "Marriage Story",
			"Guillermo del Toro's Pinocchio", "Society of the Snow", "Nowhere", "Bird Box", "Enola Holmes",
			"The Adam Project", "Rebel Moon", "Leave the World Behind", "Heart of Stone", "Lift", "Damsel",
			"All Quiet on the Western Front", "The Killer", "Spaceman", "Atlas", "Beverly Hills Cop: Axel F", 
			"Hit Man"};
			 
			String entertainment[] = {"WWE Raw", "WWE SmackDown", "Formula 1: Drive to Survive", 
			"The Great Indian Kapil Show", "India's Got Latent", "Fabulous Lives of Bollywood Wives", 
			"Squid Game: The Challenge", "Love Is Blind", "Too Hot to Handle", "Break Point", "Full Swing",
			"Tour de France: Unchained", "Quarterback", "Beckham", "The Last Dance", "Nailed It!", 
			"Selling Sunset", "Physical: 100", "Cheer", "Rhythm + Flow", "Car Masters: Rust to Riches",
			"Is It Cake?", "Barbecue Showdown", "The Romantics", "Curry & Cyanide"};
			System.out.println(" ");
		    System.out.println("Indian Original Series & Web Series:"); 
			System.out.println(" ");
		  
		 
			for(String series:webSeries){
				System.out.println(series);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Direct-to-Netflix & Premium Indian Movies:");
			System.out.println(" ");
		  
			
			for(String indianMovies:movies){
				System.out.println(indianMovies);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Top Global English & International Series:");
			System.out.println(" ");
		    
			
			for(String topSeries:englishSeries){
				System.out.println(topSeries);
			}
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Global Hollywood & Original Movies:");
			System.out.println(" ");

			for(String globalMovies:HollywoodMovies){
				System.out.println(globalMovies);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Sports Entertainment & Unscripted Reality:");
			System.out.println(" ");
		    
			
			for(String sports:entertainment){
				System.out.println(sports);
			}
			
	    }
		
}