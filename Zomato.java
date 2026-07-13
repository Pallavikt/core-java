class Zomato {

    public static void createAccount(String fullName,long mobileNumber,String email,String password,String location,String favouriteCuisine) {

        System.out.println("Full Name: " + fullName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Location: " + location);
        System.out.println("Favourite Cuisine: " + favouriteCuisine);
    }

    public static void main(String[] args) {

        createAccount("Pallavi K T",9876543210L,"pallavi@gmail.com","Zomato@123","Bengaluru","South Indian");

    }
}