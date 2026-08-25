class WplRunner {

    public static void main(String[] args) {

        Wpl wpl = new Wpl();

        Table table = new Table();

        // 2023 SEASON
      
        Season season2023 = new Season();
        season2023.year = 2023;

        Teams dc2023 = new Teams();

        dc2023.name = "DC";
        dc2023.noOfMatches = 8;
        dc2023.won = 6;
        dc2023.lost = 2;
        dc2023.nrr = "+1.856";
        dc2023.pts = 12;

        int dcFive2023[] = {1, 1, 0, 1, 1};
        dc2023.last5 = dcFive2023;


        Teams mi2023 = new Teams();

        mi2023.name = "MI";
        mi2023.noOfMatches = 8;
        mi2023.won = 6;
        mi2023.lost = 2;
        mi2023.nrr = "+1.711";
        mi2023.pts = 12;

        int miFive2023[] = {1, 0, 1, 1, 1};
        mi2023.last5 = miFive2023;


        Teams upw2023 = new Teams();

        upw2023.name = "UPW";
        upw2023.noOfMatches = 8;
        upw2023.won = 4;
        upw2023.lost = 4;
        upw2023.nrr = "-0.200";
        upw2023.pts = 8;

        int upwFive2023[] = {0, 1, 1, 0, 0};
        upw2023.last5 = upwFive2023;


        Teams rcb2023 = new Teams();

        rcb2023.name = "RCB";
        rcb2023.noOfMatches = 8;
        rcb2023.won = 2;
        rcb2023.lost = 6;
        rcb2023.nrr = "-1.137";
        rcb2023.pts = 4;

        int rcbFive2023[] = {0, 1, 1, 0, 0};
        rcb2023.last5 = rcbFive2023;

        Teams gg2023 = new Teams();

        gg2023.name = "GG";
        gg2023.noOfMatches = 8;
        gg2023.won = 2;
        gg2023.lost = 6;
        gg2023.nrr = "-2.220";
        gg2023.pts = 4;

        int ggFive2023[] = {0, 0, 1, 0, 0};
        gg2023.last5 = ggFive2023;


        Teams teams2023[] = {dc2023,mi2023,upw2023,rcb2023,gg2023};

        // 2024 SEASON
       
        Season season2024 = new Season();
        season2024.year = 2024;


        Teams dc2024 = new Teams();

        dc2024.name = "DC";
        dc2024.noOfMatches = 8;
        dc2024.won = 6;
        dc2024.lost = 2;
        dc2024.nrr = "+1.198";
        dc2024.pts = 12;

        int dcFive2024[] = {1, 1, 0, 1, 1};
        dc2024.last5 = dcFive2024;


        Teams mi2024 = new Teams();

        mi2024.name = "MI";
        mi2024.noOfMatches = 8;
        mi2024.won = 5;
        mi2024.lost = 3;
        mi2024.nrr = "+0.024";
        mi2024.pts = 10;

        int miFive2024[] = {0, 1, 1, 0, 1};
        mi2024.last5 = miFive2024;


        Teams rcb2024 = new Teams();

        rcb2024.name = "RCB";
        rcb2024.noOfMatches = 8;
        rcb2024.won = 4;
        rcb2024.lost = 4;
        rcb2024.nrr = "+0.306";
        rcb2024.pts = 8;

        int rcbFive2024[] = {1, 0, 0, 1, 0};
        rcb2024.last5 = rcbFive2024;


        Teams upw2024 = new Teams();

        upw2024.name = "UPW";
        upw2024.noOfMatches = 8;
        upw2024.won = 3;
        upw2024.lost = 5;
        upw2024.nrr = "-0.371";
        upw2024.pts = 6;

        int upwFive2024[] = {0, 1, 0, 0, 1};
        upw2024.last5 = upwFive2024;


        Teams gg2024 = new Teams();

        gg2024.name = "GG";
        gg2024.noOfMatches = 8;
        gg2024.won = 2;
        gg2024.lost = 6;
        gg2024.nrr = "-1.158";
        gg2024.pts = 4;

        int ggFive2024[] = {0, 1, 0, 1, 0};
        gg2024.last5 = ggFive2024;


        Teams teams2024[] = {dc2024,mi2024,rcb2024,upw2024,gg2024};

        // 2025 SEASON

        Season season2025 = new Season();
        season2025.year = 2025;


        Teams dc2025 = new Teams();

        dc2025.name = "DC";
        dc2025.noOfMatches = 8;
        dc2025.won = 5;
        dc2025.lost = 3;
        dc2025.nrr = "+0.396";
        dc2025.pts = 10;

        int dcFive2025[] = {0, 1, 1, 1, 0};
        dc2025.last5 = dcFive2025;


        Teams mi2025 = new Teams();

        mi2025.name = "MI";
        mi2025.noOfMatches = 8;
        mi2025.won = 5;
        mi2025.lost = 3;
        mi2025.nrr = "+0.192";
        mi2025.pts = 10;

        int miFive2025[] = {0, 1, 1, 0, 1};
        mi2025.last5 = miFive2025;


        Teams gg2025 = new Teams();

        gg2025.name = "GG";
        gg2025.noOfMatches = 8;
        gg2025.won = 4;
        gg2025.lost = 4;
        gg2025.nrr = "+0.228";
        gg2025.pts = 8;

        int ggFive2025[] = {0, 1, 1, 1, 0};
        gg2025.last5 = ggFive2025;


        Teams rcb2025 = new Teams();

        rcb2025.name = "RCB";
        rcb2025.noOfMatches = 8;
        rcb2025.won = 3;
        rcb2025.lost = 5;
        rcb2025.nrr = "-0.196";
        rcb2025.pts = 6;

        int rcbFive2025[] = {1, 0, 0, 0, 0};
        rcb2025.last5 = rcbFive2025;


        Teams upw2025 = new Teams();

        upw2025.name = "UPW";
        upw2025.noOfMatches = 8;
        upw2025.won = 3;
        upw2025.lost = 5;
        upw2025.nrr = "-0.624";
        upw2025.pts = 6;

        int upwFive2025[] = {1, 0, 0, 0, 1};
        upw2025.last5 = upwFive2025;


        Teams teams2025[] = {dc2025,mi2025,gg2025,rcb2025,upw2025};
		
        // 2026 SEASON
       
        Season season2026 = new Season();
        season2026.year = 2026;


        Teams rcb2026 = new Teams();

        rcb2026.name = "RCB";
        rcb2026.noOfMatches = 8;
        rcb2026.won = 6;
        rcb2026.lost = 2;
        rcb2026.nrr = "+1.247";
        rcb2026.pts = 12;

        int rcbFive2026[] = {1, 0, 0, 1, 1};

        rcb2026.last5 = rcbFive2026;


        Teams gg2026 = new Teams();

        gg2026.name = "GG";
        gg2026.noOfMatches = 8;
        gg2026.won = 5;
        gg2026.lost = 3;
        gg2026.nrr = "-0.168";
        gg2026.pts = 10;

        int ggFive2026[] = {1, 1, 1, 0, 0};

        gg2026.last5 = ggFive2026;


        Teams dc2026 = new Teams();

        dc2026.name = "DC";
        dc2026.noOfMatches = 8;
        dc2026.won = 4;
        dc2026.lost = 4;
        dc2026.nrr = "-0.055";
        dc2026.pts = 8;

        int dcFive2026[] = {1, 0, 1, 1, 0};

        dc2026.last5 = dcFive2026;


        Teams mi2026 = new Teams();

        mi2026.name = "MI";
        mi2026.noOfMatches = 8;
        mi2026.won = 3;
        mi2026.lost = 5;
        mi2026.nrr = "+0.059";
        mi2026.pts = 6;

        int miFive2026[] = {0, 1, 0, 0, 0};

        mi2026.last5 = miFive2026;


        Teams upw2026 = new Teams();

        upw2026.name = "UPW";
        upw2026.noOfMatches = 8;
        upw2026.won = 2;
        upw2026.lost = 6;
        upw2026.nrr = "-1.076";
        upw2026.pts = 4;

        int upwFive2026[] = {0, 0, 0, 1, 1};
        upw2026.last5 = upwFive2026;
		
        Teams teams2026[] = {rcb2026,gg2026,dc2026,mi2026,upw2026};

		
		// STORE ALL SEASONS IN TABLE
		Season seasons[] = {season2023,season2024,season2025,season2026};
		
		wpl.table = table;
		
		table.seasons = seasons;
		
		season2023.teams = teams2023;
		season2024.teams = teams2024;
		season2025.teams = teams2025;
		season2026.teams = teams2026;

        // HAS-A RELATIONSHIP
        wpl.table = table;

        // METHOD INVOCATION
       
        wpl.getWplInfo();

    }
}