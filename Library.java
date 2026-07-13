class Library{

    public static String fetchName(){
        return "Central Library";
    }

    public static String fetchLocation(){
        return "Mysore";
    }

    public static int fetchBooks(){
        return 50000;
    }

    public static String fetchTiming(){
        return "9 AM - 6 PM";
    }

    public static void main(String[] args){

        System.out.println("Library: " + fetchName());
        System.out.println("Location: " + fetchLocation());
        System.out.println("Books: " + fetchBooks());
        System.out.println("Timing: " + fetchTiming());

    }
}