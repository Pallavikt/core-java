class Ola {

    public static void createAccount(String riderName,long mobileNumber,String email,String password,String pickupLocation,String emergencyContact) {

        System.out.println("Rider Name: " + riderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Pickup Location: " + pickupLocation);
        System.out.println("Emergency Contact: " + emergencyContact);
    }

    public static void main(String[] args) {

        createAccount("Pallavi K T",9876543210L,"pallavi@gmail.com","Ola@123","Majestic","9876501234");

    }
}