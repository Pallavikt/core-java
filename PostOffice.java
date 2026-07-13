class PostOffice{

    public static String fetchName(){
        return "Head Post Office";
    }

    public static String fetchCity(){
        return "Tumkur";
    }

    public static int fetchPIN(){
        return 572101;
    }

    public static String fetchType(){
        return "Head Office";
    }

    public static void main(String[] args){

        System.out.println("Office: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("PIN: " + fetchPIN());
        System.out.println("Type: " + fetchType());

    }
}