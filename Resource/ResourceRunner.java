class ResourceRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");
		
		Resource resource = new Resource();
		resource.develop();

		System.out.println("____________________");

        Resource r = new Developer();
        r.develop();

        System.out.println("Main Ended");
    }
}