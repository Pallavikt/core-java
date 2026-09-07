class SocialMediaRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");
		
		SocialMedia media = new SocialMedia();
		media.postPhoto();

		System.out.println("_______________________");
	
        SocialMedia s = new Instagram();
        s.postPhoto();

        System.out.println("Main Ended");
    }
}