class PoliceStation{

    static String stationName;
    static String inspectorName;
    static String location;
    static String stationType;
    static String phoneNumber;
    static int totalStaff;
    static double rating;
    static String workingHours;

    public static boolean createPoliceStation(String sName, String iName,
            String place, String type,
            String phone, int staff,
            double stationRating, String hours){

        boolean isCreated = false;

        stationName = sName;
        inspectorName = iName;
        location = place;
        stationType = type;
        phoneNumber = phone;
        totalStaff = staff;
        rating = stationRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getPoliceStationData(){

        System.out.println("Station Name : " + stationName);
        System.out.println("Inspector Name : " + inspectorName);
        System.out.println("Location : " + location);
        System.out.println("Station Type : " + stationType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Staff : " + totalStaff);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}