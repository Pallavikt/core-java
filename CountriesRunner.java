class CountriesRunner {

    public static void main(String[] args) {

        String[] states = Countries.getStates("India");

        if(states != null) {
            for(String state : states) {
                System.out.println(state);
            }
        }
        else {
            System.out.println("Country Not Found");
        }
    }
}