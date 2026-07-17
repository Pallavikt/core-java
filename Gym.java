class Gym{

    static String gymName;
    static String trainerName;
    static String location;
    static String gymType;
    static String phoneNumber;
    static int totalMembers;
    static double rating;
    static String workingHours;

    public static boolean createGym(String gName, String tName,
            String place, String type,
            String phone, int members,
            double gymRating, String hours){

        boolean isCreated = false;

        gymName = gName;
        trainerName = tName;
        location = place;
        gymType = type;
        phoneNumber = phone;
        totalMembers = members;
        rating = gymRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getGymData(){

        System.out.println("Gym Name : " + gymName);
        System.out.println("Trainer Name : " + trainerName);
        System.out.println("Location : " + location);
        System.out.println("Gym Type : " + gymType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Members : " + totalMembers);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}