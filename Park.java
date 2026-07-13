class Park{

    public static String fetchName(){
        return "Cubbon Park";
    }

    public static String fetchCity(){
        return "Bengaluru";
    }

    public static int fetchArea(){
        return 300;
    }

    public static String fetchTiming(){
        return "6 AM - 8 PM";
    }

    public static void main(String[] args){

        System.out.println("Park: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("Area: " + fetchArea());
        System.out.println("Timing: " + fetchTiming());

    }
}