class Amazon {

    public static void createAccount(String customerName,long mobileNumber,String email,String password,String deliveryAddress,int pinCode) {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Pin Code: " + pinCode);
    }

    public static void main(String[] args) {

        createAccount("Pallavi K T",9876543210L,"pallavi@gmail.com","Amazon@123","Bengaluru",560001);

    }
}