class KarnatakaRunner {

    public static void main(String[] args) {

        String[] pinCodes = Karnataka.getPinCodesByCity("Sira");

        if(pinCodes != null) {
            for(String pinCode : pinCodes) {
                System.out.println(pinCode);
            }
        }
        else {
            System.out.println("City Not Found");
        }
    }
}