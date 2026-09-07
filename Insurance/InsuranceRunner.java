class InsuranceRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        HealthInsurance healthInsurance = new HealthInsurance();

        healthInsurance.claim();

        System.out.println("Main Ended");
    }
}