class Hospital{

    static String hospitalName;
    static String doctorName;
    static String location;
    static String specialization;
    static String phoneNumber;
    static int totalBeds;
    static double rating;
    static String visitingHours;

    public static boolean createHospital(String hName, String dName,
            String place, String specializationName,
            String phone, int beds,
            double hospitalRating, String visitingTime){

        boolean isCreated = false;

        hospitalName = hName;
        doctorName = dName;
        location = place;
        specialization = specializationName;
        phoneNumber = phone;
        totalBeds = beds;
        rating = hospitalRating;
        visitingHours = visitingTime;

        isCreated = true;

        return isCreated;
    }

    public static void getHospitalData(){

        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Doctor Name : " + doctorName);
        System.out.println("Location : " + location);
        System.out.println("Specialization : " + specialization);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Beds : " + totalBeds);
        System.out.println("Rating : " + rating);
        System.out.println("Visiting Hours : " + visitingHours);
        System.out.println("--------------------------------");

    }

}