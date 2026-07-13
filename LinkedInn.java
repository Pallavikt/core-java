class LinkedInn {

    public static void createAccount(String firstName,String lastName,String email,String password,String currentJobTitle,String country) {

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Current Job: " + currentJobTitle);
        System.out.println("Country: " + country);
    }

    public static void main(String[] args) {

        createAccount("Pallavi","K T","pallavi@gmail.com","LinkedIn@123","Software Engineer","India");

    }
}