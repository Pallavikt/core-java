class Teams {

    String name;
    int noOfMatches;
    int won;
    int lost;
    String nrr;
    int pts;
    int last5[];

    public void getTeamsInfo() {

        System.out.print(name + "             "+ noOfMatches + "    "+ won + "    "
                + lost + "   "+ nrr + "     "+ pts + "     ");

        for(int last : last5) {

            System.out.print(last + "  ");
        }

        System.out.println();
    }
}