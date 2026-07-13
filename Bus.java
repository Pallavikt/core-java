class Bus{

    public static String fetchNumber(){
        return "KA06 F1234";
    }

    public static String fetchRoute(){
        return "Tumkur - Bengaluru";
    }

    public static int fetchSeats(){
        return 50;
    }

    public static String fetchType(){
        return "KSRTC";
    }

    public static void main(String[] args){

        System.out.println("Bus Number: " + fetchNumber());
        System.out.println("Route: " + fetchRoute());
        System.out.println("Seats: " + fetchSeats());
        System.out.println("Type: " + fetchType());

    }
}