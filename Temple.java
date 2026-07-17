class Temple{

    static String templeName;
    static String deityName;
    static String location;
    static String templeType;
    static String phoneNumber;
    static int dailyVisitors;
    static double rating;
    static String darshanTimings;

    public static boolean createTemple(String tName, String dName,
            String place, String type,
            String phone, int visitors,
            double templeRating, String timings){

        boolean isCreated = false;

        templeName = tName;
        deityName = dName;
        location = place;
        templeType = type;
        phoneNumber = phone;
        dailyVisitors = visitors;
        rating = templeRating;
        darshanTimings = timings;

        isCreated = true;

        return isCreated;
    }

    public static void getTempleData(){

        System.out.println("Temple Name : " + templeName);
        System.out.println("Deity Name : " + deityName);
        System.out.println("Location : " + location);
        System.out.println("Temple Type : " + templeType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Daily Visitors : " + dailyVisitors);
        System.out.println("Rating : " + rating);
        System.out.println("Darshan Timings : " + darshanTimings);
        System.out.println("--------------------------------");

    }

}