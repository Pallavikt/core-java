class Museum{

    public static String fetchName(){
        return "Visvesvaraya Museum";
    }

    public static String fetchCity(){
        return "Bengaluru";
    }

    public static int fetchGalleries(){
        return 7;
    }

    public static String fetchType(){
        return "Science";
    }

    public static void main(String[] args){

        System.out.println("Museum: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("Galleries: " + fetchGalleries());
        System.out.println("Type: " + fetchType());

    }
}