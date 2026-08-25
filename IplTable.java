class IplTable {

    IplSeason seasons[];

    public void getTableInfo() {

        for(IplSeason year : seasons) {

            year.getSeasonInfo();
        }
    }
}