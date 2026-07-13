class AmazonPrimeVideo{

      public static void main(String amazone[]){
	  
	     String indianAmazonOriginals[] = {"Mirzapur", "The Family Man", "Panchayat", "Paatal Lok", 
		 "Made in Heaven", "Farzi", "Dahaad", "Breathe: Into the Shadows", "Mumbai Diaries", "Jubilee", 
		 "Poacher", "Indian Police Force", "Suzhal – The Vortex", "Dhootha", "Vadhandhi", "Crash Course",
		 "Guilty Minds", "The Village", "Sweet Kaaram Coffee", "Modern Love Mumbai", "Modern Love Chennai",
		 "Call Me Bae", "Gulkanda Tales", "The Tribe", "Inspectors"};
		 
		 String postTheatricalIndianMovies[] = {"Kantara: A Legend Chapter-1", "Drishyam 3", "Karuppu", 
		 "Shershaah", "Soorarai Pottru", "Jai Bhim", "Sardar Udham", "Gehraiyaan", "Pushpa: The Rise",
		 "K.G.F: Chapter 2", "Jailer", "Pathaan", "Tiger 3", "Yodha", "Teri Baaton Mein Aisa Uljha Jiya", 
		 "Rocky Aur Rani Kii Prem Kahaani", "Ponniyin Selvan: Part 2", "Kantāra", "Varisu", 
		 "Sarpatta Parambarai", "Drishyam", "Jawan", "Salaar: Part 1 – Ceasefire", "Baby John", "Thangalaan"};
		 
		 String globalAmazonOriginals[] = {"The Boys", "The Lord of the Rings: The Rings of Power", "Citadel", 
		 "Reacher", "Jack Ryan", "The Wheel of Time", "Fleabag", "The Marvelous Mrs. Maisel", "Invincible", 
		 "Good Omens", "The Grand Tour", "Gen V", "Fallout", "Mr. & Mrs. Smith", "Hanna", "Upload", 
		 "The Terminal List", "Outer Range", "Bosch", "The Peripheral", "The Summer I Turned Pretty",
		 "Carnival Row", "Swarm", "The Expanse", "Maxton Hall – The World Between Us"};
		 
		 String globalHollywoodMovies[] = {"Marty Supreme", "Road House", "The Idea of You", "Air", 
		 "Saltburn", "Thirteen Lives", "The Tomorrow War", "Coming 2 America", "One Night in Miami...", 
		 "The Covenant", "Anatomy of a Fall", "The Zone of Interest", "Everything Everywhere All at Once",
		 "John Wick: Chapter 4", "The Beekeeper", "Interstellar", "Inception", "The Dark Knight", "Gladiator",
		 "Knives Out", "No Time to Die", "The Wolf of Wall Street", "The Hitman's Bodyguard", "Dune: Part Two",
		 "Challengers"};
		 
		 String unscriptedShows[] = {"All or Nothing: Arsenal", "All or Nothing: Manchester City", "The Test",
		 "LOL: Last One Laughing India", "Comicstaan", "One Mic Stand", "Rainbow Rishta", "Angry Young Men",
		 "AP Dhillon: First of a Kind", "Toofaan Extra Innings", "Cinema Marte Dum Tak", "Clarkson's Farm",
		 "The Ferragnez", "Making the Cut", "LuLaRich", "Shiny Happy People", "Kelce", 
		 "Federer: Twelve Final Days", "I Am: Celine Dion", "This Is Me... Now: A Love Story",
		 "The Kids in the Hall", "The Fake Sheikh", "Ourika", "Grand Prix Driver", "The Inside Story"};
		    System.out.println(" ");
		    System.out.println("Indian Amazon Originals:");    
			System.out.println(" ");
		 
			for(String amazoneOriginals:indianAmazonOriginals){
				System.out.println(amazoneOriginals);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Direct-to-Streaming & Post-Theatrical Indian Movies:");
			System.out.println(" ");
		   
			
			for(String movies:postTheatricalIndianMovies){
				System.out.println(movies);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Global Amazon Originals:");
			System.out.println(" ");
		    
			
			for(String globalOriginals:globalAmazonOriginals){
				System.out.println(globalOriginals);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Global Hollywood & International Movies:");
			System.out.println(" ");
		  

			for(String internationalMovies:globalHollywoodMovies){
				System.out.println(internationalMovies);
			}
			System.out.println(" ");
		    System.out.println(" ");
			
			System.out.println("Documentaries, Reality TV & Unscripted Shows:");
			System.out.println(" ");
		    
			
			for(String realityTv:unscriptedShows){
				System.out.println(realityTv);
			}
			
	    }
		
}