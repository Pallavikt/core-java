class Train{

    public static String fetchName(){
        return "Shatabdi Express";
    }

    public static String fetchSource(){
        return "Bengaluru";
    }

    public static String fetchDestination(){
        return "Mysuru";
    }

    public static int fetchCoaches(){
        return 18;
    }

    public static void main(String[] args){

        System.out.println("Train: " + fetchName());
        System.out.println("Source: " + fetchSource());
        System.out.println("Destination: " + fetchDestination());
        System.out.println("Coaches: " + fetchCoaches());

    }
}