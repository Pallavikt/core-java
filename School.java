class School{

    public static String fetchName(){
        return "Vidyodaya";
    }

    public static String fetchCity(){
        return "Tumkur";
    }

    public static int fetchStudents(){
        return 1200;
    }

    public static String fetchBoard(){
        return "State";
    }

    public static void main(String[] args){

        System.out.println("School: " + fetchName());
        System.out.println("City: " + fetchCity());
        System.out.println("Students: " + fetchStudents());
        System.out.println("Board: " + fetchBoard());

    }
}