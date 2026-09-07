class ApplicationRunner{
	
	public static void main(String[] args){
		
		System.out.println("Main Started");
		Spotify spotify =  new Spotify();
		spotify.playSong();
		System.out.println("Main Ended");
		
	}
}