class Gmail {

    public static void createAccount(String firstName,String lastName,String username,String password,long mobileNumber,String recoveryEmail) {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Recovery Email: " + recoveryEmail);
    }

    public static void main(String[] args) {

        createAccount("Pallavi","K T","pallavi.kt","Gmail@123",9876543210L,"recovery@gmail.com");

    }
}