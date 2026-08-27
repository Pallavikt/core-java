class Table {

    Season seasons[];

    public void getTableInfo() {

        for(Season year : seasons) {

            year.getSeasonInfo();
        }
    }
}