class Instagram {

    public static void createAccount(String mobileOrEmail,String fullName,String username,String password,String dateOfBirth,String gender) {

        System.out.println("Mobile/Email: " + mobileOrEmail);
        System.out.println("Full Name: " + fullName);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {

        createAccount("pallavi@gmail.com","Pallavi K T","pallavi_kt","Instagram@123","15-08-2004","Female");

    }
}