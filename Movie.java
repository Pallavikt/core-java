class Movie{

    public static String fetchTitle(){
        return "KGF";
    }

    public static String fetchHero(){
        return "Yash";
    }

    public static String fetchLanguage(){
        return "Kannada";
    }

    public static int fetchYear(){
        return 2018;
    }

    public static void main(String[] args){

        System.out.println("Title: " + fetchTitle());
        System.out.println("Hero: " + fetchHero());
        System.out.println("Language: " + fetchLanguage());
        System.out.println("Year: " + fetchYear());

    }
}