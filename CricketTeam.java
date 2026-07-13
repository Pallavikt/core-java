class CricketTeam{

    public static String fetchTeam(){
        return "India";
    }

    public static String fetchCaptain(){
        return "Rohit Sharma";
    }

    public static int fetchPlayers(){
        return 15;
    }

    public static String fetchCoach(){
        return "Gautam Gambhir";
    }

    public static void main(String[] args){

        System.out.println("Team: " + fetchTeam());
        System.out.println("Captain: " + fetchCaptain());
        System.out.println("Players: " + fetchPlayers());
        System.out.println("Coach: " + fetchCoach());

    }
}