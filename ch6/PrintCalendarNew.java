package ch6;

public class PrintCalendarNew {
    public static void main(String[] args) {
        int year = 2018;
        int month = 3;

        printMonth(year, month);
    }


    public static boolean isLeapYear(int year) {
        //add logic to return true for leap year, false for non-leap year
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        //add logic to return number of days in month
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int totalDays = 0;

        // add logic to count total days for all prior years from 1800
        // 365 days for each year, 365 for leap years

        // add logic to count days for each month through the requested year


        return totalDays;
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_1_1_1800 = 3;   // Known day of week
        int totalDays = getTotalNumberOfDays(year, month);
        //calc start day
        //return start day
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int daysInMonth = getNumberOfDaysInMonth(year, month);
        // Pad space before the first day of the month by
        // adding logic to print correct number of spaces "    "

        //add logic to print numbers 1 to daysInMonth
        //logic needs to include a test newline after each 7 days

    }

    public static String getMonthName(int month) {
        //add logic to return a string for month name, 1 = "January"
    }

    public static void printMonthTitle(int year, int month) {
        String monthName = getMonthName(month,year);
        // add logic print month title and a row of "-"s
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }
}
