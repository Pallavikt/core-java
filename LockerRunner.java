class LockerRunner {

    public static void main(String[] args) {

        Locker locker1 = new Locker(
            "Godrej", "Steel", "Grey", "Office",
            15000, 6.0, 3.0, "Digital",
            100, true
        );

        Locker locker2 = new Locker(
            "Ozone", "Steel", "Black", "Home",
            10000, 5.0, 2.5, "Key",
            80, false
        );

        Locker locker3 = new Locker(
            "Godrej", "Steel", "Blue", "Bank",
            25000, 7.0, 4.0, "Electronic",
            150, true
        );

        locker1.displayInfo();
        locker2.displayInfo();
        locker3.displayInfo();
    }
}