class WhatsApp {

    public static void createAccount(long mobileNumber,String profileName,String about,String profilePhoto,boolean twoStepVerification,String language) {

        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Profile Name: " + profileName);
        System.out.println("About: " + about);
        System.out.println("Profile Photo: " + profilePhoto);
        System.out.println("Two Step Verification: " + twoStepVerification);
        System.out.println("Language: " + language);
    }

    public static void main(String[] args) {

        createAccount(9876543210L,"Pallavi","Software Engineer","pallavi.jpg",true,"English");

    }
}