class AmusementPark{

    static String parkName;
    static String ownerName;
    static String location;
    static String parkType;
    static String phoneNumber;
    static int totalRides;
    static double rating;
    static String workingHours;

    public static boolean createAmusementPark(String pName, String oName,
            String place, String type,
            String phone, int rides,
            double parkRating, String hours){

        boolean isCreated = false;

        parkName = pName;
        ownerName = oName;
        location = place;
        parkType = type;
        phoneNumber = phone;
        totalRides = rides;
        rating = parkRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getAmusementParkData(){

        System.out.println("Park Name : " + parkName);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Location : " + location);
        System.out.println("Park Type : " + parkType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Rides : " + totalRides);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}