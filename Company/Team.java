class Team {

    public static void develop() {

        System.out.println("develop Started");

        TeamLead.guide();
        SeniorEngineer.design();
        Engineer.code();
        DevOps.cicd();

        System.out.println("develop Ended");
    }
}