class PosterRunner {

    public static void main(String[] args) {

        Poster poster1 = new Poster();
        poster1.posterId = 1;
        poster1.posterSize = "18*24";
        poster1.posterContent = "Please Switch OFF Light & Fan";
        poster1.posterPrice = 210;

        int posterId = poster1.posterId;
        String posterSize = poster1.posterSize;
        String posterContent = poster1.posterContent;
        int posterPrice = poster1.posterPrice;

        System.out.println("Poster ID: " + posterId);
        System.out.println("Poster Size: " + posterSize);
        System.out.println("Poster Content: " + posterContent);
        System.out.println("Poster Price: " + posterPrice);

        Poster poster2 = new Poster();
        poster2.posterId = 2;
        poster2.posterSize = "14*24";
        poster2.posterContent = "Please Keep the chairs Back into place";
        poster2.posterPrice = 100;

        int posterId2 = poster2.posterId;
        String posterSize2 = poster2.posterSize;
        String posterContent2 = poster2.posterContent;
        int posterPrice2 = poster2.posterPrice;

        System.out.println("Poster ID: " + posterId2);
        System.out.println("Poster Size: " + posterSize2);
        System.out.println("Poster Content: " + posterContent2);
        System.out.println("Poster Price: " + posterPrice2);

        Poster poster3 = new Poster();
        poster3.posterId = 3;
        poster3.posterSize = "14*20";
        poster3.posterContent = "We are NOT responsible for any personal belongings left behind.";
        poster3.posterPrice = 220;

        int posterId3 = poster3.posterId;
        String posterSize3 = poster3.posterSize;
        String posterContent3 = poster3.posterContent;
        int posterPrice3 = poster3.posterPrice;

        System.out.println("Poster ID: " + posterId3);
        System.out.println("Poster Size: " + posterSize3);
        System.out.println("Poster Content: " + posterContent3);
        System.out.println("Poster Price: " + posterPrice3);

        Poster poster4 = new Poster();
        poster4.posterId = 4;
        poster4.posterSize = "18*26";
        poster4.posterContent = "The More You Learn The More You Earn";
        poster4.posterPrice = 130;

        int posterId4 = poster4.posterId;
        String posterSize4 = poster4.posterSize;
        String posterContent4 = poster4.posterContent;
        int posterPrice4 = poster4.posterPrice;

        System.out.println("Poster ID: " + posterId4);
        System.out.println("Poster Size: " + posterSize4);
        System.out.println("Poster Content: " + posterContent4);
        System.out.println("Poster Price: " + posterPrice4);
    }
}