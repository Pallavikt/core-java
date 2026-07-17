class Hotel{

    static String hotelName;
    static String ownerName;
    static String location;
    static String hotelType;
    static String phoneNumber;
    static int totalRooms;
    static double rating;
    static String checkInTime;

    public static boolean createHotel(String hName, String oName,
            String place, String type, String phone,
            int rooms, double hotelRating, String checkIn){

        boolean isCreated = false;

        hotelName = hName;
        ownerName = oName;
        location = place;
        hotelType = type;
        phoneNumber = phone;
        totalRooms = rooms;
        rating = hotelRating;
        checkInTime = checkIn;

        isCreated = true;

        return isCreated;
    }

    public static void getHotelData(){

        System.out.println("Hotel Name : " + hotelName);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Location : " + location);
        System.out.println("Hotel Type : " + hotelType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Rooms : " + totalRooms);
        System.out.println("Rating : " + rating);
        System.out.println("Check-In Time : " + checkInTime);
        System.out.println("--------------------------------");
    }

}