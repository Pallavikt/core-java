class University{

    public static String fetchName(){
        return "VTU";
    }

    public static String fetchLocation(){
        return "Belagavi";
    }

    public static int fetchColleges(){
        return 220;
    }

    public static String fetchViceChancellor(){
        return "Dr. S. Vidyashankar";
    }

    public static void main(String[] args){

        System.out.println("University: " + fetchName());
        System.out.println("Location: " + fetchLocation());
        System.out.println("Affiliated Colleges: " + fetchColleges());
        System.out.println("Vice Chancellor: " + fetchViceChancellor());

    }

}