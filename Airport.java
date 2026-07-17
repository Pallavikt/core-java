class Airport{

    static String airportName;
    static String city;
    static String state;
    static String airportType;
    static String phoneNumber;
    static int totalTerminals;
    static double rating;
    static String operatingHours;

    public static boolean createAirport(String aName, String cityName,
            String stateName, String type,
            String phone, int terminals,
            double airportRating, String hours){

        boolean isCreated = false;

        airportName = aName;
        city = cityName;
        state = stateName;
        airportType = type;
        phoneNumber = phone;
        totalTerminals = terminals;
        rating = airportRating;
        operatingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getAirportData(){

        System.out.println("Airport Name : " + airportName);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Airport Type : " + airportType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Terminals : " + totalTerminals);
        System.out.println("Rating : " + rating);
        System.out.println("Operating Hours : " + operatingHours);
        System.out.println("--------------------------------");

    }

}