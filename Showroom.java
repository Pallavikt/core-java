class Showroom{

    static String showroomName;
    static String ownerName;
    static String location;
    static String showroomType;
    static String phoneNumber;
    static int totalVehicles;
    static double rating;
    static String workingHours;

    public static boolean createShowroom(String sName, String oName,
            String place, String type,
            String phone, int vehicles,
            double showroomRating, String hours){

        boolean isCreated = false;

        showroomName = sName;
        ownerName = oName;
        location = place;
        showroomType = type;
        phoneNumber = phone;
        totalVehicles = vehicles;
        rating = showroomRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getShowroomData(){

        System.out.println("Showroom Name : " + showroomName);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Location : " + location);
        System.out.println("Showroom Type : " + showroomType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Vehicles : " + totalVehicles);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}