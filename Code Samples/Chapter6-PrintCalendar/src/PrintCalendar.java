import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        int year = 2018;
        int month = 3;

        printMonth(year, month);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                else {
                    return 28;
                }
        }

        return 0;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int totalDays = 0;
        // Count total days for all prior years
        for (int countYear = 1800; countYear < year; countYear++) {
            if (isLeapYear(countYear)) {
                totalDays += 366;
            }
            else {
                totalDays += 365;
            }
        }
        // Count days through the requested year
        for (int countMonth = 1; countMonth < month; countMonth++) {
            totalDays += getNumberOfDaysInMonth(year, countMonth);
        }

        return totalDays;
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_1_1_1800 = 3;   // Known day of week
        int totalDays = getTotalNumberOfDays(year, month);

        return (totalDays + START_DAY_1_1_1800) % 7;
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int daysInMonth = getNumberOfDaysInMonth(year, month);
        // Pad space before the first day of the month
        for (int position = 0; position < startDay; position++) {
            System.out.print("    ");   // 4 spaces
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static String getMonthName(int month) {
        switch (month) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }

        return "error";
    }

    public static void printMonthTitle(int year, int month) {
        System.out.printf("         %s %d\n", getMonthName(month), year);
        System.out.println("--------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }
}
