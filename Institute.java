class Institute{

    static String instituteName;
    static String principalName;
    static String location;
    static String instituteType;
    static String phoneNumber;
    static int totalStudents;
    static double rating;
    static String workingHours;

    public static boolean createInstitute(String iName, String pName,
            String place, String type,
            String phone, int students,
            double instituteRating, String hours){

        boolean isCreated = false;

        instituteName = iName;
        principalName = pName;
        location = place;
        instituteType = type;
        phoneNumber = phone;
        totalStudents = students;
        rating = instituteRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getInstituteData(){

        System.out.println("Institute Name : " + instituteName);
        System.out.println("Principal Name : " + principalName);
        System.out.println("Location : " + location);
        System.out.println("Institute Type : " + instituteType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Students : " + totalStudents);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}