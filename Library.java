class Library{

    static String libraryName;
    static String librarianName;
    static String location;
    static String libraryType;
    static String phoneNumber;
    static int totalBooks;
    static double rating;
    static String workingHours;

    public static boolean createLibrary(String lName, String librarian,
            String place, String type,
            String phone, int books,
            double libraryRating, String hours){

        boolean isCreated = false;

        libraryName = lName;
        librarianName = librarian;
        location = place;
        libraryType = type;
        phoneNumber = phone;
        totalBooks = books;
        rating = libraryRating;
        workingHours = hours;

        isCreated = true;

        return isCreated;
    }

    public static void getLibraryData(){

        System.out.println("Library Name : " + libraryName);
        System.out.println("Librarian Name : " + librarianName);
        System.out.println("Location : " + location);
        System.out.println("Library Type : " + libraryType);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Total Books : " + totalBooks);
        System.out.println("Rating : " + rating);
        System.out.println("Working Hours : " + workingHours);
        System.out.println("--------------------------------");

    }

}