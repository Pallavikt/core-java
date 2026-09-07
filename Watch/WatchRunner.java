class WatchRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

		Watch watch = new Watch();
		watch.showTime();
		
		System.out.println("_____________________");
		
        Watch w = new Smartwatch();
        w.showTime();

        System.out.println("Main Ended");
    }
}