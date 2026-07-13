class Airport{

    public static String fetchName(){
        return "Kempegowda Airport";
    }

    public static String fetchCity(){
        return "Bengaluru";
    }

    public static int fetchTerminals(){
        return 2;
    }

    public static String fetchCode(){
        return "BLR";
    }

    public static void main(String[] args){

        System.out.println("Airport: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("Terminals: " + fetchTerminals());
        System.out.println("Code: " + fetchCode());

    }
}