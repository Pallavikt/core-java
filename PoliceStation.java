class PoliceStation{

    public static String fetchName(){
        return "City Police Station";
    }

    public static String fetchLocation(){
        return "Tumkur";
    }

    public static int fetchStaff(){
        return 60;
    }

    public static String fetchZone(){
        return "South";
    }

    public static void main(String[] args){

        System.out.println("Station: " + fetchName());
        System.out.println("Location: " + fetchLocation());
        System.out.println("Staff: " + fetchStaff());
        System.out.println("Zone: " + fetchZone());

    }
}