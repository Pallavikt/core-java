class RealEstate{

    static String companyName;
    static String ownerName;
    static String location;
    static String propertyType;
    static String phoneNumber;
    static int totalProperties;
    static double rating;
    static String workingHours;

    public static boolean createRealEstate(String cName, String oName,
            String place, String type,
            String phone, int properties,
            double companyRating, String hours){

        boolean isCreated = false;

        companyName = cName;
        ownerName = oName;
        location = place;
        propertyType = type;
        phoneNumber = phone;
        totalProperties = properties;
        rating = companyRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getRealEstateData(){

        System.out.println("Company Name : " + companyName);
        System.out.println("Owner Name : " + ownerName);
        System.out.println("Location : " + location);
        System.out.println("Property Type : " + propertyType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Properties : " + totalProperties);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}