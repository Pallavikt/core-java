class Swiggy {

    public static void createAccount(String fullName,long mobileNumber,String email,String password,String deliveryAddress,String referralCode) {

        System.out.println("Full Name: " + fullName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Referral Code: " + referralCode);
    }

    public static void main(String[] args) {

        createAccount("Pallavi K T",9876543210L,"pallavi@gmail.com","Swiggy@123","Bengaluru","SWG100");

    }
}