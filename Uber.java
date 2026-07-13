class Uber {

    public static void createAccount(String firstName,String lastName,long mobileNumber,String email,String password,String homeLocation) {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Home Location: " + homeLocation);
    }

    public static void main(String[] args) {

        createAccount("Pallavi","K T",9876543210L,"pallavi@gmail.com","Uber@123","Bengaluru");

    }
}