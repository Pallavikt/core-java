class RTO{

    static String officeName;
    static String officerName;
    static String location;
    static String serviceType;
    static String phoneNumber;
    static int tokenNumber;
    static double serviceRating;
    static String officeTimings;

    public static boolean createLicence(String oName, String officer,
            String place, String service,
            String phone, int token,
            double rating, String timings){

        boolean isCreated = false;

        officeName = oName;
        officerName = officer;
        location = place;
        serviceType = service;
        phoneNumber = phone;
        tokenNumber = token;
        serviceRating = rating;
        officeTimings = timings;

        isCreated = true;

        return isCreated;
    }

    public static void getLicenceData(){

        System.out.println("Office Name: " + officeName);
        System.out.println("Officer Name: " + officerName);
        System.out.println("Location: " + location);
        System.out.println("Service Type: " + serviceType);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Token Number: " + tokenNumber);
        System.out.println("Service Rating: " + serviceRating);
        System.out.println("Office Timings: " + officeTimings);

    }

}