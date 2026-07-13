class City{

    public static String fetchName(){
        return "Bengaluru";
    }

    public static String fetchState(){
        return "Karnataka";
    }

    public static int fetchPopulation(){
        return 12000000;
    }

    public static String fetchLanguage(){
        return "Kannada";
    }

    public static void main(String[] args){

        System.out.println("City: " + fetchName());
        System.out.println("State: " + fetchState());
        System.out.println("Population: " + fetchPopulation());
        System.out.println("Language: " + fetchLanguage());

    }
}