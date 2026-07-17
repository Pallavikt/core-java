class VRLLogistics{

    static String branchName;
    static String managerName;
    static String location;
    static String serviceType;
    static String phoneNumber;
    static int totalVehicles;
    static double rating;
    static String workingHours;

    public static boolean createBranch(String bName, String mName,
            String place, String service,
            String phone, int vehicles,
            double branchRating, String hours){

        boolean isCreated = false;

        branchName = bName;
        managerName = mName;
        location = place;
        serviceType = service;
        phoneNumber = phone;
        totalVehicles = vehicles;
        rating = branchRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;

    }

    public static void getBranchData(){

        System.out.println("Branch Name : " + branchName);
        System.out.println("Manager Name : " + managerName);
        System.out.println("Location : " + location);
        System.out.println("Service Type : " + serviceType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Vehicles : " + totalVehicles);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}