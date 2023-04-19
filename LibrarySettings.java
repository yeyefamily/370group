public class LibrarySettings {
    // Private constructor to prevent outside instantiation
    private LibrarySettings() {}

    // Singleton instance variable
    private static LibrarySettings instance;

    // get method for Singleton instance
    public static LibrarySettings getInstance() {
        if (instance == null) {
            instance = new LibrarySettings();
        }
        return instance;
    }

    // Library operating hours
    private static final String[] WEEKDAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    private static final String[] WEEKENDS = {"Saturday", "Sunday"};
    private static final int OPEN_HOUR = 10;
    private static final int CLOSE_HOUR = 5;

    // Library borrowing policies
    private static final int MAX_BORROWING_DAYS = 120;
    private static final double OVERDUE_FINE_PER_DAY = 1.0;
    private static final int MAX_ITEMS_BORROWED = 5;

    // Get library operating hours
    public String[] getWeekdays() {
        return WEEKDAYS;
    }

    public String[] getWeekends() {
        return WEEKENDS;
    }

    public int getOpenHour() {
        return OPEN_HOUR;
    }

    public int getCloseHour() {
        return CLOSE_HOUR;
    }

    // Get borrowing policies
    public int getMaxBorrowingDays() {
        return MAX_BORROWING_DAYS;
    }

    public double getOverdueFinePerDay() {
        return OVERDUE_FINE_PER_DAY;
    }

    public int getMaxItemsBorrowed() {
        return MAX_ITEMS_BORROWED;
    }



    // get library instance
    public static void main(String[] args) {
        LibrarySettings settings = LibrarySettings.getInstance();

        // Print out library operating hours
        System.out.println("Library operating hours:");
        System.out.println("Weekdays:");
        for (String weekday : settings.getWeekdays()) {
            System.out.println(weekday + ": " + settings.getOpenHour() + "am - " + settings.getCloseHour() + "pm");
        }
        System.out.println("Weekends: Closed");

        // Print out borrowing policies/rules
        System.out.println("Welcome to BOLD Library System (BLS)!");
        System.out.println("Library borrowing policies:");
        System.out.println("Maximum borrowing period: " + settings.getMaxBorrowingDays() + " days");
        System.out.println("Overdue fine per day: $" + settings.getOverdueFinePerDay());
        System.out.println("Maximum items that can be borrowed(items): " + settings.getMaxItemsBorrowed());
    }
}
