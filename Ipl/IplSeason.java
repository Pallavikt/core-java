class IplSeason {

    int year;
    IplTeams teams[];

    public void getSeasonInfo() {

        System.out.println();

        System.out.println("Men's IPL Season: " + year);

        System.out.println("Team            M    W    L    NRR       Pts    last5");

        for(IplTeams team : teams) {

            team.getTeamsInfo();
        }

        System.out.println("-----------------------------------------------");
    }
}