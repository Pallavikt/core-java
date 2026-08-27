class Season {

    int year;
    Teams teams[];

    public void getSeasonInfo() {

        System.out.println();

        System.out.println("Women's IPL Season: " + year);

        System.out.println("Team            M    W    L    NRR       Pts    last5");

        for(Teams team : teams) {

            team.getTeamsInfo();
        }

        System.out.println("-----------------------------------------------");
    }
}