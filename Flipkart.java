class Flipkart {

    public static void createAccount(String customerName,long mobileNumber,String email,String password,String location,String preferredLanguage) {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Location: " + location);
        System.out.println("Preferred Language: " + preferredLanguage);
    }

    public static void main(String[] args) {

        createAccount("Pallavi K T",9876543210L,"pallavi@gmail.com","Flipkart@123","Bengaluru","English");

    }
}