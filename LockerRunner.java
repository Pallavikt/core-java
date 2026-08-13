class LockerRunner {

    public static void main(String[] args) {

        Locker locker1 = new Locker();

        Locker locker2 = new Locker(
                "Godrej"
        );

        Locker locker3 = new Locker(
                "Godrej", "Steel"
        );

        Locker locker4 = new Locker(
                "Godrej", "Steel", "Grey"
        );

        Locker locker5 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office"
        );

        Locker locker6 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000
        );

        Locker locker7 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000, 6.0
        );

        Locker locker8 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000, 6.0, 3.0
        );

        Locker locker9 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000, 6.0, 3.0,
                "Digital"
        );

        Locker locker10 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000, 6.0, 3.0,
                "Digital", 100
        );

        Locker locker11 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000, 6.0, 3.0,
                "Digital", 100, true
        );

        Locker locker12 = new Locker(
                "Godrej", "Steel", "Grey",
                "Office", 15000, 6.0, 3.0,
                "Digital", 100, true, 10
        );


        locker1.displayInfo();
        locker2.displayInfo();
        locker3.displayInfo();
        locker4.displayInfo();
        locker5.displayInfo();
        locker6.displayInfo();
        locker7.displayInfo();
        locker8.displayInfo();
        locker9.displayInfo();
        locker10.displayInfo();
        locker11.displayInfo();
        locker12.displayInfo();

    }
}