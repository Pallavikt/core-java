class IplRunner {

    public static void main(String[] args) {

        Ipl ipl = new Ipl();

        IplTable table = new IplTable();

        // 2025 SEASON

        IplSeason season2025 = new IplSeason();
        season2025.year = 2025;

        IplTeams pbks2025 = new IplTeams();
        pbks2025.name = "PBKS";
        pbks2025.noOfMatches = 14;
        pbks2025.won = 9;
        pbks2025.lost = 4;
        pbks2025.nrr = "+0.372";
        pbks2025.pts = 19;
		
        int pbks2025last[] = {1,1,0,1,1};
        pbks2025.last5 = pbks2025last;


        IplTeams rcb2025 = new IplTeams();
        rcb2025.name = "RCB";
        rcb2025.noOfMatches = 14;
        rcb2025.won = 9;
        rcb2025.lost = 4;
        rcb2025.nrr = "+0.301";
        rcb2025.pts = 19;

        int rcb2025last[] = {1,1,1,0,1};
        rcb2025.last5 = rcb2025last;


        IplTeams gt2025 = new IplTeams();
        gt2025.name = "GT";
        gt2025.noOfMatches = 14;
        gt2025.won = 9;
        gt2025.lost = 5;
        gt2025.nrr = "+0.254";
        gt2025.pts = 18;

        int gt2025last[] = {1,0,1,1,0};
        gt2025.last5 = gt2025last;


        IplTeams mi2025 = new IplTeams();
        mi2025.name = "MI";
        mi2025.noOfMatches = 14;
        mi2025.won = 8;
        mi2025.lost = 6;
        mi2025.nrr = "+0.308";
        mi2025.pts = 16;

        int mi2025last[] = {0,1,1,0,1};
        mi2025.last5 = mi2025last;


        IplTeams lsg2025 = new IplTeams();
        lsg2025.name = "LSG";
        lsg2025.noOfMatches = 14;
        lsg2025.won = 6;
        lsg2025.lost = 8;
        lsg2025.nrr = "-0.376";
        lsg2025.pts = 12;

        int lsg2025last[] = {0,1,0,0,1};
        lsg2025.last5 = lsg2025last;


        IplTeams dc2025 = new IplTeams();
        dc2025.name = "DC";
        dc2025.noOfMatches = 14;
        dc2025.won = 6;
        dc2025.lost = 7;
        dc2025.nrr = "-0.019";
        dc2025.pts = 13;

        int dc2025last[] = {0,0,1,0,1};
        dc2025.last5 = dc2025last;


        IplTeams srh2025 = new IplTeams();
        srh2025.name = "SRH";
        srh2025.noOfMatches = 14;
        srh2025.won = 6;
        srh2025.lost = 8;
        srh2025.nrr = "-0.428";
        srh2025.pts = 12;

        int srh2025last[] = {1,0,0,1,0};
        srh2025.last5 = srh2025last;


        IplTeams rr2025 = new IplTeams();
        rr2025.name = "RR";
        rr2025.noOfMatches = 14;
        rr2025.won = 4;
        rr2025.lost = 10;
        rr2025.nrr = "-0.549";
        rr2025.pts = 8;

        int rr2025last[] = {0,0,1,0,0};
        rr2025.last5 = rr2025last;


        IplTeams kkr2025 = new IplTeams();
        kkr2025.name = "KKR";
        kkr2025.noOfMatches = 14;
        kkr2025.won = 5;
        kkr2025.lost = 6;
        kkr2025.nrr = "-0.305";
        kkr2025.pts = 12;

        int kkr2025last[] = {0,1,0,1,0};
        kkr2025.last5 = kkr2025last;


        IplTeams csk2025 = new IplTeams();
        csk2025.name = "CSK";
        csk2025.noOfMatches = 14;
        csk2025.won = 4;
        csk2025.lost = 10;
        csk2025.nrr = "-0.647";
        csk2025.pts = 8;

        int csk2025last[] = {0,0,1,0,0};
        csk2025.last5 = csk2025last;

        // 2024 SEASON

        IplSeason season2024 = new IplSeason();

        season2024.year = 2024;


        IplTeams kkr2024 = new IplTeams();

        kkr2024.name = "KKR";
        kkr2024.noOfMatches = 14;
        kkr2024.won = 9;
        kkr2024.lost = 3;
        kkr2024.nrr = "+1.428";
        kkr2024.pts = 20;

        int kkr2024last[] = {1,1,1,1,1};
        kkr2024.last5 = kkr2024last;


        IplTeams srh2024 = new IplTeams();

        srh2024.name = "SRH";
        srh2024.noOfMatches = 14;
        srh2024.won = 8;
        srh2024.lost = 5;
        srh2024.nrr = "+0.414";
        srh2024.pts = 17;

        int srh2024last[] = {1,1,0,1,1};
        srh2024.last5 = srh2024last;


        IplTeams rr2024 = new IplTeams();

        rr2024.name = "RR";
        rr2024.noOfMatches = 14;
        rr2024.won = 8;
        rr2024.lost = 5;
        rr2024.nrr = "+0.273";
        rr2024.pts = 17;

        int rr2024last[] = {0,1,1,0,1};
        rr2024.last5 = rr2024last;


        IplTeams rcb2024 = new IplTeams();

        rcb2024.name = "RCB";
        rcb2024.noOfMatches = 14;
        rcb2024.won = 7;
        rcb2024.lost = 7;
        rcb2024.nrr = "+0.459";
        rcb2024.pts = 14;

        int rcb2024last[] = {1,1,1,1,1};
        rcb2024.last5 = rcb2024last;


        IplTeams csk2024 = new IplTeams();

        csk2024.name = "CSK";
        csk2024.noOfMatches = 14;
        csk2024.won = 7;
        csk2024.lost = 7;
        csk2024.nrr = "+0.392";
        csk2024.pts = 14;

        int csk2024last[] = {0,1,0,1,0};
        csk2024.last5 = csk2024last;


        IplTeams dc2024 = new IplTeams();

        dc2024.name = "DC";
        dc2024.noOfMatches = 14;
        dc2024.won = 7;
        dc2024.lost = 7;
        dc2024.nrr = "-0.377";
        dc2024.pts = 14;

        int dc2024last[] = {1,0,1,0,1};
        dc2024.last5 = dc2024last;


        IplTeams lsg2024 = new IplTeams();

        lsg2024.name = "LSG";
        lsg2024.noOfMatches = 14;
        lsg2024.won = 7;
        lsg2024.lost = 7;
        lsg2024.nrr = "-0.667";
        lsg2024.pts = 14;

        int lsg2024last[] = {0,1,0,0,1};
        lsg2024.last5 = lsg2024last;


        IplTeams gt2024 = new IplTeams();

        gt2024.name = "GT";
        gt2024.noOfMatches = 14;
        gt2024.won = 5;
        gt2024.lost = 7;
        gt2024.nrr = "-1.063";
        gt2024.pts = 12;

        int gt2024last[] = {0,1,0,1,0};
        gt2024.last5 = gt2024last;


        IplTeams pbks2024 = new IplTeams();

        pbks2024.name = "PBKS";
        pbks2024.noOfMatches = 14;
        pbks2024.won = 5;
        pbks2024.lost = 9;
        pbks2024.nrr = "-0.353";
        pbks2024.pts = 12;

        int pbks2024last[] = {1,0,1,0,0};
        pbks2024.last5 = pbks2024last;


        IplTeams mi2024 = new IplTeams();

        mi2024.name = "MI";
        mi2024.noOfMatches = 14;
        mi2024.won = 4;
        mi2024.lost = 10;
        mi2024.nrr = "-0.318";
        mi2024.pts = 8;

        int mi2024last[] = {0,0,1,0,0};
        mi2024.last5 = mi2024last;

        // 2023 SEASON

        IplSeason season2023 = new IplSeason();

        season2023.year = 2023;


        IplTeams gt2023 = new IplTeams();

        gt2023.name = "GT";
        gt2023.noOfMatches = 14;
        gt2023.won = 10;
        gt2023.lost = 4;
        gt2023.nrr = "+0.809";
        gt2023.pts = 20;

        int gt2023last[] = {1,1,1,0,1};
        gt2023.last5 = gt2023last;


        IplTeams csk2023 = new IplTeams();

        csk2023.name = "CSK";
        csk2023.noOfMatches = 14;
        csk2023.won = 8;
        csk2023.lost = 5;
        csk2023.nrr = "+0.652";
        csk2023.pts = 17;

        int csk2023last[] = {1,1,1,0,1};
        csk2023.last5 = csk2023last;


        IplTeams lsg2023 = new IplTeams();

        lsg2023.name = "LSG";
        lsg2023.noOfMatches = 14;
        lsg2023.won = 8;
        lsg2023.lost = 5;
        lsg2023.nrr = "+0.284";
        lsg2023.pts = 17;

        int lsg2023last[] = {1,0,1,1,0};
        lsg2023.last5 = lsg2023last;


        IplTeams mi2023 = new IplTeams();

        mi2023.name = "MI";
        mi2023.noOfMatches = 14;
        mi2023.won = 8;
        mi2023.lost = 6;
        mi2023.nrr = "-0.044";
        mi2023.pts = 16;

        int mi2023last[] = {1,1,0,1,1};
        mi2023.last5 = mi2023last;


        IplTeams rr2023 = new IplTeams();

        rr2023.name = "RR";
        rr2023.noOfMatches = 14;
        rr2023.won = 7;
        rr2023.lost = 7;
        rr2023.nrr = "+0.148";
        rr2023.pts = 14;

        int rr2023last[] = {0,0,1,1,0};
        rr2023.last5 = rr2023last;


        IplTeams rcb2023 = new IplTeams();

        rcb2023.name = "RCB";
        rcb2023.noOfMatches = 14;
        rcb2023.won = 7;
        rcb2023.lost = 7;
        rcb2023.nrr = "+0.135";
        rcb2023.pts = 14;

        int rcb2023last[] = {1,0,1,0,1};
        rcb2023.last5 = rcb2023last;


        IplTeams kkr2023 = new IplTeams();

        kkr2023.name = "KKR";
        kkr2023.noOfMatches = 14;
        kkr2023.won = 6;
        kkr2023.lost = 8;
        kkr2023.nrr = "-0.239";
        kkr2023.pts = 12;

        int kkr2023last[] = {0,1,0,1,0};
        kkr2023.last5 = kkr2023last;


        IplTeams pbks2023 = new IplTeams();

        pbks2023.name = "PBKS";
        pbks2023.noOfMatches = 14;
        pbks2023.won = 6;
        pbks2023.lost = 8;
        pbks2023.nrr = "-0.158";
        pbks2023.pts = 12;

        int pbks2023last[] = {1,0,0,1,0};
        pbks2023.last5 = pbks2023last;


        IplTeams dc2023 = new IplTeams();

        dc2023.name = "DC";
        dc2023.noOfMatches = 14;
        dc2023.won = 5;
        dc2023.lost = 9;
        dc2023.nrr = "-0.808";
        dc2023.pts = 10;

        int dc2023last[] = {0,1,0,0,1};
        dc2023.last5 = dc2023last;


        IplTeams srh2023 = new IplTeams();

        srh2023.name = "SRH";
        srh2023.noOfMatches = 14;
        srh2023.won = 4;
        srh2023.lost = 10;
        srh2023.nrr = "-0.590";
        srh2023.pts = 8;

        int srh2023last[] = {0,0,1,0,0};
        srh2023.last5 = srh2023last;

		// STORE ALL SEASONS
		IplSeason iplSeasons[] = {season2023,season2024,season2025};
		table.seasons = iplSeasons;
		
		IplTeams iplTeams2023[] = {gt2023,csk2023,lsg2023,mi2023,rr2023,
		rcb2023,kkr2023,pbks2023,dc2023,srh2023};
		season2023.teams = iplTeams2023;
		
		
		IplTeams iplTeams2024[] = {kkr2024,srh2024,rr2024,rcb2024,csk2024,
        dc2024,lsg2024,gt2024,pbks2024,mi2024};
		season2024.teams = iplTeams2024;
			
			
		IplTeams iplTeams2025[] = {pbks2025,rcb2025,gt2025,mi2025,lsg2025,dc2025,
		srh2025,rr2025,kkr2025,csk2025};
		season2025.teams = iplTeams2025;
			

        // HAS-A RELATIONSHIP

        ipl.table = table;

        // METHOD INVOCATION

        ipl.getIplInfo();

    }
}