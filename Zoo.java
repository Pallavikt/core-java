class Zoo{

    public static String fetchName(){
        return "Mysuru Zoo";
    }

    public static String fetchCity(){
        return "Mysuru";
    }

    public static int fetchAnimals(){
        return 1600;
    }

    public static String fetchTiming(){
        return "8:30 AM - 5:30 PM";
    }

    public static void main(String[] args){

        System.out.println("Zoo: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("Animals: " + fetchAnimals());
        System.out.println("Timing: " + fetchTiming());

    }
}