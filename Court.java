class Court{

    public static String fetchName(){
        return "District Court";
    }

    public static String fetchCity(){
        return "Tumkur";
    }

    public static int fetchJudges(){
        return 15;
    }

    public static String fetchType(){
        return "Civil";
    }

    public static void main(String[] args){

        System.out.println("Court: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("Judges: " + fetchJudges());
        System.out.println("Type: " + fetchType());

    }
}