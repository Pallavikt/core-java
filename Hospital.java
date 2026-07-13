class Hospital {

    public static String fetchName() {
        return "Apollo Hospital";
    }

    public static String fetchLocation() {
        return "Bengaluru";
    }

    public static String fetchType() {
        return "Multi Specialty";
    }

    public static int fetchDoctors() {
        return 150;
    }

    public static int fetchNurses() {
        return 300;
    }

    public static int fetchBeds() {
        return 500;
    }

    public static String fetchEmergency() {
        return "Available";
    }

    public static String fetchAmbulance() {
        return "Available";
    }

    public static String fetchBloodBank() {
        return "Available";
    }

    public static String fetchPharmacy() {
        return "24 Hours";
    }

    public static String fetchLaboratory() {
        return "Available";
    }

    public static String fetchICU() {
        return "Yes";
    }

    public static String fetchOperationTheatre() {
        return "Available";
    }

    public static int fetchFloors() {
        return 8;
    }

    public static String fetchFounder() {
        return "Dr. Prathap C. Reddy";
    }

    public static int fetchEstablishedYear() {
        return 1983;
    }

    public static String fetchWebsite() {
        return "www.apollohospitals.com";
    }

    public static String fetchEmail() {
        return "info@apollo.com";
    }

    public static long fetchContactNumber() {
        return 9876543210L;
    }

    public static double fetchRating() {
        return 4.8;
    }

    public static void main(String[] args) {

        System.out.println("Hospital Name: " + fetchName());
        System.out.println("Location: " + fetchLocation());
        System.out.println("Type: " + fetchType());
        System.out.println("Doctors: " + fetchDoctors());
        System.out.println("Nurses: " + fetchNurses());
        System.out.println("Beds: " + fetchBeds());
        System.out.println("Emergency: " + fetchEmergency());
        System.out.println("Ambulance: " + fetchAmbulance());
        System.out.println("Blood Bank: " + fetchBloodBank());
        System.out.println("Pharmacy: " + fetchPharmacy());
        System.out.println("Laboratory: " + fetchLaboratory());
        System.out.println("ICU: " + fetchICU());
        System.out.println("Operation Theatre: " + fetchOperationTheatre());
        System.out.println("Floors: " + fetchFloors());
        System.out.println("Founder: " + fetchFounder());
        System.out.println("Established Year: " + fetchEstablishedYear());
        System.out.println("Website: " + fetchWebsite());
        System.out.println("Email: " + fetchEmail());
        System.out.println("Contact Number: " + fetchContactNumber());
        System.out.println("Rating: " + fetchRating());

    }
}