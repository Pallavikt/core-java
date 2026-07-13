class Village{

    public static String fetchName(){
        return "Gubbi";
    }

    public static String fetchDistrict(){
        return "Tumkur";
    }

    public static int fetchPopulation(){
        return 25000;
    }

    public static String fetchState(){
        return "Karnataka";
    }

    public static void main(String[] args){

        System.out.println("Village: " + fetchName());
        System.out.println("District: " + fetchDistrict());
        System.out.println("Population: " + fetchPopulation());
        System.out.println("State: " + fetchState());

    }
}