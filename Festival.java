class Festival{

    public static String fetchName(){
        return "Deepavali";
    }

    public static String fetchMonth(){
        return "October";
    }

    public static String fetchCountry(){
        return "India";
    }

    public static String fetchSignificance(){
        return "Festival of Lights";
    }

    public static void main(String[] args){

        System.out.println("Festival: " + fetchName());
        System.out.println("Month: " + fetchMonth());
        System.out.println("Country: " + fetchCountry());
        System.out.println("Significance: " + fetchSignificance());

    }

}